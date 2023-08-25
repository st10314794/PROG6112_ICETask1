/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112_ice_task1;

/**
 *
 * @author Mik
 */
public class Reptile extends Animal {

    private double bloodTemp;

    public double getBloodTemp() {
        return bloodTemp;
    }

    public void setBloodTemp(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Please enter blood temperature:");

        setBloodTemp(sc.nextDouble());

    }//endinput

    @Override
    public void output() {
        System.out.println("-------------------------");
        System.out.println("     Entry Details    ");
        System.out.println("-------------------------");
        System.out.println("Animal: Reptile");
        super.output();

        System.out.println("Blood Temperature: " + getBloodTemp());

    }//endoutput

}
