package olympia;

import java.util.Scanner;

public class BadHairDay {
// 앞에 있는 소가 키가 크면 헤어 스타일을 볼수 없다. 헤어스타일을 볼수 있는 소의 마리수는..
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("소의 마리수");
		int num = scan.nextInt();
		
		int[] list;
		list = new int[num];
				
		System.out.println(num+"마리의 소의 각각의 키(,로 구분해주세요)");
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
			System.out.println("중간 점수"+point);
		}
		System.out.println("소가 볼수 있는 헤어스타일의 수는 "+point);
		scan.close();
	}

}
