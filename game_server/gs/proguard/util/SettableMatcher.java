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
package proguard.util;

/**
 * This StringMatcher delegates to a another StringMatcher that can be set
 * after this StringMatcher has been constructed.
 *
 * @author Eric Lafortune
 */
public class SettableMatcher implements StringMatcher
{
    private StringMatcher matcher;


    public void setMatcher(StringMatcher matcher)
    {
        this.matcher = matcher;
    }


    // Implementations for StringMatcher.

    public boolean matches(String string)
    {
        return matcher.matches(string);
    }
}
