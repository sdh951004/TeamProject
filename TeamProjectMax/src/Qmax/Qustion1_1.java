package Qmax;

import java.util.Scanner;

public class Qustion1_1 extends Qustion1{

	
	public String name;	//�̸� �Է��� ���� �ʵ� ����
	Scanner scan= new Scanner(System.in);
	@Override
	void Name() {	//ȣ���� �̸��� �޼ҵ� 
		
		System.out.println("�̸��� �Է��ϼ���.");
		name = scan.next();
		this.name=name;
		System.out.println(this.name + "�� ��ũ ��� �Ǿ����ϴ�.");
	}
	public String getName() {	//�̸� ������ ���� �ҷ����� ���� get��� ����
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
