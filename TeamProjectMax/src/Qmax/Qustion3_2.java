package Qmax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Qusion3_1 상속받는다.
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
	   
      System.out.println("선택 하세요.");
      choice = scan.nextInt();
      boolean end = true;

      switch(choice) {
   
      case 1:
         while(end) {
            
            System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡난이도 선택≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
            System.out.println("|1.Easy|2.Normal|3.Hard|4.Hell|5.Hidden|6.랭킹보기|7.초기화면");
            System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
            System.out.print("선택>");
            choice = scan.nextInt();
            switch(choice) {
         
            	
            case 1:
                System.out.println("이지모드에 오신것을 환영합니다.");
                if(Qu.getCorrect()>=3&&name1==null||Qu.getCorrect()>=3&&name1!=null) {	//이지모드에서 3개이상 맞았으며 이름이 정해지지 않았을때와 이름이 정해졌을때,
            		System.out.println("이미 통과하였습니다.");
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
                  System.out.println(" Normal단계에 오신것을 환영합니다.");
                  if(Qu2.getCorrect2()>=3) {
              		System.out.println("이미 통과하였습니다.");
              		break;
              	}
                  Qu2.Step2();
                  
                  break;
               }
               else {
                  System.out.println("다음단계로 가는 조건이 충족되지 않습니다.");
                  
               }
               break;
               
               
               
            case 3:
            	if(Qu.getCorrect()>=3&&Qu2.getCorrect2()>=3) {
            		if(Qu3.getCorrect3()>=3) {
                  		System.out.println("이미 통과하였습니다.");
                  		break;
                  	}
            		Qu3.Step3();
            		break;
            	}
            	 else {
                     System.out.println("다음단계로 가는 조건이 충족되지 않습니다.");
                   
                  }
            	break;
            case 4:
            	if(Qu.getCorrect()>=3&&Qu2.getCorrect2()>=3&&Qu3.getCorrect3()>=4) {
            		if(Qu4.getCorrect4()>=4) {
                  		System.out.println("이미 통과하였습니다.");
                  		break;
                  	}
            		Qu4.Step4();
            		break;
            	}
            	else {
            		System.out.println("다음단계로 가는 조건이 충족되지 않습니다.");
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
				System.out.println(name1+"님 현재 랭커입니다. 맞힌 갯수 :"+max);
            	
            	
            	
            	break;
            case 7:
            	if(name.getName()!=null) {
            	Qu.setCorrect(0);
            	Qu2.setCorrect2(0);
            	Qu3.setCorrect3(0);
            	Qu4.setCorrect4(0);
            	Qu5.setCorrect5(0);
            	System.out.println("초기화면으로 돌아가기.");
            	end=false;
            		
            	}
      }
      }
    	
    	 break;
    	  
    	 
      case 2:
    	  System.out.println("┌────────────────────────────────────도움말────────────────────────────────┒");
          System.out.println("│                ①모든 문제의 답은 띄어쓰기를 쓰지 않습니다                                                                  │");
          System.out.println("│                ②문제 1개를 맟출시 갯수는 1개 증가합니다                                                                    │");
          System.out.println("│                ③노멀 하드 헬 히든으로 가기 위해선 전단계를 일정 갯수 이상 맞춰야 합니다                         │");
          System.out.println("│                ④Hidden단계는 멘사 출제 문제입니다. 힌트를 입력하시면 힌트가 뜹니다                        │");
          System.out.println("│                ⑤최고로 많이 맞춘 사람만이 랭킹에 기록 됩니다.                           │");
          System.out.println("└─────────────────────────────────────────────────────────────────────────┘");
          break;
    	  
    	  
      case 3:
    	
    	  System.out.println("종료");
    	  run=false;
    	  break;
         
      }
   }
	 
}
}