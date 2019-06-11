package com.place;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Place {

	public static void main(String[] args)  {
	 
		try {
			BufferedReader in = new BufferedReader (new FileReader("data.txt"));
			String line = in.readLine();
			
			
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		    } catch (FileNotFoundException e) {
			e.printStackTrace();
		    }
		
		
		
	}
	


