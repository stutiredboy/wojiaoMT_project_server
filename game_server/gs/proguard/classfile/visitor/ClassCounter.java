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
package proguard.classfile.visitor;

import proguard.classfile.*;

/**
 * This ClassVisitor counts the number of classes that has been visited.
 *
 * @author Eric Lafortune
 */
public class ClassCounter implements ClassVisitor
{
    private int count;


    /**
     * Returns the number of classes that has been visited so far.
     */
    public int getCount()
    {
        return count;
    }


    // Implementations for ClassVisitor.

    public void visitLibraryClass(LibraryClass libraryClass)
    {
        count++;
    }


    public void visitProgramClass(ProgramClass programClass)
    {
        count++;
    }
}
