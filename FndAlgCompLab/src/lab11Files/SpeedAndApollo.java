package lab11Files;

import java.nio.file.*;

public class SpeedAndApollo {
	
	int numFiles = 0;
	//SPEED
	String s = "C:\\Users\\Katie\\Desktop\\classes\\Fund Algorithms\\LAB STUFF\\Backup (Lab 11)\\Backup\\SPEED\\SPEED_20171102_[0-9]*of10.txt";
	PathMatcher matcher = FileSystems.getDefault().getPathMatcher(s);
	Path p1 = Paths.get("C:\\Users\\Katie\\Desktop\\classes\\Fund Algorithms\\LAB STUFF\\Backup (Lab 11)\\Backup\\SPEED");
	Path fileName = p1.getFileName();
	//APOLLO
	String a = "C:\\Users\\Katie\\Desktop\\classes\\Fund Algorithms\\LAB STUFF\\Backup (Lab 11)\\Backup\\APOLLO\\APOLLO_20171102_[0-9]of4.txt";
	PathMatcher mach2 = FileSystems.getDefault().getPathMatcher(a);
	Path p2 = Paths.get("C:\\Users\\Katie\\Desktop\\classes\\Fund Algorithms\\LAB STUFF\\Backup (Lab 11)\\Backup\\APOLLO");
	Path fileFolder2 = p2.getFileName();
	
	//SPEED
	//tfw having a lot of subfolders is a disadvantage
	public void deleteExtraFiles() {
		if(!matcher.matches(fileName)){
			p1.toFile().delete();
		}
	}
	
	//APOLLO
	public boolean rightNumFiles() {
		if(mach2.matches(fileFolder2)) {
			numFiles++;
		}
		return numFiles == 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpeedAndApollo e = new SpeedAndApollo();
		
		System.out.println(e.rightNumFiles());
		
	}

}
