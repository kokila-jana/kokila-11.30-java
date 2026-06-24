package morning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
//	File f=new File("C:\\Users\\manojana\\OneDrive\\Desktop\\kk.txt");
//	try {
//		if(f.createNewFile())
//		{
//			System.out.println("file created...");
//		}
//		else
//		{
//			System.out.println("File already created ..");
//		}
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
		
//		File f=new File("C:\\Users\\manojana\\OneDrive\\Desktop\\kk.txt");
//		try {
//			FileWriter fw=new FileWriter(f);
//			fw.write("MS Dhoni has not officially announced his retirement from the Indian Premier League (IPL) as a player.\nWhile lingering calf injuries and his decision to step aside for younger talent caused him to miss on-field action,\nhe was retained by the Chennai Super Kings and remains associated with the franchise");
//			fw.append("\nPrioritizing Youth: Rather than taking up a crucial spot in the playing eleven, Dhoni consciously stepped away to let younger players settle into the squad. ");
//			fw.flush();
//			fw.close();
//		System.out.println("hok");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		File f=new File("C:\\Users\\manojana\\OneDrive\\Desktop\\kk.txt");
//		try {
//			Scanner sc=new Scanner(f);
//			while(sc.hasNext())
//			{
//				String s=sc.nextLine();
//				System.out.println(s);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		File f=new File("C:\\Users\\manojana\\OneDrive\\Desktop\\kk.txt");
		if(f.delete())
		{
			System.out.println("File deleted...");
		}
		else
		{
			System.out.println("file already deleted..");
		}
	}

}
