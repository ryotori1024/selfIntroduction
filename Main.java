package selfIntroduction;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("何人分の情報を入力しますか:");
		int number = scanner.nextInt();
		int ageMax = 0;                 //最高年齢
		int ageSum = 0;                 //年齢の合計値
		for(int i = 1; i <= number; i++){
			System.out.println(i + "人目");
			System.out.print("名前:");
			String firstName = scanner.next();
			System.out.print("名字:");
			String lastName = scanner.next();
			String fullName = Person.fullName(firstName, lastName);
			System.out.print("年齢:");
			int age = scanner.nextInt();
			ageSum += age;
			if(ageMax < age){
				ageMax = age;
			}
			System.out.print("身長(m):");
			double height = scanner.nextDouble();
			System.out.print("体重(kg):");
			double weight = scanner.nextDouble();
			Person.printData(fullName, age, height, weight);
		}
		System.out.println("最高年齢は" + ageMax + "歳です");
		int ageAverage = ageSum / number;
		System.out.print("平均年齢は" + ageAverage + "歳です");
		scanner.close();
	}
}
