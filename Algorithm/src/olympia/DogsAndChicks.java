package olympia;

import java.util.Scanner;

public class DogsAndChicks {
//개와 병아리의 마리수와 다리수를 입력하면 각각 몇마리인지 알려주는것
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("강아지와 병아리 수 와 다리수");
		int dogs = 0;
		int chicks = 0;
		int dogsAndChicks = scan.nextInt();
		int totalLegs = scan.nextInt();
		int d = 0;
		if(dogsAndChicks>1000 || totalLegs>4000){
			System.out.println("마리수는 1000이하 다리수는 4000이하");
			System.exit(0);
		}else{
		for(d = 0 ; d <= dogsAndChicks ; d ++){
			if((4*d)+2*(dogsAndChicks-d)== totalLegs){
				dogs =  d;
				chicks = dogsAndChicks-d;
				System.out.println("강아지 : "+dogs+"마리");
				System.out.println("병아리 : "+chicks+"마리");
				break;
			}
			if(dogsAndChicks==d){
				System.out.println("말이 안됩니다.");	
				}
			}
		}
		scan.close();
	}
}
