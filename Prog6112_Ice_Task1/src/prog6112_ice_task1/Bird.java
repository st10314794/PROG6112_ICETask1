/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112_ice_task1;

/**
 *
 * @author Mik
 */
public class Bird extends Animal {

    private int colour;

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    @Override
    public void input() {
        super.input();
        boolean validChoice = false;
        System.out.println("Please enter the feather colour:"
                + "\n1) Grey"
                + "\n2) White"
                + "\n3) Black");
        colour = sc.nextInt();
        while (!validChoice) {
            if (colour >= 1 && colour <= 3) {
                validChoice = true;
                setColour(colour);
            } else {
                System.out.println("Please choose between 1-3");
                colour=sc.nextInt();
            }//endif

            
        }//endwhile

    }//endinput

    @Override
    public void output() {
        System.out.println("-------------------------");
        System.out.println("     Entry Details");
        System.out.println("-------------------------");
        System.out.println("Animal: Bird");
        super.output();

        switch (getColour()) {
            case 1:
                System.out.println("Feather Colour: Grey");
                break;
            case 2:
                System.out.println("Feather Colour: White");
                break;
            case 3:
                System.out.println("Feather Colour: Black");
                break;
            default:
                throw new AssertionError();
        }//endswitch
    }

}//endoutput
