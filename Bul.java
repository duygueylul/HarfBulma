package HarfBulma;
import java.util.Scanner;


public class Bul {
	
	static void harfBul(String cumle, char harf) {
		
		int s = 0;
		for(int i = 0; i < cumle.length(); i++) {
			if(cumle.charAt(i) == harf) {
				s++;
			}
		}
		System.out.println("Girdiğiniz cümle yada kelimede" + " " + s + " " + "adet" + " " + harf + " " + "vardır.");
				
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Bir Cümle veya Kelime Giriniz: ");
		String c = scan.nextLine();
		System.out.println("Bir Harf Giriniz: ");
		char harf = scan.next().charAt(0);
		
		
		
		harfBul(c, harf);
		
	}

}
