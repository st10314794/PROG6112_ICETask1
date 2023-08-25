/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112_ice_task1;

import java.util.Scanner;

/**
 *
 * @author Mik
 */
public class Animal {

    private int IDtag;
    private String species;
    Scanner sc = new Scanner(System.in);

    public int getIDtag() {
        return IDtag;
    }

    public void setIDtag(int IDtag) {
        this.IDtag = IDtag;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //Accepts input from user
    public void input() {

        System.out.println("Please enter the ID tag of the animal:");
        IDtag = sc.nextInt();
        System.out.println("Please enter species:");
        species = sc.next();

    }

    //outputs values
    public void output() {
        System.out.println("ID Tag:" + IDtag);
        System.out.println("Species: " + species);

    }

}
