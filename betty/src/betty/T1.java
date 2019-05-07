package betty;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class T1 {


	
	public static void main(String[] args ) {
		// TODO Auto-generated method stub
       int n = Integer.parseInt("36");
       File dir = new File("C:\\Windows");
       if(dir.exists() && dir.isDirectory());{
       File[]files = dir.listFiles();
        }
         for (File f  :files) {
        	if(f.isFile()) 
               System.out.println(f.getName());
       }
		
		//  int n = Integer.parseInt("36");
        // File file = new File("aa.txt");
        /*  System.out.println(file.exists());
          System.out.println(file.canRead());
          System.out.println(file.canExecute());
          System.out.println(file.isDirectory());*/
          /*if(file.exists());{
          System.out.println(file.length());
          System.out.println(file.getAbsolutePath());
          }
	}  
         /* try {
          FileReader fr = new FileReader("aa.txt");
	      } 
          catch(FileNotFoundException e) {
	      e.printStackTrace();
	      }*/
          

}
}

