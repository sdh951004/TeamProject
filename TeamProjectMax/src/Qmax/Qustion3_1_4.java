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
                  map.put("���۱�", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("Ÿ¥�� �ƱͰ� ��� ���״�?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }     
               }
               else if(random==2) {
                  map.put("���ü����¸ŷ�","�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("Ż�� ���۵Ǹ� ����� �ŷ���?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������������������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }
               }
               else if(random==3) {
                  map.put("�۷ι�", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("'�ݼ���'�� ������ϸ�?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }
               }
               else if(random==4) {
                  map.put("������", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("���� �������� û������?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }
               }
               else if(random==5) {
                  map.put("�Ժ���", "�����Դϴ�");
                  System.out.println(i+"��° ����");
                  System.out.println("������ ���뿡�� 5000�� ���뿡��?");
                  String key = scan.next();
                  String ex=map.get(key);
                  if(map.get(key)==null) {
                      System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                }      
                   else if(ex.equals(map.get(key))){
                      correct4++;
                      System.out.println(ex);
                   }
               }else if(random==6) {
                   map.put("�ݷμ���", "�����Դϴ�");
                   System.out.println(i+"��° ����");
                   System.out.println("��ȭ��� ���� �ǹ���?");
                   String key = scan.next();
                   String ex=map.get(key);
                   if(map.get(key)==null) {
                       System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                 }      
                    else if(ex.equals(map.get(key))){
                       correct4++;
                       System.out.println(ex);
                    }
                }else if(random==7) {
                    map.put("������Ͽ콺", "�����Դϴ�");
                    System.out.println(i+"��° ����");
                    System.out.println("����5�� �Ⱦ��ϴ�����?");
                    String key = scan.next();
                    String ex=map.get(key);
                    if(map.get(key)==null) {
                        System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������������");
                  }      
                     else if(ex.equals(map.get(key))){
                        correct4++;
                        System.out.println(ex);
                     }
                 }else if(random==8) {
                     map.put("���ﰢ", "�����Դϴ�");
                     System.out.println(i+"��° ����");
                     System.out.println("���ﰢ���� ������ �̸���?");
                     String key = scan.next();
                     String ex=map.get(key);
                     if(map.get(key)==null) {
                         System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                   }      
                      else if(ex.equals(map.get(key))){
                         correct4++;
                         System.out.println(ex);
                      }
                  }else if(random==9) {
                      map.put("ȸ����", "�����Դϴ�");
                      System.out.println(i+"��° ����");
                      System.out.println("������ ������ ������?");
                      String key = scan.next();
                      String ex=map.get(key);
                      if(map.get(key)==null) {
                          System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                    }      
                       else if(ex.equals(map.get(key))){
                          correct4++;
                          System.out.println(ex);
                       }
                   }else if(random==10) {
                       map.put("����", "�����Դϴ�");
                       System.out.println(i+"��° ����");
                       System.out.println("���� �޻���� �ߴ�.������ұ��?");
                       String key = scan.next();
                       String ex=map.get(key);
                       if(map.get(key)==null) {
                           System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
                     }      
                        else if(ex.equals(map.get(key))){
                           correct4++;
                           System.out.println(ex);
                        }
                    }else if(random==11) {
                        map.put("���½ð�", "�����Դϴ�");
                        System.out.println(i+"��° ����");
                        System.out.println("�ð��� ��ġ �Һ����� ���ٸ� �ٸ������ϸ�?");
                        String key = scan.next();
                        String ex=map.get(key);
                        if(map.get(key)==null) {
                            System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                      }      
                         else if(ex.equals(map.get(key))){
                            correct4++;
                            System.out.println(ex);
                         }
                     }else if(random==12) {
                         map.put("ȣ�ָӴ�", "�����Դϴ�");
                         System.out.println(i+"��° ����");
                         System.out.println("���� ����ų��,�ѱ��� �� �̶��ϰ� �Ϻ��� ���̶��Ѵ� �׷��ٸ� ȣ�ִ�? ");
                         String key = scan.next();
                         String ex=map.get(key);
                         if(map.get(key)==null) {
                             System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                       }      
                          else if(ex.equals(map.get(key))){
                             correct4++;
                             System.out.println(ex);
                          }
                      }else if(random==13) {
                          map.put("Ȩ�÷���", "�����Դϴ�");
                          System.out.println(i+"��° ����");
                          System.out.println("������ ������ϸ�?");
                          String key = scan.next();
                          String ex=map.get(key);
                          if(map.get(key)==null) {
                              System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                        }      
                           else if(ex.equals(map.get(key))){
                              correct4++;
                              System.out.println(ex);
                           }
                       }else if(random==14) {
                           map.put("�ǰ���", "�����Դϴ�");
                           System.out.println(i+"��° ����");
                           System.out.println("���⿡ �ٽðɸ��°� ������ұ��?");
                           String key = scan.next();
                           String ex=map.get(key);
                           if(map.get(key)==null) {
                               System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                         }      
                            else if(ex.equals(map.get(key))){
                               correct4++;
                               System.out.println(ex);
                            }
                        }else if(random==15) {
                            map.put("���ٶ�", "�����Դϴ�");
                            System.out.println(i+"��° ����");
                            System.out.println("�� ���� �� �̸���?");
                            String key = scan.next();
                            String ex=map.get(key);
                            if(map.get(key)==null) {
                                System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                          }      
                             else if(ex.equals(map.get(key))){
                                correct4++;
                                System.out.println(ex);
                             }
                         }else if(random==16) {
                             map.put("�����̾�", "�����Դϴ�");
                             System.out.println(i+"��° ����");
                             System.out.println("���� 4������ ���� ������ұ�?");
                             String key = scan.next();
                             String ex=map.get(key);
                             if(map.get(key)==null) {
                                 System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:��������");
                           }      
                              else if(ex.equals(map.get(key))){
                                 correct4++;
                                 System.out.println(ex);
                              }
                          }else if(random==17) {
                              map.put("������", "�����Դϴ�");
                              System.out.println(i+"��° ����");
                              System.out.println("���󿡼� ���� ���� ����?");
                              String key = scan.next();
                              String ex=map.get(key);
                              if(map.get(key)==null) {
                                  System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                            }      
                               else if(ex.equals(map.get(key))){
                                  correct4++;
                                  System.out.println(ex);
                               }
                           }else if(random==18) {
                               map.put("����", "�����Դϴ�");
                               System.out.println(i+"��° ����");
                               System.out.println("�Ӹ��� ��ȩ�� �� �� ���ڷ� �ϸ�?");
                               String key = scan.next();
                               String ex=map.get(key);
                               if(map.get(key)==null) {
                                   System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:����");
                             }      
                                else if(ex.equals(map.get(key))){
                                   correct4++;
                                   System.out.println(ex);
                                }
                            }else if(random==19) {
                                map.put("������", "�����Դϴ�");
                                System.out.println(i+"��° ����");
                                System.out.println("�������� �ݴ���?");
                                String key = scan.next();
                                String ex=map.get(key);
                                if(map.get(key)==null) {
                                    System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                              }      
                                 else if(ex.equals(map.get(key))){
                                    correct4++;
                                    System.out.println(ex);
                                 }
                             }else if(random==20) {
                                 map.put("���ǻ�", "�����Դϴ�");
                                 System.out.println(i+"��° ����");
                                 System.out.println("�մ��� ���ϸ� ���� ���� �����?");
                                 String key = scan.next();
                                 String ex=map.get(key);
                                 if(map.get(key)==null) {
                                     System.out.println("Ʋ�Ƚ��ϴ�. ��Ʈ:������");
                               }      
                                  else if(ex.equals(map.get(key))){
                                     correct4++;
                                     System.out.println(ex);
                                  }
                              }
               else {
                  System.out.println("Ʋ�Ƚ��ϴ�.");
                  end=false;
               }
               
            }
            
         System.out.println("���� ���� :"+correct4);
         if(correct4>=3) {
            System.out.println("����Դϴ�. �����ܰ踦 ������ �ּ���.!!");
         }
         else {
        	 correct4=0;
        	 System.out.println("����� ���Ͽ����ϴ�. �ٽ� �����ϼ���.");            
         }
         }
     
   public int getCorrect4() {
      return correct4;
   }
   public void setCorrect4(int correct4) {
      this.correct4 = correct4;
   }
      
}