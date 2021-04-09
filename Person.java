package selfIntroduction;

public class Person {
	  //名前と名字を連結するメソッド
		public static String fullName(String firstName, String lastName){
			String fullName = firstName + " " +  lastName;
			return fullName;
		}

	  //入力されたデータをコンソールに表示するメソッド
		public static void printData(String fullName, int age, double height, double weight){
			System.out.println("名前は" + fullName + "です");
			System.out.println("年齢は" + age + "歳です");
			if(age >= 20){
				System.out.println("成年者です");
			}else{
				System.out.println("未成年者です");
			}
			System.out.println("身長は" + height + "mです");
			System.out.println("体重は" + weight + "kgです");
			double bmi = bmiCalc(height, weight);
			System.out.println("BMIは" + Math.round(bmi) + "です");
			if(isHealthy(bmi)){
				System.out.println("健康です");
			}else{
				System.out.println("健康ではありません");
			}
		}

	  //入力された身長、体重を元にBMIを計算するメソッド
		public static double bmiCalc(double height, double weight){
			double bmi = weight / height / height;
			return bmi;
		}

	  //計算したBMIを元に健康状態を判断するメソッド
		public static boolean isHealthy(double bmi){
			return (bmi >= 18.5 && bmi < 25.0);
		}
}
