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
package proguard.optimize.info;

import proguard.classfile.*;
import proguard.classfile.attribute.CodeAttribute;
import proguard.classfile.constant.*;
import proguard.classfile.constant.visitor.ConstantVisitor;
import proguard.classfile.instruction.*;
import proguard.classfile.instruction.visitor.InstructionVisitor;
import proguard.classfile.util.SimplifiedVisitor;
import proguard.classfile.visitor.MemberVisitor;

/**
 * This InstructionVisitor counts the number of times methods are invoked from
 * the instructions that are visited.
 *
 * @author Eric Lafortune
 */
public class MethodInvocationMarker
extends      SimplifiedVisitor
implements   InstructionVisitor,
             ConstantVisitor,
             MemberVisitor
{
    // Implementations for InstructionVisitor.

    public void visitAnyInstruction(Clazz clazz, Method method, CodeAttribute codeAttribute, int offset, Instruction instruction) {}


    public void visitConstantInstruction(Clazz clazz, Method method, CodeAttribute codeAttribute, int offset, ConstantInstruction constantInstruction)
    {
        clazz.constantPoolEntryAccept(constantInstruction.constantIndex, this);
    }


    // Implementations for ConstantVisitor.

    public void visitAnyConstant(Clazz clazz, Constant constant) {}


    public void visitStringConstant(Clazz clazz, StringConstant stringConstant)
    {
        // Mark the referenced method, if any.
        stringConstant.referencedMemberAccept(this);
    }


    public void visitAnyMethodrefConstant(Clazz clazz, RefConstant refConstant)
    {
        // Mark the referenced method.
        refConstant.referencedMemberAccept(this);
    }


    // Implementations for MemberVisitor.

    public void visitAnyMember(Clazz Clazz, Member member) {}


    public void visitProgramMethod(ProgramClass programClass, ProgramMethod programMethod)
    {
        incrementInvocationCount(programMethod);
    }


    // Small utility methods.

    private static void incrementInvocationCount(Method method)
    {
        MethodOptimizationInfo info = MethodOptimizationInfo.getMethodOptimizationInfo(method);
        if (info != null)
        {
            info.incrementInvocationCount();
        }
    }


    /**
     * Returns the number of times the given method was invoked by the
     * instructions that were visited.
     */
    public static int getInvocationCount(Method method)
    {
        MethodOptimizationInfo info = MethodOptimizationInfo.getMethodOptimizationInfo(method);
        return info != null ? info.getInvocationCount() :
                              Integer.MAX_VALUE;
    }
}
