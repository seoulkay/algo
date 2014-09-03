package olympia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOut {
//파일 입출력 예제 프로젝트 첫번째 폴더가 루트가 된다.
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		int a, b;
		a = in.nextInt();
		b = in.nextInt();
		out.println(a+b);
		in.close();
		out.close();
	}

}
