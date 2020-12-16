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
package proguard.classfile.attribute.annotation;

import proguard.classfile.*;
import proguard.classfile.attribute.Attribute;
import proguard.classfile.attribute.annotation.visitor.ElementValueVisitor;
import proguard.classfile.attribute.visitor.AttributeVisitor;

/**
 * This Attribute represents an annotation default attribute.
 *
 * @author Eric Lafortune
 */
public class AnnotationDefaultAttribute extends Attribute
{
    public ElementValue defaultValue;


    /**
     * Creates an uninitialized AnnotationDefaultAttribute.
     */
    public AnnotationDefaultAttribute()
    {
    }


    /**
     * Creates an initialized AnnotationDefaultAttribute.
     */
    public AnnotationDefaultAttribute(int          u2attributeNameIndex,
                                      ElementValue defaultValue)
    {
        super(u2attributeNameIndex);

        this.defaultValue = defaultValue;
    }


    /**
     * Applies the given visitor to the default element value.
     */
    public void defaultValueAccept(Clazz clazz, ElementValueVisitor elementValueVisitor)
    {
        defaultValue.accept(clazz, null, elementValueVisitor);
    }


    // Implementations for Attribute.

    public void accept(Clazz clazz, Method method, AttributeVisitor attributeVisitor)
    {
        attributeVisitor.visitAnnotationDefaultAttribute(clazz, method, this);
    }
}
