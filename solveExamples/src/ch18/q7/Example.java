package ch18.q7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
	static void main() throws Exception {
		String filePath = "C:\\Users\\jyt66\\Desktop\\JavaStudy\\study\\src\\ch02\\sec02\\BooleanExample.java";

		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);

		int rowNumber = 0;
		String rowData;
		while(true) {
			rowData = br.readLine();
			if(rowData == null) break;

			System.out.println((++rowNumber) + ": " + rowData);
		}
		br.close(); fr.close();
	}
}

