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

               map.put("�Ľ�Ÿ", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�� �߿� ���� �α��ִ� �Ĵ�?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 2) {

               map.put("�̴���", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�߱� ����� �θ� ������??");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 3) {
               map.put("�����Խ��ϴ�", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�� 4������ ���°��� 6���ڷ� ǥ���ϸ�?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 4) {
               map.put("�Ը�����", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�������� �������� �����ϸ�?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 5) {

               map.put("ĸ���̽�", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("���� ���̿� �Ź��� ������?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 6) {

               map.put("����60��", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�� 1�ð����� ������");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����60��");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 7) {

               map.put("�ι���", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�Ӹ��� �ϴ� �λ��?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");

               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 8) {

               map.put("����", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�ƿ�𺸴� �������� �ڵ�����?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 9) {

               map.put("��Ӹ�", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("���ü� ���� �ŷ�");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 10) {

               map.put("������", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("���ڰ� �ڱ�Ұ� �� �ϸ�??");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 11) {

               map.put("����ŷ", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("���� ���� ����?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            } else if (random == 12) {

               map.put("������", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("Į�� �����ϸ�?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 13) {

               map.put("�̲ٽ���", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�̲ٶ��� ���� ���� ������?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 14) {
               map.put("�Q", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�κΰ� ���� ������?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:�κ� + ��");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 15) {
               map.put("�龾", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�ݶ� �� ������??");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 16) {
               map.put("������", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("û���� �� �ָ��ϴ� ����?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            } else if (random == 17) {
               map.put("����췽", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("�������� ���� �緯���� �����ϴ¸���?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 18) {
               map.put("�Ҿ�", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("���������� ����� ���Դ� ������(2����)?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 19) {

               map.put("�ڰ���", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("���󿡼� ���� ���� ����?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }
            }

            else if (random == 20) {

               map.put("�ɳ�", "�����Դϴ�");
               System.out.println(i + " ��° ����");
               System.out.println("���󿡼� ���� �߱����� ���� �����?");
               String key = scan.next();
               String ex = map.get(key);

               if (map.get(key) == null) {
                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
               } else if (ex.equals(map.get(key))) {
                  correct3++;
                  System.out.println(ex);
               }

            }

         }

      System.out.println("���� ���� :" + correct3);
      if (correct3 >= 3)

      {
         System.out.println("����Դϴ�. �����ܰ踦 ������ �ּ���.!!");
      }

      else {
    	 correct3=0;
    	 System.out.println("����� ���Ͽ����ϴ�. �ٽ� �����ϼ���.");      }
   }

   public int getCorrect3() {
      return correct3;
   }

   public void setCorrect3(int correct3) {
      this.correct3 = correct3;
   }

} // Ŭ����