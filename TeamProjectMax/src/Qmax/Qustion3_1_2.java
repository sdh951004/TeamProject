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
                  map.put("ģ��Ȯ��", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("������ ���� �ƴٸ� ���� ���� �ؾ�������?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct2++;
                      System.out.println(ex);
                   }
               }
               else if(random==2) {
                  map.put("�Ϻ����","�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("ȭ��ǿ��� ��� ���»����?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct2++;
                      System.out.println(ex);
                   }
               }
               else if(random==3) {
                  map.put("�����ӱ�", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("���� ������ ����?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct2++;
                      System.out.println(ex);
                   }
               }
               else if(random==4 ) {
                  map.put("����ø���", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("�������߿��ϸ�?");
                  String key = scan.next();
                  String ex=map.get(key);
            
                     if(map.get(key)==null) {
                         System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����������");
                   }      
                      else if(ex.equals(map.get(key))){
                         correct2++;
                         System.out.println(ex);
                   
                      }
               }
               else if(random==5) {
                  map.put("�����ι�", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("�������� ���� ������?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct2++;
                      System.out.println(ex);
                   }
               }
               else if(random==6) {
                   map.put("�ϰ��Ź�", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("�Ź��� ���Ϸ�����?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==7) {
                   map.put("���ȭ��", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("���ȿ��� ���� ����?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==9) {
                   map.put("���İ���", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("���� ������ ��õ�� ����?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               else if(random==10) {
                   map.put("�Ұ���", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("�Ҷ� ���� �ε�����?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               else if(random==11) {
                   map.put("�����ǹ���", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("���� ������ �ݴ���?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����������");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               
               else if(random==12) {
                   map.put("�ε���", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("���󿡼� ���� ������ ���б���?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==13) {
                   map.put("���", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("������ ��� �Ĺ���");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��� ��ٰ�");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               else if(random==14) {
                   map.put("�������", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("���̻���� �Դ� �����?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:�Ծ� �߸Ծ� ��ԸԾ� ");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }                }
               
               else if(random==15) {
                   map.put("EBS", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("���� S¥�� ��������?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:�Ը�������غ�����");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               else if(random==16) {
                   map.put("��������", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("������ ������ �ڼ�");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������ ���");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==17) {
                   map.put("����÷�", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("���Ⱑ ������ ������?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������ ������ ����");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex+" ���� �Դϴ�.!!");
                    }
                }
               
               
               else if(random==18) {
                   map.put("������", "������");
                   System.out.println(i+"��° ����");
                   System.out.println("���ڰ� �ڱ�Ұ��� �ϸ�?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:�����̾�");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               
               else if(random==18) {
                   map.put("õ�Ͽ�", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println(" �ұ��� ���������?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:���� �ұ���");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                   }
                
               
               
               else if(random==19) {
                   map.put("�����", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("��ϵ��� �ٴϴ� ����б���?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:�߿�");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                }
               
               else if(random==20) {
                   map.put("�ҿ���", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("�Ұ� ����� ������??");
                   String key = scan.next();
                   String ex=map.get(key);
             
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct2++;
                       System.out.println(ex);
                    }
                 
               }
               
            }
            
         System.out.println("���� ���� :"+correct2);
         if(correct2>=3) {
            System.out.println("����Դϴ�. �����ܰ踦 ������ �ּ���.!!");
         }
         else {
        	 correct2=0;
        	 System.out.println("����� ���Ͽ����ϴ�. �ٽ� �����ϼ���.");            	 
         }
     }
   public int getCorrect2() {
      return correct2;
   }
   public void setCorrect2(int correct2) {
      this.correct2 = correct2;
   }
      
}