package olympia;

import java.util.Scanner;

public class DogsAndChicks {
//���� ���Ƹ��� �������� �ٸ����� �Է��ϸ� ���� ������� �˷��ִ°�
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ���Ƹ� �� �� �ٸ���");
		int dogs = 0;
		int chicks = 0;
		int dogsAndChicks = scan.nextInt();
		int totalLegs = scan.nextInt();
		int d = 0;
		if(dogsAndChicks>1000 || totalLegs>4000){
			System.out.println("�������� 1000���� �ٸ����� 4000����");
			System.exit(0);
		}else{
		for(d = 0 ; d <= dogsAndChicks ; d ++){
			if((4*d)+2*(dogsAndChicks-d)== totalLegs){
				dogs =  d;
				chicks = dogsAndChicks-d;
				System.out.println("������ : "+dogs+"����");
				System.out.println("���Ƹ� : "+chicks+"����");
				break;
			}
			if(dogsAndChicks==d){
				System.out.println("���� �ȵ˴ϴ�.");	
				}
			}
		}
		scan.close();
	}
}
