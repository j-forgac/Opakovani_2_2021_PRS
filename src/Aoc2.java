import java.util.Arrays;

public class Aoc2 {
	public static void main(String[] a){
		Aoc2Input cnbInput = new Aoc2Input();
		String[][] input = cnbInput.getInput();
		int res = 0;
		for(String s[]: input){
			res += statickaFunkce(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
		}
		System.out.println(res);
	}

	public static Integer statickaFunkce(int l, int w, int h){
		int[] arr = {l,w,h};
		Arrays.sort(arr);
		return 2*l*w + 2*w*h + 2*h*l + arr[0]*arr[1];

	}
}
