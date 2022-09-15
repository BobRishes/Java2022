package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		
		
		String internetSubeButonu ="İnternet Şubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar düştü resmi");
		}
		else if (dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");	
		}	
		else {
			System.out.println("Dolar eşittir resmi");
			
			System.out.println("-------------");
		}
		String kredi1 = "Hızlı Kredi";
		String kredi2 = "Mutlu emekli Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "Çiftçi Kredi";
		String kredi5 = "Msb Kredi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
	
		// yukarıdaki kredilerin daha dinamik hali alttadır.
		// hatta bir tane daha kredi ekleyim
		// string krediler yazdık ya o dizi oldu artık dizinin ismi krediler
		String[] krediler = {
				
				"Hızlı Kredi",
				"Mutlu emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"Kültür bakanlığı Kredisi"
				
		};
		// for'da yukarıdaki String'in elemanları bitene kadar işleme devam eder
		for(String krediii : krediler) {
			System.out.println(krediii);						
		};
		System.out.println("--------------------");
		
		// 0 dan başlasın, döngü i kredilerin eleman sayısından küçük olduğu sürece çalışşın,
		// sonra i her döngüde 1bir bir artsın diyor bu i++ olarak da yazılabilir.
		for(int i = 0; i<krediler.length;i=i+1) {
			System.out.println(krediler[i]);
		
	};
		// burada yukarıdan aşşağıya gitmek önemli aşşağıya gidildikçe yukarının önemi kalmayabilir.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
	
		
		// yine aynı şekilde yukarıdan aşşağıya gitme mantığı.
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		// yukarıda sayilar2[0] demek 0'ıncı elemanı diyor.
		System.out.println(sayilar1[0]);
		
		// metinsel veri tiplerinde String kullanıyoruz
		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";	
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);
	
}
};