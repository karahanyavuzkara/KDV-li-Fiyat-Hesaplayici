package patika;
import java.util.Scanner;
public class kdvtutarihesaplayici {

public static void main(String[]args) {
	
    double fiyat ;
	Scanner input = new Scanner(System.in);
	System.out.println("Ürün fiyatını giriniz.");
	fiyat = input.nextDouble();
	double kdvlifiyat = fiyat * 18/100 ;
	System.out.println("KDV'li tutar: " + kdvlifiyat);
	                                                                    // KDV ORANI %18
	                                                                   
	
	
}



}
