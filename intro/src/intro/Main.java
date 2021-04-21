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
		

	}

}
