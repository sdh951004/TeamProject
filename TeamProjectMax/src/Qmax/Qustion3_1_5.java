package Qmax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qustion3_1_5 extends Qustion3_1{
    int count=0; //���� �� easy ����ܰ�
      int correct5=0;   //���� ������ ��
      boolean end = true;
      Scanner scan=new Scanner(System.in);
      Map<String,String>map = new HashMap<String,String>();
      void Step5() {
         System.out.println("��� ���� �����Դϴ�. �峭�� ���� �����̹Ƿ� �����ϰ� Ǯ���ּ���.. �𸣸��  ��Ʈ �ڸ� �Է��� �ּ���. ");
          for(int i=1; i<6;i++) {
             int random=(int)(Math.random()*9)+1;
             count++;
             back:
             if(random==1) {
            	while(end) {
                map.put("��", "�����Դϴ�"); //�� ����
                System.out.println(i+"��° ����"); 
                System.out.println("�׻� ���������� ���δ� ���ο��, �����ϴ� ���� ���� ���δ� ����ϰ�, ����ִ� ���� ���� ���δ� ��������, �̴� ���� ���� �׻� ���� ���� �����̳�?"); //����
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "��Ʈ":
                	System.out.println("��Ʈ:�� �����̸� �㿡 ���δ�.��,������ �������.");
                	break;
                case "��":
                	
                if(map.get(key)==null) {
                    System.out.println("Ʋ�ȴ�. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" �̰� ���ߴٴ�....����ϱ���");
                    break back;
                 }
                default:
                	System.out.println("Ʋ�Ƚ��ϴ�.");
                	break back;
             }
            	}
             }
             else if(random==2) {
            	while(end) {
                map.put("�¾�","�����Դϴ�");
                System.out.println(i+"��° ����");
                System.out.println("���� ������ �������� ������, ������� ������� ����� �����̰�, �Ȱų� �ްų� ����� ���� ������, ��� �������� Ȧ�� ������ ���� ����?");
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "��Ʈ":
                	System.out.println("�α��� �̸� ���� ���̰� ����� ���������.��,�㿡�� �������.");
                	break;
                case "�¾�":
                	
                if(map.get(key)==null) {
                    System.out.println("Ʋ�ȴ�. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" �̰� ���ߴٴ�....����ϱ���");
                    break back;
                 }
                default:
                	System.out.println("Ʋ�Ƚ��ϴ�.");
                	break back;
             }
            	}
             }
             else if(random==3) {
            	 while(end) {
                map.put("��", "�����Դϴ�");
                System.out.println(i+"��° ����");
                System.out.println("������ �� ������ ���� ���� �ʰ�, ��ų �� ������ ���� ������ �ʰ�, ���� ���� ������ ���� ���� ���ϰ�, ���� �־ ����� �ʴ� ����?");
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "��Ʈ":
                	System.out.println("��Ʈ:�� ���� �Ƹ����� ��������.");
                	break;
                case "��":
                	
                if(map.get(key)==null) {
                    System.out.println("Ʋ�ȴ�. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" �̰� ���ߴٴ�....����ϱ���");
                    break back;
                 }
                default:
                	System.out.println("Ʋ�Ƚ��ϴ�.");
                	break back;
             }
            	 }
             }
             else if(random==4) {
            	 while(end) {
                map.put("���", "�����Դϴ�");
                System.out.println(i+"��° ����");
                System.out.println("���ڸ� ������� �ʸ� ��� ���� �ϰ�, ���� ������ָ�, ������ �¾����, ��� ���ӵǴ� ����?");
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "��Ʈ":
                	System.out.println("��Ʈ:�� ���� �߾��� ��������.");
                	break;
                case "���":
                	
                if(map.get(key)==null) {
                    System.out.println("Ʋ�ȴ�. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" �̰� ���ߴٴ�....����ϱ���");
                    break back;
                 }
                default:
                	System.out.println("Ʋ�Ƚ��ϴ�.");
                	break back;
             }
            	 }
             }
             else if(random==5) {
            	 while(end) {
                map.put("�ð�", "�����Դϴ�");
                System.out.println(i+"��° ����");
                System.out.println("�̰��� ���� ����, ����, �� �� ��� ���� �����Ű��, �踦 ���Ƹ԰� ��ö�� �þ������, �ܴ��� ���� ����� ���Ƴ���, ���� ���̰�, ������ �ı��ϸ�, ���� ���� ��´�.");
                String key = scan.next();
                String ex=map.get(key);
                switch(key) {
                
                case "��Ʈ":
                	System.out.println("��Ʈ:�� ���� ������ �־ �귯���� ����ų �� ����");
                	break;
                case "�ð�":
                	
                if(map.get(key)==null) {
                    System.out.println("Ʋ�ȴ�. ");
                    break;
              }      
                 else if(ex.equals(map.get(key))){
                    correct5++;
                    System.out.println(ex+" �̰� ���ߴٴ�....����ϱ���");
                    break back;
                 }
                default:
                	System.out.println("Ʋ�Ƚ��ϴ�.");
                	break back;
             }
            	 }
             }
             else if(random==6) {
            	 while(end) {
                 map.put("�ΰ�", "�����Դϴ�");
                 System.out.println(i+"��° ����");
                 System.out.println("��ħ���� 4�� ���ɿ��� 2�� ���ῡ�� 3�߷� ���� �������� ���� ����?");
                 String key = scan.next();
                 String ex=map.get(key);
                 switch(key) {
                 
                 case "��Ʈ":
                 	System.out.println("�� ���� ���� �ٸ��� �����غ��� ó������ ���� 4���̸� �ð��������� ���� 2���� �� �ð��� ������ ���� 3���̴�");
                 	break;
                 case "�ΰ�":
                 	
                 if(map.get(key)==null) {
                     System.out.println("Ʋ�ȴ�. ");
                     break;
               }      
                  else if(ex.equals(map.get(key))){
                     correct5++;
                     System.out.println(ex+" �̰� ���ߴٴ�....����ϱ���");
                     break back;
                  }
                 default:
                 	System.out.println("Ʋ�Ƚ��ϴ�.");
                 	break back;
              }
            	 }
              }
             else if(random==7) {
            	 while(end) {
                 map.put("�ؿʹ�", "�����Դϴ�");
                 System.out.println(i+"��° ����");
                 System.out.println("��ϰ� ������ ����, �ٽ� ������ ��ϸ� ���� �ڸŴ�?");
                 String key = scan.next();
                 String ex=map.get(key);
                 switch(key) {
                 
                 case "��Ʈ":
                 	System.out.println("��Ʈ:�� �����̰� �ϳ��� ������ �����ְ� �ϳ��� �㿡�������ִ� ");
                 	break;
                 case "�ؿʹ�":
                 	
                 if(map.get(key)==null) {
                     System.out.println("Ʋ�ȴ�. ");
                     break;
               }      
                  else if(ex.equals(map.get(key))){
                     correct5++;
                     System.out.println(ex+" �̰� ���ߴٴ�....����ϱ���");
                     break back;
                  }
                 default:
                 	System.out.println("Ʋ�Ƚ��ϴ�.");
                 	break back;
              }
            	 }
              }
             else if(random==8) {
            	 while(end) {
                 map.put("����", "�����Դϴ�");
                 System.out.println(i+"��° ����");
                 System.out.println("�� ���� ��� ���� ��ĥ ���� �ſ� ������ ����ġ�� ���� ���� ����?");
                 String key = scan.next();
                 String ex=map.get(key);
                 switch(key) {
                 
                 case "��Ʈ":
                 	System.out.println("��Ʈ:OO�� �׿���");
                 	break;
                 case "����":
                 	
                 if(map.get(key)==null) {
                     System.out.println("Ʋ�ȴ�. ");
                     break;
               }      
                  else if(ex.equals(map.get(key))){
                     correct5++;
                     System.out.println(ex+" �̰� ���ߴٴ�....����ϱ���");
                     break back;
                  }
                 default:
                 	System.out.println("Ʋ�Ƚ��ϴ�.");
                 	break back;
              }
            	 }
              }
             else if(random==9) {
            	 while(end) {
                 map.put("����", "�����Դϴ�");
                 System.out.println(i+"��° ����");
                 System.out.println("�����Ͽ� ���� ���� ���ð� ȭ���Ͽ� ���� ���ð� �����Ͽ� �ٶ��� ���ø� ����Ͽ� ���� �Դ� ����?");
                 String key = scan.next();
                 String ex=map.get(key);
                 switch(key) {
                 
                 case "��Ʈ":
                 	System.out.println("��Ʈ:�� ���� ��� ��� ������ �Ϳ��� �̰��� �ִ�.");
                 	break;
                 case "����":
                 	
                 if(map.get(key)==null) {
                     System.out.println("Ʋ�ȴ�. ");
                     break;
               }      
                  else if(ex.equals(map.get(key))){
                     correct5++;
                     System.out.println(ex+" �̰� ���ߴٴ�....����ϱ���");
                     break back;
                  }
                 default:
                 	System.out.println("Ʋ�Ƚ��ϴ�.");
                 	break back;
              }
            	 }
              }
           
             else {
                
                System.out.println("Ʋ�Ƚ��ϴ�.");
                
             }
             
          }
          
         System.out.println("������� ���ôٴ� ����Ͻó׿�..!!");
         if(correct5>=3) {
             System.out.println("�Ϳ� ��Ŀ�� ��ϵǼ̰ڴµ���..?");
          }
         else if(correct5>0) {
        	 System.out.println("��Ŀ�� ��� �Ǽ��� ����..�ƴϸ� �ȉ��� ����....");
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