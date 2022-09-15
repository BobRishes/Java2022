package introYeni;

public class Main {

	public static void main(String[] args) {

		String metin="İlginizi Çekebilir";
		String altMetin="Vade Süresi";
		
		System.out.println(metin);
		System.out.println(altMetin);
		
		int vade= 12;
		double dolarDun=18.14;
		double dolarBugün=18.10;
		
		boolean dolarDustuMu=false;
		
		String okYonu="down.svg";
		String okYonu2="up.svg";
		
		if(dolarBugün<dolarDun) {
			System.out.println(okYonu);
		
		}else {
			System.out.println(okYonu2);
		}
		
		
		String[] krediler= {"Hızlı Kredi","abc","bca"};
		
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
			
		}
		
		
	}

}

