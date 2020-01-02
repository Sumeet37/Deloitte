package iodemos;

import java.io.File;
import java.io.IOException;

public class Assignment {

	public static void main(String[] args) throws IOException {
	
	
		File file1=new File("C:\\Deloitte\\Batch\\BatchMates.txt");
		
		if(file1.exists()) {
			System.out.println("exists");
			file1.delete();
			
		}else {
			
		
			file1.createNewFile();
			System.out.println("created");
			
		}
		
		File file=new File("C:\\Deloitte\\Batch");
		File[] allfiles=file.listFiles();
		int length=allfiles.length;
		
		System.out.println("no of files/folders inside batch \n"+length);
		
		int count_files=0;
		
	
		for (int i = 0; i < length; i++) {
			if(allfiles[i].isFile()) {
				count_files++;
				System.out.println(allfiles[i].getName()+" is a file");				

			}else if(allfiles[i].isDirectory()){
				System.out.println(allfiles[i].getName()+" is a folder");
			}
		}
		
		System.out.println("no of files "+count_files+ "\nno of folders "+(length-count_files));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
