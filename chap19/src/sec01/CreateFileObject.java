package sec01;

import java.io.File;
import java.io.IOException;

public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		// 1-1 C드라이브내에 temp01 폴더가 없을때 생성 exists()
		File tempDir = new File("C:/temp01"); 
		if (!tempDir.exists())  // exist() return boolean ->있으면 true, 없으면 false
			tempDir.mkdir(); // false not -> true : 존재하지 않는다면 싱행문을 실행하라
		System.out.println("폴더 존재 유뮤 : " + tempDir.exists());
		
		// 1-2 파일 객체 생성 (실제 파일 생성 exists(), createNewFile())
		File newFile = new File("C:/temp01/newFile.txt");
		if(!newFile.exists())
			newFile.createNewFile(); //temp01 폴더가 없을때 예외 발생
		System.out.println("파일 존재 유무 : " + newFile.exists());
		
		
		// 2. 파일 구분자
		File newFile2 = new File("C:\\temp01\\newFile.txt");
		File newFile3 = new File("C:/temp01/newFile.txt");
		File newFile4 = new File("C:"+ File.separator + "temp01" +File.separator + "newFile.txt");
		
		System.out.println("윈도우 기준(역슬러시) \\ : " + newFile2.exists());
		System.out.println("맥기준 슬러시 / : " + newFile3.exists());
		System.out.println("시스템에 상관없이 구분자 필드사용(separator) : " + newFile4.exists());
	
		// 3. 상대경로
		//현재위치
		System.out.println("현재 작업 위치 : " + System.getProperty("user.dir"));
		File newFile5 = new File("newFile1.txt");
		File newFile6 = new File("bcd/newFile2.txt");
		System.out.println("newFile5 파일 존재 여부 : " + newFile5.exists());
		System.out.println("newFile5 객체가 참조하고 있는 파일의 절대 경로 : " + newFile5.getAbsolutePath());
		System.out.println(newFile6.getAbsolutePath());
		
		//4. 파일 메서드
		System.out.println("절대경로: " +tempDir.getAbsolutePath());
		System.out.println("폴더인지 아닌지: " +tempDir.isDirectory());
		System.out.println("파일인지 아닌지: " +tempDir.isFile());
		System.out.println("파일/폴더명: " +tempDir.getName());
		System.out.println("부모 폴더: " +tempDir.getParent());
		
		File newFile7 = new File("C:/temp01/abc");
		System.out.println("abc 폴더 생성 성공? : " +newFile7.mkdir());
		File newFile8 = new File("C:/temp01/bcd/cde");
		System.out.println("cde 폴더 생성 성공? : " +newFile8.mkdir());
		System.out.println("cde 폴더 생성 성공? : " +newFile8.mkdirs());
		
		File[] fnames = tempDir.listFiles();
		for (File fname : fnames) {
			System.out.println((fname.isDirectory()? "폴더:" : "파일: ") + fname.getName());
		}
		
		
		
	}

}
