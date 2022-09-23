package javaYT37;

public class Main {

	public static void main(String[] args) {
		
		KrediUI krediUI= new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
		krediUI.KrediHesapla(new TarımKrediManager());
	
		// yukarıda krediUI 'ı çağırdık ve hesaplamak icin KrediHesapla
		// operasyonunu çağırmamız gerekiyor.Sonra ogretmen,asker ve tarım'ı
		// basemanager'a extendlediğimiz için ne çağırırsan çağır hesaplar.
		
	}

}
