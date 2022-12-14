/*
 * ProGuard -- shrinking, optimization, obfuscation, and preverification
 *             of Java bytecode.
 *
 * Copyright (c) 2002-2015 Eric Lafortune @ GuardSquare
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package proguard.io;

import proguard.classfile.*;
import proguard.classfile.io.ProgramClassWriter;

import java.io.*;


/**
 * This DataEntryReader reads class entries and writes their corresponding
 * versions from the ClassPool to a given DataEntryWriter.
 *
 * @author Eric Lafortune
 */
public class ClassRewriter implements DataEntryReader
{
    private final ClassPool       classPool;
    private final DataEntryWriter dataEntryWriter;


    public ClassRewriter(ClassPool       classPool,
                         DataEntryWriter dataEntryWriter)
    {
        this.classPool       = classPool;
        this.dataEntryWriter = dataEntryWriter;
    }


    // Implementations for DataEntryReader.

    public void read(DataEntry dataEntry) throws IOException
    {
        String inputName = dataEntry.getName();
        String className = inputName.substring(0, inputName.length() - ClassConstants.CLASS_FILE_EXTENSION.length());

        // Find the modified class corrsponding to the input entry.
        ProgramClass programClass = (ProgramClass)classPool.getClass(className);
        if (programClass != null)
        {
            // Rename the data entry if necessary.
            String newClassName = programClass.getName();
            if (!className.equals(newClassName))
            {
                dataEntry = new RenamedDataEntry(dataEntry, newClassName + ClassConstants.CLASS_FILE_EXTENSION);
            }

            // Get the output entry corresponding to this input entry.
            OutputStream outputStream = dataEntryWriter.getOutputStream(dataEntry);
            if (outputStream != null)
            {
                // Write the class to the output entry.
                DataOutputStream classOutputStream = new DataOutputStream(outputStream);

                new ProgramClassWriter(classOutputStream).visitProgramClass(programClass);

                classOutputStream.flush();
            }
        }
    }
}
