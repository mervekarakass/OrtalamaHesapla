package OrtalamaHesapla;


import java.util.Scanner;

public class OrtalamaHesapla {

	public static void main(String[] args) {
	int girilenSayi;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Bir sayi giriniz:  ");
	girilenSayi = input.nextInt();
	// toplam ve sayaci baslat
	int toplam = 0;
	int sayac = 0;
	
	// 0'dan girilen sayiya kadar dongu
	for (int i = 0; i <= girilenSayi ; i++) {
		// 3'e ve 4'e tam bolunenleri kontrol et
		if (i %3 == 0 && i %4 == 0) {
			toplam += i; // bolunen sayilari topla
			sayac++;     // bolunen sayilarin sayacini arttir
		}
	}
	// ortalamayi hesapla
	double ortalama = (double) toplam / sayac;
	// sonucu ekrana yazdir
	System.out.println("0'dan " + girilenSayi + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);

	}

}
