package set_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		ArrayList<String>arr=new ArrayList<String>();
		set.add("라면"); set.add("김밥");
		set.add("순대"); set.add("라면");
		
		arr.add("라면"); arr.add("김밥");
		arr.add("순대"); arr.add("라면");
		
		System.out.println("set : "+set);
		System.out.println("arr : "+arr);
		
		System.out.println("------------------");
		
		//1~45
		ArrayList<Integer> arrInt=new ArrayList<Integer>();
		Random ran = new Random();
		for(;6>arrInt.size();) {
			int r = ran.nextInt(6)+1;
			//if(arrInt.contains(r)==false) 이 식을 줄여서 밑에 식으로도 이용한다=거짓일때 실행한다는 뜻
			if(!arrInt.contains(r)) {//거짓을 true로 실행한다는 의미
				arrInt.add(r);
			}
		}
		System.out.println("arrInt : "+arrInt);
		
		HashSet<Integer> setInt =new HashSet<Integer>();//set은 중복되지 않음
		for(;6>setInt.size();) {
			setInt.add(ran.nextInt(6)+1);
		}
		System.out.println("setInt : "+setInt);
		
	}

}
