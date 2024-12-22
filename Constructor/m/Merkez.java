package m;

public class Merkez {

	public static void main(String[] args) {
		
		kisi k1 = new kisi( ); // Nesneye parametre eklemezsek parametresiz metot çalışır parametre eklersek parametreli metot çalışır 
		kisi k2 = new kisi("Efe\n"); //Tek parametreli
		kisi k3 = new kisi("Ali\n", "Mehemt\n");
		kisi k4 = new kisi("Berk\n" , "Çevik\n" , 30); //Çok parametreli
		
		
		System.out.println(k2.isim);
	
		System.out.println(k3.isim);
		System.out.println(k3.soyisim);
		
		System.out.println(k4.isim);
		System.out.println(k4.soyisim);
		System.out.println(k4.yas);
		
	}

}
