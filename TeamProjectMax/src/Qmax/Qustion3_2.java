package Qmax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Qusion3_1 ��ӹ޴´�.
public class Qustion3_2 extends Qustion3_1{
	String name1;
   int choice;
   int max=0;
   Scanner scan=new Scanner(System.in);
   Qustion1_1 name =new Qustion1_1();
   Qustion_1 Q = new Qustion_1();
   Qustion3_1_1 Qu=new Qustion3_1_1();	
   Qustion3_1_2 Qu2=new Qustion3_1_2();
   Qustion3_1_3 Qu3=new Qustion3_1_3();
   Qustion3_1_4 Qu4=new Qustion3_1_4();
   Qustion3_1_5 Qu5=new Qustion3_1_5();
   void CHOICE() {
	   
	   Q.Bener();
	   
	
	  
	   boolean run =true;
      while(run) {
    	
    	  Qu();
	   
      System.out.println("���� �ϼ���.");
      choice = scan.nextInt();
      boolean end = true;

      switch(choice) {
   
      case 1:
         while(end) {
            
            System.out.println("�աաաաաաաաաաաճ��̵� ���áաաաաաաաաաաաաաաաաաաաաաաաաաաաա�");
            System.out.println("|1.Easy|2.Normal|3.Hard|4.Hell|5.Hidden|6.��ŷ����|7.�ʱ�ȭ��");
            System.out.println("�աաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաաա�");
            System.out.print("����>");
            choice = scan.nextInt();
            switch(choice) {
         
            	
            case 1:
                System.out.println("������忡 ���Ű��� ȯ���մϴ�.");
                if(Qu.getCorrect()>=3&&name1==null||Qu.getCorrect()>=3&&name1!=null) {	//������忡�� 3���̻� �¾����� �̸��� �������� �ʾ������� �̸��� ����������,
            		System.out.println("�̹� ����Ͽ����ϴ�.");
            		break;
            	}
                else {
                Qu.Step1();
                if(Qu.getCorrect()>=3) {
                	break;
                }
                break;
                }
               
            
            case 2:
            	
               if(Qu.getCorrect()>=3) {
                  System.out.println(" Normal�ܰ迡 ���Ű��� ȯ���մϴ�.");
                  if(Qu2.getCorrect2()>=3) {
              		System.out.println("�̹� ����Ͽ����ϴ�.");
              		break;
              	}
                  Qu2.Step2();
                  
                  break;
               }
               else {
                  System.out.println("�����ܰ�� ���� ������ �������� �ʽ��ϴ�.");
                  
               }
               break;
               
               
               
            case 3:
            	if(Qu.getCorrect()>=3&&Qu2.getCorrect2()>=3) {
            		if(Qu3.getCorrect3()>=3) {
                  		System.out.println("�̹� ����Ͽ����ϴ�.");
                  		break;
                  	}
            		Qu3.Step3();
            		break;
            	}
            	 else {
                     System.out.println("�����ܰ�� ���� ������ �������� �ʽ��ϴ�.");
                   
                  }
            	break;
            case 4:
            	if(Qu.getCorrect()>=3&&Qu2.getCorrect2()>=3&&Qu3.getCorrect3()>=4) {
            		if(Qu4.getCorrect4()>=4) {
                  		System.out.println("�̹� ����Ͽ����ϴ�.");
                  		break;
                  	}
            		Qu4.Step4();
            		break;
            	}
            	else {
            		System.out.println("�����ܰ�� ���� ������ �������� �ʽ��ϴ�.");
            	}
            	break;
            case 5:
            	if(Qu.getCorrect()>=3&&Qu2.getCorrect2()>=3&&Qu3.getCorrect3()>=4&&Qu4.getCorrect4()>=5) {
            		Qu5.Step5();
            		
            	}
            	break;
            case 6:
            	
            	if(max<Qu.getCorrect()+Qu2.getCorrect2()+Qu3.getCorrect3()+Qu4.getCorrect4()+Qu5.getCorrect5()) {
            		max=Qu.getCorrect()+Qu2.getCorrect2()+Qu3.getCorrect3()+Qu4.getCorrect4()+Qu5.getCorrect5();
            		
            		name.Name();
            		
            		name1=name.getName();
            	}
				System.out.println(name1+"�� ���� ��Ŀ�Դϴ�. ���� ���� :"+max);
            	
            	
            	
            	break;
            case 7:
            	if(name.getName()!=null) {
            	Qu.setCorrect(0);
            	Qu2.setCorrect2(0);
            	Qu3.setCorrect3(0);
            	Qu4.setCorrect4(0);
            	Qu5.setCorrect5(0);
            	System.out.println("�ʱ�ȭ������ ���ư���.");
            	end=false;
            		
            	}
      }
      }
    	
    	 break;
    	  
    	 
      case 2:
    	  System.out.println("�����������������������������������������������������������������������������򸻦�����������������������������������������������������������������");
          System.out.println("��                ���� ������ ���� ���⸦ ���� �ʽ��ϴ�                                                                  ��");
          System.out.println("��                �蹮�� 1���� ����� ������ 1�� �����մϴ�                                                                    ��");
          System.out.println("��                ���� �ϵ� �� �������� ���� ���ؼ� ���ܰ踦 ���� ���� �̻� ����� �մϴ�                         ��");
          System.out.println("��                ��Hidden�ܰ�� ��� ���� �����Դϴ�. ��Ʈ�� �Է��Ͻø� ��Ʈ�� ��ϴ�                        ��");
          System.out.println("��                ���ְ�� ���� ���� ������� ��ŷ�� ��� �˴ϴ�.                           ��");
          System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������");
          break;
    	  
    	  
      case 3:
    	
    	  System.out.println("����");
    	  run=false;
    	  break;
         
      }
   }
	 
}
}