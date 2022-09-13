package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class donguodev {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz: ");
		int a = scan.nextInt();
		
		for(int i =0; i<=a; i++) {
			if(i%3==0 && i%4==0) {
				System.out.println(i);
			}
		}	

	}

}
