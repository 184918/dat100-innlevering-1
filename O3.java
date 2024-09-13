package no.hvl.dat100;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		fakultet();
		 
	}
	
	public static void fakultet() {
		 Scanner scan = new Scanner(System.in);  //Vi lager en scannerObjekt 
		 System.out.println("Skriv inn et heltall: ");
		 
		 int n_helTall = scan.nextInt();  // Read user input
		 
		 if(n_helTall > 0) {
			 long fakultet = 1; //vi starter med at fakultet må være 1
			 String symbol = ""; //Her skal vi legge inn * 
			 
			 //Beregn n_helTall
			 for(int i = 1; i<=n_helTall; i++) {
				 fakultet = fakultet * i;
				 
				 // Legg til i (hopp over "*" foran første tallet)
	                if (i == 1) {
	                	symbol = "" + i;
	                } else {
	                	symbol += " * " + i;
	                }
			 }
			 
			// Skriv ut resultatet
		         System.out.println(n_helTall + "! = " + symbol + " = " + fakultet);
		 }
     else {
        System.out.println("Tallet må være større enn 0!");
        fakultet();
        
     }
			scan.close();  // Lukk scanner
	}
	

}
