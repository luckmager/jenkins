package com.mycompany.app;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
	Scanner reader = new Scanner(System.in);
	System.out.println("Wat is je leeftijd?");
	int leeftijd = reader.nextInt();
	
	if(leeftijd < 0)
	{
		System.out.println("Dat kan niet.");
	}
	
	else if(leeftijd > 0 && leeftijd < 18)
	{
		System.out.println("Je bent nog jong.");
	}
	
	else if(leeftijd >= 18)
	{
		System.out.println("Je bent volwassen.");
	}
    }
}
