package data_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class taskSet5 {
	static String [] words = new String [10000];
	static int count = 0;
	static int n = 0;
	public static void main(String[] args) {
//		입력으로 하나의 텍스트 파일을 읽는다 (sample.txt).
//		텍스트 파일에 등장하는 모든 단어들의 목록을 만들고, 각 단어가 텍스트 파일에
//		등장하는 횟수를 센다. 단, 단어 개수는 100,000개 이하라고 가정한다.
//		사용자가 요청하면 단어 목록을 하나의 파일로 저장한다.
//		사용자가 단어를 검색하면 그 단어가 텍스트 파일에 몇 번 등장하는지 출력한다.
//		$ read sample.txt  텍스트 파일 sample.txt를 읽고 인덱스를 만든다.
//		$ find heaven // heaven이라는 단어가 몇번 나오는지 출력한다.
//		The word “heaven” appears 13 times.
//		$ saveas index.txt  인덱스를 index.txt라는 파일로 저장한다.
//		$ find java
//		The word “java” does not appear.
//		$ exit
		
		try {
			Scanner inFile = new Scanner(new File("sample.txt"));
			while(inFile.hasNext()) {
				words[n] = inFile.next();
				n++;
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
