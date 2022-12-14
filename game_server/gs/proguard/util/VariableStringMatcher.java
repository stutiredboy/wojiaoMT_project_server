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
 * This StringMatcher tests whether strings start with a specified variable
 * string and then match another given StringMatcher.
 *
 * @author Eric Lafortune
 */
public class VariableStringMatcher implements StringMatcher
{
    private final char[]        allowedCharacters;
    private final char[]        disallowedCharacters;
    private final int           minimumLength;
    private final int           maximumLength;
    private final StringMatcher nextMatcher;


    public VariableStringMatcher(char[]        allowedCharacters,
                                 char[]        disallowedCharacters,
                                 int           minimumLength,
                                 int           maximumLength,
                                 StringMatcher nextMatcher)
    {
        this.allowedCharacters    = allowedCharacters;
        this.disallowedCharacters = disallowedCharacters;
        this.minimumLength        = minimumLength;
        this.maximumLength        = maximumLength;
        this.nextMatcher          = nextMatcher;
    }

    // Implementations for StringMatcher.

    public boolean matches(String string)
    {
        if (string.length() < minimumLength)
        {
            return false;
        }

        // Check the first minimum number of characters.
        for (int index = 0; index < minimumLength; index++)
        {
            if (!isAllowedCharacter(string.charAt(index)))
            {
                return false;
            }
        }

        int maximumLength = Math.min(this.maximumLength, string.length());

        // Check the remaining characters, up to the maximum number.
        for (int index = minimumLength; index < maximumLength; index++)
        {
            if (nextMatcher.matches(string.substring(index)))
            {
                return true;
            }

            if (!isAllowedCharacter(string.charAt(index)))
            {
                return false;
            }
        }

        // Check the remaining characters in the string.
        return nextMatcher.matches(string.substring(maximumLength));
    }


    // Small utility methods.

    /**
     * Returns whether the given character is allowed in the variable string.
     */
    private boolean isAllowedCharacter(char character)
    {
        // Check the allowed characters.
        if (allowedCharacters != null)
        {
            for (int index = 0; index < allowedCharacters.length; index++)
            {
                if (allowedCharacters[index] == character)
                {
                    return true;
                }
            }

            return false;
        }

        // Check the disallowed characters.
        if (disallowedCharacters != null)
        {
            for (int index = 0; index < disallowedCharacters.length; index++)
            {
                if (disallowedCharacters[index] == character)
                {
                    return false;
                }
            }
        }

        // Any remaining character is allowed.
        return true;
    }
}
