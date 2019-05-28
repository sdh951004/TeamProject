package Qmax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qustion3_1_1 extends Qustion3_1{
   
      int correct=0;	//정답 갯수를 세기위한 int타입의  변수 선언
      Scanner scan=new Scanner(System.in);
      Map<String,String>map = new HashMap<String,String>();	//Map 프레임워크를 활용. 
      void Step1() {	
         
            for(int i=1; i<6;i++) {
               int random=(int)(Math.random()*20)+1;
               if(random==1) {
            	  map.put("킹콩", "정답입니다.");	//map은 키값과 value값이 한쌍이므로 왼쪽은 key값 오른쪽은 value값 
                  System.out.println(i+"번째 문제");
                  System.out.println("왕이 넘어지면은?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                	  System.out.println("틀렸습니다. 힌트:ㅋㅋ");
                  }
                  else if(ex.equals(key)) {
                	  correct++;
                	  System.out.println(ex);
                  }
                     }
               else if(random==2) {
                  map.put("어떻게피하노","정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("피하노를 던지면?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㅇㄸㄱㅍㅎㄴ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct++;
                      System.out.println(ex);
                   }
               }
               else if(random==3) {
                  map.put("티모", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("티셔츠와 모자를 줄여서 말하면?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㅌㅁ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct++;
                      System.out.println(ex);
                   }
               }
               else if(random==4) {
                  map.put("배드민턴", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("침대를 밀고 돌리면?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㅂㄷㅁㅌ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct++;
                      System.out.println(ex);
                   }
               }
               else if(random==5) {
                  map.put("삼성화재", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("세개의 성이 불타면?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㅅㅅㅎㅈ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct++;
                      System.out.println(ex);
                   }
               }
              else if (random == 6) {
             map.put("소개팅", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("소랑 개랑 부딪치면?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㅅㄱㅌ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 7) {
             map.put("차여서", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("트랜스포머가 여자친구가 없는 이유는?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㅊㅇㅅ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 8) {
             map.put("눈", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("머리를 감을때 어디부터 감을까?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㄴ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 9) {
             map.put("캡쳐도구", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("모자를 때릴 수 있는 도구");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㅋㅊㄷㄱ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 10) {
             map.put("쥐포", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("쥐 4마리가 모이면?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㅈㅍ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 11) {
             map.put("다이소", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("소가 죽은것을 세글자로?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㄷㅇㅅ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 12) {
             map.put("오이무침", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("오이가 무를 때렸을때");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㅇㅇㅁㅊ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 13) {
             map.put("나비야", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("비가 자기소개 할때");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㄴㅂㅇ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 14) {
             map.put("할머니", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("할아버지가 제일 좋아하는 돈은?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㅎㅁㄴ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 15) {
             map.put("뉴욕", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("매일 새로운 욕이 만들어지는 도시는?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㄴㅇ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 16) {
             map.put("나이아가라폭포", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("노인들이 가장 좋아하는 폭포는?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㄴㅇㅇㄱㄹㅍㅍ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 17) {
             map.put("팬더", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("가장 폭력적인 동물은?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㅍㄷ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 18) {
             map.put("안데스산맥", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("죽지 않는 산맥");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㅇㄷㅅㅅㅁ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 19) {
             map.put("노사연", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("사연이 하나 없는 연예인");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㄴㅅㅇ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 20) {
             map.put("소나타", "정답입니다");
             System.out.println(i + "번째 문제");
             System.out.println("소가 타는 자동차");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("틀렸습니다. 힌트:ㅅㄴㅌ");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } 


               
            }
            
         
         System.out.println("맞힌 갯수 :"+correct);
         if(correct>=3) {
            System.out.println("통과입니다. 다음단계를 선택해 주세요.!!");
         }
         else {
        	 correct=0;
        	 System.out.println("통과를 못하였습니다. 다시 도전하세요.");
         }
     }
   public int getCorrect() {
      return correct;
   }
   public void setCorrect(int correct) {
      this.correct = correct;
   }
      
}
