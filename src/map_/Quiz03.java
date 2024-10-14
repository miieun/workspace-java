package map_;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		ArrayList<String>fruits=new ArrayList<String>();

		fruits.add("바나나");
		fruits.add("키위");
		fruits.add("오렌지");
		fruits.add("사과");
		System.out.println("과일은 "+fruits.size()+"개 입니다.");

		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));

		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		fruits.remove(1);
		System.out.println("과일은 "+fruits.size()+"개 입니다.");

		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		fruits.clear();
		System.out.println("과일은 "+fruits.size()+"개 입니다.");
		boolean check=true;

		fruits.add("바나나");
		fruits.add("키위");
		fruits.add("오렌지");
		fruits.add("사과");

		Scanner sc=new Scanner(System.in);
		System.out.println("과일 입력 : ");
		String answer=sc.next();

		for(String fruit : fruits) {
			if(answer.equals(fruits)) {
				System.out.println(answer+"이(가) 있습니다");
				check=false;
				break;
			}
		}
		if(check) {
			System.out.println(answer+"이(가) 없습니다");
		}
		System.out.println(fruits.contains(answer));
	}
}
