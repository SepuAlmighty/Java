/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;
import aleatoire.*;

/**
 *
 * @author nader
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person john = new Person("John","Doe", 35);
        System.out.println("Prenom : " + john.getFirstName());
        System.out.println("Nom : " + john.getLastName());
        System.out.println("Age : " + john.getAge());
        
        Person nader = new Person(args[0],args[1],Integer.parseInt(args[2]));
        System.out.println("Bonjour " + nader.getFirstName() +" "+ nader.getLastName() + " tu a " + nader.getAge());
        int add =5;
        System.out.println("Bonjour John Doe");
        System.out.println("Larbi etais la");
    }
    
}
