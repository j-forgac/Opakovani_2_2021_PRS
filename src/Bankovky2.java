public class Bankovky2 {
	public static void main(String[] a) {
		int[] muneh = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 2, 1};
		int cash = 5443;
		int c = 0;
		if(cash%2 == 1){
			cash -= 5;
			c++;
		}
		while (cash > 0) {
			int x = 0;
			while (cash < muneh[x]) {
				x++;
			}
			System.out.println(cash + " : " + c + " / " + muneh[x]);
			cash -= muneh[x];
			c++;
		}
		System.out.println(c);
	}
}
