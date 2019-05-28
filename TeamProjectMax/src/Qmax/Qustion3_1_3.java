package Qmax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qustion3_1_3 extends Qustion3_1 {

   int correct3 = 0;
   Scanner scan = new Scanner(System.in);
   Map<String, String> map = new HashMap<String, String>();

   void Step3() {


         for (int i = 1; i < 6; i++) {
            int random = (int) (Math.random() * 20) + 1;

            if (random == 1) {

               map.put("파스타", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("파 중에 가장 인기있는 파는?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅍㅅㅌ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 2) {

               map.put("이다혜", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("중국 사람이 두명 있으면??");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅇㄷㅎ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 3) {
               map.put("소포왔습니다", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("소 4마리가 오는것을 6글자로 표현하면?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅅㅍㅇㅅㄴㄷ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 4) {
               map.put("게르만족", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("몽골인이 집을보고 만족하면?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㄱㄹㅁㅈ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 5) {

               map.put("캡사이신", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("모자 사이에 신발이 있으면?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅋㅅㅇㅅ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 6) {

               map.put("추적60분", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("비가 1시간동안 내리면");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅊㅈ60ㅂ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 7) {

               map.put("두바이", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("머리로 하는 인사는?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㄷㅂㅇ");

               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 8) {

               map.put("형디", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("아우디보다 먼저나온 자동차는?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅎㄷ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 9) {

               map.put("대머리", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("헤어나올수 없는 매력");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㄷㅁㄹ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 10) {

               map.put("전과자", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("과자가 자기소개 를 하면??");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅈㄱㅈ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 11) {

               map.put("바이킹", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("왕이 집에 가면?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅂㅇㅋ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            } else if (random == 12) {

               map.put("검정색", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("칼이 정색하면?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㄱㅈㅅ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 13) {

               map.put("미꾸스몰", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("미꾸라지 보다 작은 물고기는?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅁㄲㅅㅁ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 14) {
               map.put("쁐", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("부부가 산을 오르면?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:부부 + ㅆ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 15) {
               map.put("펩씨", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("콜라 의 성씨는??");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅍㅆ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 16) {
               map.put("전저리", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("청바지 를 멀리하는 것은?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅈㅈㄹ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 17) {
               map.put("예루살렘", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("예수님이 옷을 사러갈때 자주하는말은?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅇㄹㅅㄹ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 18) {
               map.put("불어", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("프랑스에서 라면을 못먹는 이유는(2글자)?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅂㅇ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 19) {

               map.put("자가용", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("세상에서 가장 작은 용은?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅈㄱㅇ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 20) {

               map.put("케냐", "정답입니다");
               System.out.println(i + " 번째 문제");
               System.out.println("세상에서 가장 발굴꾼이 많은 나라는?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("틀렸습니다. 힌트:ㅋㄴ");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            }

         }

      System.out.println("맞힌 갯수 :" + correct3);
      if (correct3 >= 3)

      {
         System.out.println("통과입니다. 다음단계를 선택해 주세요.!!");
      }

      else {
    	 correct3=0;
    	 System.out.println("통과를 못하였습니다. 다시 도전하세요.");      }
   }

   public int getCorrect3() {
      return correct3;
   }

   public void setCorrect3(int correct3) {
      this.correct3 = correct3;
   }

} // 클래스