package m;



public class Kisi {
	private String ad ;

	private  String soyad ;

	private int yas ;
	
	
	public void setAd(String a) { // burada parametre içerisine girilen a'yı yukarıdaki ad değişkenine atatdım
		ad = a;
	   }
	
	
	public void setSoyad(String s) { // burada parametre içerisine girilen s'yi yukarıdaki soyad değişkenine atatdım
		soyad = s;
	   }
	
	
	public void setYas(int y) { // burada parametre içerisine girilen y'yi yukarıdaki yas değişkenine atatdım
			if(y >=0) //yas eksili bir değer alamaz ama eğer burayı yukarıdakiler gibi bırakırsak alabilir eksili bir değer alamaması için şu koşulu yazıyorum
			yas = y;
			
			else {
				yas = 0;
				System.out.println("Hatalı giriş yaptınız") ; //artık sıfırdan küçük bir değer alırsa yaşı sıfıra eşit sayacak ve hatalı giriş yaptınız çıktısı verecek 
			}
			
			
		   }
	public String getAd() { //Bunu yapmamızın sebebi yukarıdaki ad değişkenini isteyen kullanıcıya döndürecek
		return ad;
	}
	
	public String getSoyad() { //Bunu yapmamızın sebebi yukarıdaki soyad değişkenini isteyen kullanıcıya döndürecek
		return soyad;
	}
	
	public int getYas() { //Bunu yapmamızın sebebi yukarıdaki yas değişkenini isteyen kullanıcıya döndürecek
		return yas;
	}
	
	public void yazdir(){
		System.out.println("ad   : "+ getAd());
		System.out.println("soyad   : " + getSoyad()) ;
		System.out.println("yas   : " + getYas()) ;

		}
}
