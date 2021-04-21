package intro;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double bugun = 8.14;
		byte vade = 36;
		boolean dustuMu = false;
		
		

		System.out.println(internetSubeButonu);
		System.out.println(dolarDun);
		System.out.println(vade);
		System.out.println(dolarDun < bugun ? "Artýþ" : "Düþüþ");
		System.out.println("*********************");
		
		String[] kredi = {"Hýzlý Kredi","Mutlu Emekli Kredi","Konut Kredi","ÇÝftçi Kredi","Msb Kredi","Meb Kredisi"};
		
		for(String krediler : kredi) {
			System.out.println(krediler);
		}
		System.out.println("************************");
		for(int i=0;i<kredi.length;i++) {
			System.out.println(kredi[i]);
		}
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);//20
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);//100
		
		

	}

}
