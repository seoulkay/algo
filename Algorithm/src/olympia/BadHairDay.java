package olympia;

import java.util.Scanner;

public class BadHairDay {
// �տ� �ִ� �Ұ� Ű�� ũ�� ��� ��Ÿ���� ���� ����. ��Ÿ���� ���� �ִ� ���� ��������..
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ������");
		int num = scan.nextInt();
		
		int[] list;
		list = new int[num];
				
		System.out.println(num+"������ ���� ������ Ű(,�� �������ּ���)");
		String height = scan.next();
		String[] temp= height.split(",");
		
		for(int i = 0 ; i < num ; i++){
			list[i] = Integer.parseInt(temp[i]);
		}
		
		int point = 0;
		
		for(int i = 0 ; i < num ; i++){
			for(int j = i+1 ; j < num ; j++){
				if(list[i]>list[j]){
					point++;
				}else if(list[i]<=list[j]){
					break;
				}
			}
			System.out.println("�߰� ����"+point);
		}
		System.out.println("�Ұ� ���� �ִ� ��Ÿ���� ���� "+point);
		scan.close();
	}

}
