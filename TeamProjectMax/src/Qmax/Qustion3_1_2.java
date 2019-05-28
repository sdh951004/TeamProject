package Qmax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qustion3_1_2 extends Qustion3_1{
   
      int count=0;
      int correct2=0;
      boolean end = true;
      Scanner scan=new Scanner(System.in);
      Map<String,String>map = new HashMap<String,String>();
      void Step2() {
         
    
            for(int i=1; i<6;i++) {
               int random=(int)(Math.random()*20)+1;
               count++;
               if(random==1) {
                  map.put("친자확인", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("누군가 나를 쳤다면 가장 먼저 해야할일은?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㅊㅈㅎㅇ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct2++;
                      System.out.println(ex);
                   }
               }
               else if(random==2) {
                  map.put("일본사람","정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("화장실에서 방금 나온사람은?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㅇㅂㅅㄹ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct2++;
                      System.out.println(ex);
                   }
               }
               else if(random==3) {
                  map.put("최저임금", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("가장 가난한 왕은?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㅊㅈㅇㄱ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct2++;
                      System.out.println(ex);
                   }
               }
               else if(random==4 ) {
                  map.put("서울시립대", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("서울이추워하면?");
                  String key = scan.next();
                  String ex=map.get(key);
            
                     if(map.get(key)==null) {
                         System.out.println("틀렸습니다. 힌트:ㅅㅇㅅㄹㄷ");
                   }      
                      else if(ex.equals(map.get(key))){
                         correct2++;
                         System.out.println(ex);
                   
                      }
               }
               else if(random==5) {
                  map.put("동일인물", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("성동일이 물에 빠지면?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㄷㅇㅇㅁ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct2++;
                      System.out.println(ex);
                   }
               }
               else if(random==6) {
                   map.put("일간신문", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("신문이 일하러가면?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:ㅇㄱㅅㅁ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==7) {
                   map.put("장안화재", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("장농안에서 불이 나면?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:ㅈㅇㅎㅈ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==9) {
                   map.put("스파개리", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("가수 개리가 온천에 가면?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:ㅅㅍㄱㄹ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               else if(random==10) {
                   map.put("소개팅", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("소랑 개랑 부딧히면?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:ㅅㄱㅌ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               else if(random==11) {
                   map.put("수도권배출", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("지방 흡입의 반댓말은?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:ㅅㄷㄱㅂㅊ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               
               else if(random==12) {
                   map.put("로딩중", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("세상에서 가장 지루한 중학교는?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:ㄹㄷㅈ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==13) {
                   map.put("우엉", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("뽑으면 우는 식물은");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:울어 운다고");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               else if(random==14) {
                   map.put("베어먹지", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("곰이사과를 먹는 방법은?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:먹어 잘먹어 어떻게먹어 ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }                }
               
               else if(random==15) {
                   map.put("EBS", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("입이 S짜로 되있으면?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:입모양으로해보세요");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               else if(random==16) {
                   map.put("프로포즈", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("진정한 프로의 자세");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:문제가 곧답");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==17) {
                   map.put("딸기시럽", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("딸기가 직장을 잃으면?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:직장을 잃으면 슬퍼");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex+" 정답 입니다.!!");
                    }
                }
               
               
               else if(random==18) {
                   map.put("전과자", "전과자");
                   System.out.println(i+"번째 문제");
                   System.out.println("과자가 자기소개를 하면?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:범인이야");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==18) {
                   map.put("천일염", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println(" 소금의 유통기한은?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:굵어 소금이");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                   }
                
               
               
               else if(random==19) {
                   map.put("냉장고", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("펭귄들이 다니는 고등학교는?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:추워");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               else if(random==20) {
                   map.put("소오름", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("소가 계단을 오르면??");
                   String key = scan.next();
                   String ex=map.get(key);
             
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:ㅋㅋ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                 
               }
               
            }
            
         System.out.println("맞힌 갯수 :"+correct2);
         if(correct2>=3) {
            System.out.println("통과입니다. 다음단계를 선택해 주세요.!!");
         }
         else {
        	 correct2=0;
        	 System.out.println("통과를 못하였습니다. 다시 도전하세요.");            	 
         }
     }
   public int getCorrect2() {
      return correct2;
   }
   public void setCorrect2(int correct2) {
      this.correct2 = correct2;
   }
      
}