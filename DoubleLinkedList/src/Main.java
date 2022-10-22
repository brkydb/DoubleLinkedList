import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BagliListe bl = new BagliListe();
		
		int i = -1, sayi, indis;
		
		while (i != 0) {
			
			System.out.println(" 1- Baþa ekle");
			System.out.println(" 2- Sona Ekle");
			System.out.println(" 3- Araya Eleman Ekle");
			System.out.println(" 4- Baþtan Sil");
			System.out.println(" 5- Sondan Sil");
			System.out.println(" 6- Aradan Sil" );
			System.out.println(" 7- Sondan Baþa Yazdýr");
			System.out.println(" 0- Çýkýþ");
			
			i = scan.nextInt();
			
			if (i == 1) {
				
				System.out.println("Sayý: ");
				sayi = scan.nextInt();
				bl.BasaEkle(sayi);
				
			}
			else if (i == 2) {
				
				System.out.println("Sayý: ");
				sayi = scan.nextInt();
				bl.SonaEkle(sayi);
				
			}
			
			else if (i == 3) {
				System.out.println("Ýndis: ");
				indis = scan.nextInt();
				System.out.println("Sayý: ");
				sayi = scan.nextInt();
				bl.ArayaEkle(indis, sayi);
			}
			
			
			else if (i ==4 ) {
				bl.bastanSil();
				
			}else if (i ==5 ) {
				bl.sondanSil();
				
			}
			
			else if (i == 6) {
				System.out.println("indis");
				indis = scan.nextInt();
				bl.aradanSil(indis);
			}
			else if (i == 7) {
				bl.Sondanyazdir();
			}
			
			bl.yazdir();
			
			
		}
		
		

	}

}
