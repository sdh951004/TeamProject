package Qmax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qustion3_1_1 extends Qustion3_1{
   
      int correct=0;	//���� ������ �������� intŸ����  ���� ����
      Scanner scan=new Scanner(System.in);
      Map<String,String>map = new HashMap<String,String>();	//Map �����ӿ�ũ�� Ȱ��. 
      void Step1() {	
         
            for(int i=1; i<6;i++) {
               int random=(int)(Math.random()*20)+1;
               if(random==1) {
            	  map.put("ŷ��", "�����Դϴ�.");	//map�� Ű���� value���� �ѽ��̹Ƿ� ������ key�� �������� value�� 
                  System.out.println(i+"��° ����");
                  System.out.println("���� �Ѿ�������?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                	  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
                  }
                  else if(ex.equals(key)) {
                	  correct++;
                	  System.out.println(ex);
                  }
                     }
               else if(random==2) {
                  map.put("������ϳ�","�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("���ϳ븦 ������?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct++;
                      System.out.println(ex);
                   }
               }
               else if(random==3) {
                  map.put("Ƽ��", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("Ƽ������ ���ڸ� �ٿ��� ���ϸ�?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
                }      
                   else if(ex.equals(map.get(key))){
                      correct++;
                      System.out.println(ex);
                   }
               }
               else if(random==4) {
                  map.put("������", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("ħ�븦 �а� ������?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct++;
                      System.out.println(ex);
                   }
               }
               else if(random==5) {
                  map.put("�Ｚȭ��", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("������ ���� ��Ÿ��?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct++;
                      System.out.println(ex);
                   }
               }
              else if (random == 6) {
             map.put("�Ұ���", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("�Ҷ� ���� �ε�ġ��?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 7) {
             map.put("������", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("Ʈ�������Ӱ� ����ģ���� ���� ������?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 8) {
             map.put("��", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("�Ӹ��� ������ ������ ������?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 9) {
             map.put("ĸ�ĵ���", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("���ڸ� ���� �� �ִ� ����");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 10) {
             map.put("����", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("�� 4������ ���̸�?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 11) {
             map.put("���̼�", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("�Ұ� �������� �����ڷ�?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 12) {
             map.put("���̹�ħ", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("���̰� ���� ��������");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } else if (random == 13) {
             map.put("�����", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("�� �ڱ�Ұ� �Ҷ�");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 14) {
             map.put("�ҸӴ�", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("�Ҿƹ����� ���� �����ϴ� ����?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 15) {
             map.put("����", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("���� ���ο� ���� ��������� ���ô�?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 16) {
             map.put("���̾ư�������", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("���ε��� ���� �����ϴ� ������?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 17) {
             map.put("�Ҵ�", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("���� �������� ������?");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 18) {
             map.put("�ȵ������", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("���� �ʴ� ���");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 19) {
             map.put("��翬", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("�翬�� �ϳ� ���� ������");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }

          } else if (random == 20) {
             map.put("�ҳ�Ÿ", "�����Դϴ�");
             System.out.println(i + "��° ����");
             System.out.println("�Ұ� Ÿ�� �ڵ���");
             String key = scan.next();
             String ex = map.get(key);
             if(map.get(key)==null) {
                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
           }      
              else if(ex.equals(map.get(key))){
                 correct++;
                 System.out.println(ex);
              }
          } 


               
            }
            
         
         System.out.println("���� ���� :"+correct);
         if(correct>=3) {
            System.out.println("����Դϴ�. �����ܰ踦 ������ �ּ���.!!");
         }
         else {
        	 correct=0;
        	 System.out.println("����� ���Ͽ����ϴ�. �ٽ� �����ϼ���.");
         }
     }
   public int getCorrect() {
      return correct;
   }
   public void setCorrect(int correct) {
      this.correct = correct;
   }
      
}
