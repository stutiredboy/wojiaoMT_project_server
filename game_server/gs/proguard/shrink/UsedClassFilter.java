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
package proguard.shrink;

import proguard.classfile.*;
import proguard.classfile.visitor.ClassVisitor;

/**
 * This ClassVisitor delegates all its method calls to another ClassVisitor,
 * but only for Clazz objects that are marked as used.
 *
 * @see UsageMarker
 *
 * @author Eric Lafortune
 */
public class UsedClassFilter
implements   ClassVisitor
{
    private final UsageMarker  usageMarker;
    private final ClassVisitor classVisitor;


    /**
     * Creates a new UsedClassFilter.
     * @param usageMarker  the usage marker that is used to mark the classes
     *                     and class members.
     * @param classVisitor the class visitor to which the visiting will be
     *                     delegated.
     */
    public UsedClassFilter(UsageMarker  usageMarker,
                           ClassVisitor classVisitor)
    {
        this.usageMarker  = usageMarker;
        this.classVisitor = classVisitor;
    }


    // Implementations for ClassVisitor.

    public void visitProgramClass(ProgramClass programClass)
    {
        if (usageMarker.isUsed(programClass))
        {
            classVisitor.visitProgramClass(programClass);
        }
    }


    public void visitLibraryClass(LibraryClass libraryClass)
    {
        if (usageMarker.isUsed(libraryClass))
        {
            classVisitor.visitLibraryClass(libraryClass);
        }
    }
}
