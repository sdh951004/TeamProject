package Qmax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qustion3_1_5 extends Qustion3_1{
    int count=0; //문제 수 easy 쉬운단계
      int correct5=0;   //문제 정답인 수
      boolean end = true;
      Scanner scan=new Scanner(System.in);
      Map<String,String>map = new HashMap<String,String>();
      void Step5() {
         System.out.println("멘사 출제 문제입니다. 장난기 없는 문제이므로 신중하게 풀어주세요.. 모르면★  힌트 ★를 입력해 주세요. ");
          for(int i=1; i<6;i++) {
             int random=(int)(Math.random()*9)+1;
             count++;
             back:
             if(random==1) {
            	while(end) {
                map.put("달", "정답입니다"); //값 정답
                System.out.println(i+"번째 문제"); 
                System.out.println("항상 오래됐지만 때로는 새로우며, 슬퍼하는 법이 없되 때로는 우울하고, 비어있는 법이 없되 때로는 차오르며, 미는 법이 없되 항상 당기는 것은 무엇이냐?"); //문제
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "힌트":
                	System.out.println("힌트:한 글자이며 밤에 보인다.단,낮에는 사라진다.");
                	break;
                case "달":
                	
                if(map.get(key)==null) {
                    System.out.println("틀렸다. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" 이걸 맞추다니....대단하구나");
                    break back;
                 }
                default:
                	System.out.println("틀렸습니다.");
                	break back;
             }
            	}
             }
             else if(random==2) {
            	while(end) {
                map.put("태양","정답입니다");
                System.out.println(i+"번째 문제");
                System.out.println("절대 쉬지도 멈추지도 않으며, 언덕에서 언덕으로 고요히 움직이고, 걷거나 달거나 잰걸음 하지 않으며, 모두 차가워도 홀로 차갑지 않은 것은?");
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "힌트":
                	System.out.println("두글자 이며 낮에 보이고 제대로 보기힘들다.단,밤에는 사라진다.");
                	break;
                case "태양":
                	
                if(map.get(key)==null) {
                    System.out.println("틀렸다. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" 이걸 맞추다니....대단하구나");
                    break back;
                 }
                default:
                	System.out.println("틀렸습니다.");
                	break back;
             }
            	}
             }
             else if(random==3) {
            	 while(end) {
                map.put("강", "정답입니다");
                System.out.println(i+"번째 문제");
                System.out.println("움직일 수 있지만 절대 걷지 않고, 삼킬 수 있지만 절대 말하지 않고, 높은 곳에 있으면 낮은 곳을 향하고, 누워 있어도 잠들지 않는 것은?");
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "힌트":
                	System.out.println("힌트:한 글자 아마존이 생각난다.");
                	break;
                case "강":
                	
                if(map.get(key)==null) {
                    System.out.println("틀렸다. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" 이걸 맞추다니....대단하구나");
                    break back;
                 }
                default:
                	System.out.println("틀렸습니다.");
                	break back;
             }
            	 }
             }
             else if(random==4) {
            	 while(end) {
                map.put("기억", "정답입니다");
                System.out.println(i+"번째 문제");
                System.out.println("망자를 살려내며 너를 울고 웃게 하고, 젊게 만들어주며, 찰나에 태어나지만, 평생 지속되는 것은?");
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "힌트":
                	System.out.println("힌트:두 글자 추억이 생각난다.");
                	break;
                case "기억":
                	
                if(map.get(key)==null) {
                    System.out.println("틀렸다. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" 이걸 맞추다니....대단하구나");
                    break back;
                 }
                default:
                	System.out.println("틀렸습니다.");
                	break back;
             }
            	 }
             }
             else if(random==5) {
            	 while(end) {
                map.put("시간", "정답입니다");
                System.out.println(i+"번째 문제");
                System.out.println("이것은 새와 짐승, 나무, 꽃 그 모든 것을 집어삼키고, 쇠를 갉아먹고 강철을 씹어먹으며, 단단한 돌을 가루로 갈아내며, 왕을 죽이고, 마을을 파괴하며, 높을 산을 깍는다.");
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "힌트":
                	System.out.println("힌트:두 글자 가만히 있어도 흘러가고 돌이킬 수 없다");
                	break;
                case "시간":
                	
                if(map.get(key)==null) {
                    System.out.println("틀렸다. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" 이걸 맞추다니....대단하구나");
                    break back;
                 }
                default:
                	System.out.println("틀렸습니다.");
                	break back;
             }
            	 }
             }
             else if(random==6) {
            	 while(end) {
                 map.put("인간", "정답입니다");
                 System.out.println(i+"번째 문제");
                 System.out.println("아침에는 4발 점심에는 2발 저녁에는 3발로 발이 많을수록 약한 것은?");
                 String key = scan.next();
                 String ex=map.get(key);
                 switch(key) {
                 
                 case "힌트":
                 	System.out.println("두 글자 차라리 다르게 생각해보자 처음에는 발이 4개이며 시간이지나고 발이 2개며 또 시간이 지나면 발이 3개이다");
                 	break;
                 case "인간":
                 	
                 if(map.get(key)==null) {
                     System.out.println("틀렸다. ");
                     break;
               }      
                  else if(ex.equals(map.get(key))){
                     correct5++;
                     System.out.println(ex+" 이걸 맞추다니....대단하구나");
                     break back;
                  }
                 default:
                 	System.out.println("틀렸습니다.");
                 	break back;
              }
            	 }
              }
             else if(random==7) {
            	 while(end) {
                 map.put("해와달", "정답입니다");
                 System.out.println(i+"번째 문제");
                 System.out.println("언니가 동생을 낳고, 다시 동생이 언니를 낳는 자매는?");
                 String key = scan.next();
                 String ex=map.get(key);
                 switch(key) {
                 
                 case "힌트":
                 	System.out.println("힌트:세 글자이고 하나는 낮에만 볼수있고 하나는 밤에만볼수있다 ");
                 	break;
                 case "해와달":
                 	
                 if(map.get(key)==null) {
                     System.out.println("틀렸다. ");
                     break;
               }      
                  else if(ex.equals(map.get(key))){
                     correct5++;
                     System.out.println(ex+" 이걸 맞추다니....대단하구나");
                     break back;
                  }
                 default:
                 	System.out.println("틀렸습니다.");
                 	break back;
              }
            	 }
              }
             else if(random==8) {
            	 while(end) {
                 map.put("세월", "정답입니다");
                 System.out.println(i+"번째 문제");
                 System.out.println("올 때는 양과 같고 스칠 때는 매와 같으며 지나치면 돌과 같은 것은?");
                 String key = scan.next();
                 String ex=map.get(key);
                 switch(key) {
                 
                 case "힌트":
                 	System.out.println("힌트:OO아 네월아");
                 	break;
                 case "세월":
                 	
                 if(map.get(key)==null) {
                     System.out.println("틀렸다. ");
                     break;
               }      
                  else if(ex.equals(map.get(key))){
                     correct5++;
                     System.out.println(ex+" 이걸 맞추다니....대단하구나");
                     break back;
                  }
                 default:
                 	System.out.println("틀렸습니다.");
                 	break back;
              }
            	 }
              }
             else if(random==9) {
            	 while(end) {
                 map.put("생명", "정답입니다");
                 System.out.println(i+"번째 문제");
                 System.out.println("월요일엔 끓는 물을 마시고 화요일엔 물을 마시고 수요일엔 바람을 마시며 목요일엔 흙을 먹는 것은?");
                 String key = scan.next();
                 String ex=map.get(key);
                 switch(key) {
                 
                 case "힌트":
                 	System.out.println("힌트:두 글자 모든 살아 숨쉬는 것에는 이것이 있다.");
                 	break;
                 case "생명":
                 	
                 if(map.get(key)==null) {
                     System.out.println("틀렸다. ");
                     break;
               }      
                  else if(ex.equals(map.get(key))){
                     correct5++;
                     System.out.println(ex+" 이걸 맞추다니....대단하구나");
                     break back;
                  }
                 default:
                 	System.out.println("틀렸습니다.");
                 	break back;
              }
            	 }
              }
           
             else {
                
                System.out.println("틀렸습니다.");
                
             }
             
          }
          
         System.out.println("여기까지 오시다니 대단하시네요..!!");
         if(correct5>=3) {
             System.out.println("와우 랭커에 기록되셨겠는데요..?");
          }
         else if(correct5>0) {
        	 System.out.println("랭커에 기록 되셨을 수도..아니면 안됬을 수도....");
         }
          else {
        	  correct5=0;
          }
       
     }
   public int getCorrect5() {
      return correct5;
   }
   public void setCorrect5(int correct5) {
      this.correct5 = correct5;
   }
      
}