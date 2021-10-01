public class Bankovky1 {
	public static void main(String[] a) {
		int[] paperBills = {5000, 2000, 1000, 500, 200, 100};
		int[] coins = {50, 20, 10, 5, 2, 1};
		int cash = 5443;
		int pB = 0;
		int c = 0;
		while(cash > 0){
			int x = 0;
			if(cash >= 100){
				while(cash < paperBills[x]){
					x++;
				}
				System.out.println(cash + " - " + paperBills[x]);
				cash -= paperBills[x];
				pB++;
			} else {
				while(cash < coins[x]){
					x++;
				}
				System.out.println(cash + " - " + coins[x]);
				cash -= coins[x];
				c++;
			}
		}
		System.out.println(pB + " / " + c);
	}
}
