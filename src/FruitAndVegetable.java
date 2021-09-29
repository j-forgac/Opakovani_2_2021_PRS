import java.util.ArrayList;
import java.util.Scanner;

public class FruitAndVegetable {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> fruit = new ArrayList<>();
		ArrayList<String> vegetable = new ArrayList<>();

		System.out.println("zadejte počet ovoce");
		int n = sc.nextInt();
		System.out.println("zadávejt " + n + " kusů ovoce");
		for (int x = 0;x<=n;x++){
			fruit.add(sc.nextLine());
		}

		System.out.println("zadejte počet zeleniny");
		int m = sc.nextInt();
		System.out.println("zadávejt " + m + " kusů zeleniny");
		for (int x = 0;x<=m;x++){
			vegetable.add(sc.nextLine());
		}

		System.out.println("zadejdávejte rostlinné druhy");
		String plant = "";
		while (sc.hasNext() && !plant.equals("END")){
			plant = sc.nextLine();
			if(fruit.contains(plant)){
				System.out.println("ovoce");
			}
			if(vegetable.contains(plant)){
				System.out.println("rostlina");
			}
			if(!fruit.contains(plant) && !vegetable.contains(plant) && !plant.equals("END")){
				System.out.println("ostatní");
			}
		}
	}
}
