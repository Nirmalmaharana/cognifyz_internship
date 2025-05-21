package com.nirmal.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileStorage 
{
	public static void main(String[] args)
	{
		try {
			//creating a file in the project folder
			File file=new File("TestFile.txt");
			//create char array for Charcter reading purpose
			char[] charData=new char[(int)file.length()];
			FileReader fid=new FileReader(file);
			//read the charcter data from Testfile.txt file
			fid.read(charData);
			String data=new String(charData);
			System.out.println(data);
		
			//creating file for Write operation in the project folder
			FileWriter fiw=new FileWriter("WriteTestFileData.txt");
			//Write the charcter stream in the WriteTestFileData.txt file
			fiw.write(charData);
			//close the Stream class
			fid.close();fiw.close();
				
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
