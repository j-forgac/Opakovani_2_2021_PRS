public class Cnb {
	public static void main(String[] a){
		CnbInput cnbInput = new CnbInput();
		String[][] input = cnbInput.getInput();
		for(String[] s: input){
			float num = (1/Float.parseFloat(s[4]));
			System.out.println(s[1] + " - " + num);
			System.out.println("30 CZK = " + 30 * num + " " + s[1]);
		}
	}
}
