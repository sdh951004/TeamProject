package Qmax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qustion3_1_4 extends Qustion3_1{
   
      int count=0;
      int correct4=0;
      boolean end = true;
      Scanner scan=new Scanner(System.in);
      Map<String,String>map = new HashMap<String,String>();
      void Step4() {
         
      
            for(int i=1; i<=10;i++) {
               int random=(int)(Math.random()*20)+1;
               count++;
               if(random==1) {
                  map.put("동작구", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("타짜에 아귀가 사는 동네는?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㄷㅈㄱ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }     
               }
               else if(random==2) {
                  map.put("헤어나올수없는매력","정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("탈모가 시작되면 생기는 매력은?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㅎㅇㄴㅇㅅㅇㄴㅁㄹ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }
               }
               else if(random==3) {
                  map.put("글로벌", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("'반성문'을 영어로하면?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㄱㄹㅂ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }
               }
               else if(random==4) {
                  map.put("유해진", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("몸에 좋지않은 청바지는?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㅇㅎㅈ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }
               }
               else if(random==5) {
                  map.put("게보린", "정답입니다");
                  System.out.println(i+"번째 문제");
                  System.out.println("수박이 한통에는 5000원 두통에는?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("틀렸습니다. 힌트:ㄱㅂㄹ");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }
               }else if(random==6) {
                   map.put("콜로세움", "정답입니다");
                   System.out.println(i+"번째 문제");
                   System.out.println("전화기로 세운 건물은?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("틀렸습니다. 힌트:ㅋㄹㅅㅇ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct4++;
                       System.out.println(ex);
                    }
                }else if(random==7) {
                    map.put("오페라하우스", "정답입니다");
                    System.out.println(i+"번째 문제");
                    System.out.println("숫자5가 싫어하는집은?");
                    String key = scan.next();
                    String ex=map.get(key);
                    if(map.get(key)==null) {
                        System.out.println("틀렸습니다. 힌트:ㅇㅍㄹㅎㅇㅅ");
                  }      
                     else if(ex.equals(map.get(key))){
                        correct4++;
                        System.out.println(ex);
                     }
                 }else if(random==8) {
                     map.put("정삼각", "정답입니다");
                     System.out.println(i+"번째 문제");
                     System.out.println("정삼각형의 동생의 이름은?");
                     String key = scan.next();
                     String ex=map.get(key);
                     if(map.get(key)==null) {
                         System.out.println("틀렸습니다. 힌트:ㅈㅅㄱ");
                   }      
                      else if(ex.equals(map.get(key))){
                         correct4++;
                         System.out.println(ex);
                      }
                  }else if(random==9) {
                      map.put("회오리", "정답입니다");
                      System.out.println(i+"번째 문제");
                      System.out.println("오리를 생으로 먹으면?");
                      String key = scan.next();
                      String ex=map.get(key);
                      if(map.get(key)==null) {
                          System.out.println("틀렸습니다. 힌트:ㅎㅇㄹ");
                    }      
                       else if(ex.equals(map.get(key))){
                          correct4++;
                          System.out.println(ex);
                       }
                   }else if(random==10) {
                       map.put("지붕", "정답입니다");
                       System.out.println(i+"번째 문제");
                       System.out.println("땅이 급상승을 했다.뭐라고할까요?");
                       String key = scan.next();
                       String ex=map.get(key);
                       if(map.get(key)==null) {
                           System.out.println("틀렸습니다. 힌트:ㅈㅂ");
                     }      
                        else if(ex.equals(map.get(key))){
                           correct4++;
                           System.out.println(ex);
                        }
                    }else if(random==11) {
                        map.put("쉬는시간", "정답입니다");
                        System.out.println(i+"번째 문제");
                        System.out.println("시간은 마치 소변과도 같다를 다른말로하면?");
                        String key = scan.next();
                        String ex=map.get(key);
                        if(map.get(key)==null) {
                            System.out.println("틀렸습니다. 힌트:ㅅㄴㅅㄱ");
                      }      
                         else if(ex.equals(map.get(key))){
                            correct4++;
                            System.out.println(ex);
                         }
                     }else if(random==12) {
                         map.put("호주머니", "정답입니다");
                         System.out.println(i+"번째 문제");
                         System.out.println("돈을 가리킬때,한국은 원 이라하고 일본은 엔이라한다 그렇다면 호주는? ");
                         String key = scan.next();
                         String ex=map.get(key);
                         if(map.get(key)==null) {
                             System.out.println("틀렸습니다. 힌트:ㅎㅈㅁㄴ");
                       }      
                          else if(ex.equals(map.get(key))){
                             correct4++;
                             System.out.println(ex);
                          }
                      }else if(random==13) {
                          map.put("홈플러스", "정답입니다");
                          System.out.println(i+"번째 문제");
                          System.out.println("집합을 영어로하면?");
                          String key = scan.next();
                          String ex=map.get(key);
                          if(map.get(key)==null) {
                              System.out.println("틀렸습니다. 힌트:ㅎㅍㄹㅅ");
                        }      
                           else if(ex.equals(map.get(key))){
                              correct4++;
                              System.out.println(ex);
                           }
                       }else if(random==14) {
                           map.put("되감기", "정답입니다");
                           System.out.println(i+"번째 문제");
                           System.out.println("감기에 다시걸리는걸 뭐라고할까요?");
                           String key = scan.next();
                           String ex=map.get(key);
                           if(map.get(key)==null) {
                               System.out.println("틀렸습니다. 힌트:ㄷㄱㄱ");
                         }      
                            else if(ex.equals(map.get(key))){
                               correct4++;
                               System.out.println(ex);
                            }
                        }else if(random==15) {
                            map.put("샤바라", "정답입니다");
                            System.out.println(i+"번째 문제");
                            System.out.println("쿵 씨의 딸 이름은?");
                            String key = scan.next();
                            String ex=map.get(key);
                            if(map.get(key)==null) {
                                System.out.println("틀렸습니다. 힌트:ㅅㅂㄹ");
                          }      
                             else if(ex.equals(map.get(key))){
                                correct4++;
                                System.out.println(ex);
                             }
                         }else if(random==16) {
                             map.put("사파이어", "정답입니다");
                             System.out.println(i+"번째 문제");
                             System.out.println("불이 4군데에 났다 뭐라고할까?");
                             String key = scan.next();
                             String ex=map.get(key);
                             if(map.get(key)==null) {
                                 System.out.println("틀렸습니다. 힌트:ㅅㅍㅇㅇ");
                           }      
                              else if(ex.equals(map.get(key))){
                                 correct4++;
                                 System.out.println(ex);
                              }
                          }else if(random==17) {
                              map.put("건포도", "정답입니다");
                              System.out.println(i+"번째 문제");
                              System.out.println("세상에서 가장 작은 섬은?");
                              String key = scan.next();
                              String ex=map.get(key);
                              if(map.get(key)==null) {
                                  System.out.println("틀렸습니다. 힌트:ㄱㅍㄷ");
                            }      
                               else if(ex.equals(map.get(key))){
                                  correct4++;
                                  System.out.println(ex);
                               }
                           }else if(random==18) {
                               map.put("구두", "정답입니다");
                               System.out.println(i+"번째 문제");
                               System.out.println("머리가 아홉개 를 두 글자로 하면?");
                               String key = scan.next();
                               String ex=map.get(key);
                               if(map.get(key)==null) {
                                   System.out.println("틀렸습니다. 힌트:ㄱㄷ");
                             }      
                                else if(ex.equals(map.get(key))){
                                   correct4++;
                                   System.out.println(ex);
                                }
                            }else if(random==19) {
                                map.put("뻥나무", "정답입니다");
                                System.out.println(i+"번째 문제");
                                System.out.println("참나무의 반댓말은?");
                                String key = scan.next();
                                String ex=map.get(key);
                                if(map.get(key)==null) {
                                    System.out.println("틀렸습니다. 힌트:ㅃㄴㅁ");
                              }      
                                 else if(ex.equals(map.get(key))){
                                    correct4++;
                                    System.out.println(ex);
                                 }
                             }else if(random==20) {
                                 map.put("한의사", "정답입니다");
                                 System.out.println(i+"번째 문제");
                                 System.out.println("손님이 뜸하면 돈을 버는 사람은?");
                                 String key = scan.next();
                                 String ex=map.get(key);
                                 if(map.get(key)==null) {
                                     System.out.println("틀렸습니다. 힌트:ㅎㅇㅅ");
                               }      
                                  else if(ex.equals(map.get(key))){
                                     correct4++;
                                     System.out.println(ex);
                                  }
                              }
               else {
                  System.out.println("틀렸습니다.");
                  end=false;
               }
               
            }
            
         System.out.println("맞힌 갯수 :"+correct4);
         if(correct4>=3) {
            System.out.println("통과입니다. 다음단계를 선택해 주세요.!!");
         }
         else {
        	 correct4=0;
        	 System.out.println("통과를 못하였습니다. 다시 도전하세요.");            
         }
         }
     
   public int getCorrect4() {
      return correct4;
   }
   public void setCorrect4(int correct4) {
      this.correct4 = correct4;
   }
      
}