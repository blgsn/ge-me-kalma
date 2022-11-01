
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		int mat,fizik,turkce,kimya,muzik;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("matematik notunuz:");
		mat=input.nextInt();
		
		System.out.print("Fizik notunuz:");
		fizik=input.nextInt();
		
		System.out.print("Türkçe notunuz:");
		turkce=input.nextInt();
		
		System.out.print("Kimya notunuz:");
		kimya=input.nextInt();
		
		System.out.print("Muzik notunuz:");
		muzik=input.nextInt();
		
		double average=(mat+fizik+turkce+kimya+muzik)/5;
		
		if(average<55)
			System.out.println("Sınıfta kaldınız." );
		else 
			System.out.println("Tebrikler,geçtiniz.");
		System.out.print("Ortalamanız" + average);
	
	}

}
