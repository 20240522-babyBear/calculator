package exsersice.review.create.object.code;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Keyboard {
     int keyNumber;
     boolean lockButton;
     boolean transferKey;
     char sign;
     String word;
     String positionKey;
     boolean button;

     public Keyboard() {};



     public Keyboard(int keyNumber, boolean lockButton, boolean transferKey,String word,String positionKey) {
         this.keyNumber = keyNumber;
         this.lockButton = lockButton;
         this.transferKey = transferKey;
         this.word = word;
         this.positionKey= positionKey;


     }

     public void setTransferKey() {
         this.transferKey = false;
         this.word = word;
     }
     public void specialSign(char sign) {
         this.sign = sign;
         button = true;
         if (button) {
             Scanner sc = new Scanner(System.in);
             System.out.print("sign 입력: ");


         }
     }
     public void utilKey() {
         if(transferKey == false) {
             transferKey = true;
             System.out.println("키를 변환 했습니다. ");

         }



     }

     public String tab(String tab) {
         tab = "    ";
         return tab;
     }


}
