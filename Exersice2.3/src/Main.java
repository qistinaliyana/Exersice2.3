
public class Main {

	public static void main(String[] args) {
        Perfume V = new Perfume();//create first new object V
		
		System.out.println("--PerfumeV--");
		V.printperfumeScanner();
		V.calQuantity();
		V.calDiscountprice(100);
		V.calTotalprice();
		V.calDeliveryprice();
		
		System.out.println();
		
		Perfume YSL = new Perfume();//create second new object YSL
		
		System.out.println("--PerfumeYSL--");
		YSL.printperfumeScanner();
		YSL.calQuantity();
		YSL.calDiscountprice(100);
		YSL.calTotalprice();
		YSL.calDeliveryprice();
		
		System.out.println("--End--");
	}

}
