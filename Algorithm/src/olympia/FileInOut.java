package olympia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOut {
//���� ����� ���� ������Ʈ ù��° ������ ��Ʈ�� �ȴ�.
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
