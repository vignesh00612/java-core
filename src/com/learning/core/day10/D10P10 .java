package com.learning.core.day10;

import java.util.regex.Pattern;

public class D10P10 {
	public boolean validateUsername(String name)
	{

        if (name == null || name.isEmpty())
        {
        	return false;

        }
        return name.matches("^[a-zA-Z]+$");

    }
	public boolean validatePassword(String password) 
	{
		if ((password.isBlank()==false)&& (password.length() > 8)) 
		{
			if(Pattern.compile("[A-Z]").matcher(password)!= null && Pattern.compile("[a-z]").matcher(password)!= null && Pattern.compile("[0-9]").matcher(password)!= null) 
			{
				return true;
			}
			
		}
		return false;
    }
}