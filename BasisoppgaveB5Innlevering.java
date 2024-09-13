package no.hvl.dat100;

import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.*;

import javax.swing.JOptionPane;


public class BasisoppgaveB5Innlevering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		for(int i=1; i<=10; i++) {
			
			String oppnaaddPoengTxt = JOptionPane.showInputDialog("Hvor mye Poeng fikk Kandidat" + "nummer"+ i + "?"); 
			int oppnaadPoeng = parseInt(oppnaaddPoengTxt);
			
			if(oppnaadPoeng >= 90 && oppnaadPoeng <= 100) {
				System.out.println("Eleven får tildelt karakter A!");
			}
			else if(oppnaadPoeng >= 80 && oppnaadPoeng <= 89) {
				System.out.println("Eleven får tildelt karakter B!");
			}
			else if(oppnaadPoeng >= 60 && oppnaadPoeng <= 79) {
				System.out.println("Eleven får tildelt karakter C!");
			}
			else if(oppnaadPoeng >= 50 && oppnaadPoeng <= 59) {
				System.out.println("Eleven får tildelt karakter D!");
			}
			else if(oppnaadPoeng >= 40 && oppnaadPoeng <= 49) {
				System.out.println("Eleven får tildelt karakter E!");
			}
			else if(oppnaadPoeng >= 100) {
				
				System.out.println("Ugyldig poengsum");
				oppnaaddPoengTxt = JOptionPane.showInputDialog("Tast inn gyldig poengsum til Student" + "nummer"+ i + "!"); 
			}
			else if(oppnaadPoeng < 0) {
				
				System.out.println("Ugyldig poengsum");
				oppnaaddPoengTxt = JOptionPane.showInputDialog("Tast inn gyldig poengsum til Student" + "nummer"+ i + "!");
				
			}
			else {
				System.out.println("Eleven får tildelt karakter F!");
				//n=i;
				//poengGrense();
				//break;
			}
			
		}
		
	

	}

}
