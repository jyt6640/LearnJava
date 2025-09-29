package ch18.q10;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {
	static void main() throws Exception {
		String originalFileName = "C:/Temp/photo1.gif";
		String copyFileName = "C:/Temp/photo2.gif";

		File file = new File(originalFileName);

		if(!file.exists()) {
			System.out.println("원본 파일이 존재하지 않습니다.");
			return;
		}

		InputStream is = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(is);
		OutputStream os = new FileOutputStream(copyFileName);


		byte[] array = new byte[1024];

		while(true) {
			int num = bis.read(array);
			if (num == -1) break;
			os.write(array, 0, num);
		}

		os.flush();
		os.close();
		is.close();

		System.out.println("복사가 성공되었습니다.");
	}
}
