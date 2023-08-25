/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog6112_ice_task1;

import java.util.Scanner;

/**
 *
 * @author Mik
 */
public class PROG6112_IceTask1 {

  

    public static void main(String[] args) {

        //Instantiating objects
        Bird brd = new Bird();
        Reptile rept = new Reptile();

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Please select which animal you would like to enter:"
                + "\n(1) For Bird  "
                + "\n(2) For Reptile"+
        "\n--------------------");
         String usrChoice = sc.nextLine();
         boolean validInput = false;
        while (validInput==false) {
            if (usrChoice.equals("1")|| usrChoice.equals("2")) {
                 validInput = true;
            } else {
                System.out.println("Please only enter 1 or 2");
                usrChoice = sc.next();
               
            }//endif
        }//endwhile
       

        switch (usrChoice) {
            case "1":
                brd.input();
                brd.output();
                break;
            case "2":
                rept.input();
                rept.output();
                break;
            default:
                throw new AssertionError();
        }//endswitch

    }//endmain

}
