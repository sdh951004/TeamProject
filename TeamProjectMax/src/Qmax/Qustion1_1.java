package Qmax;

import java.util.Scanner;

public class Qustion1_1 extends Qustion1{

	
	public String name;	//이름 입력할 것을 필드 선언
	Scanner scan= new Scanner(System.in);
	@Override
	void Name() {	//호출할 이름의 메소드 
		
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		this.name=name;
		System.out.println(this.name + "님 랭크 기록 되었습니다.");
	}
	public String getName() {	//이름 저장한 것을 불러오기 위한 get방식 선언
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
