package no.hvl.dat100;

import static java.lang.Integer.parseInt;

import javax.swing.JOptionPane;

public class trinnskatt {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String inntektTxt = JOptionPane.showInputDialog("Hva var din inntekt i år"  + "?"); 
		int inntekt = parseInt(inntektTxt);
		
		if(inntekt >= 0 && inntekt <= 208050) {
			System.out.println("Ingen trinnskatt");
		}
		else if(inntekt >= 292851 && inntekt <= 670000) {
			double trinnSkattBeløp = inntekt * 0.04;
			trinnSkattBeløp = Math.round(trinnSkattBeløp * 100.0) / 100.0;
			System.out.println("Du må betale 4,0% i trinnskatt dvs " + trinnSkattBeløp  + "kr");
		}
		else if(inntekt >= 670001 && inntekt <= 937900) {
			double trinnSkattBeløp = inntekt * 0.136;
			trinnSkattBeløp = Math.round(trinnSkattBeløp * 100.0) / 100.0;
			System.out.println("Du må betale 13,6% i trinnskatt dvs " + trinnSkattBeløp  + "kr");
		}
		else if(inntekt >= 937900 && inntekt <= 1350000) {
			double trinnSkattBeløp = inntekt * 0.166;
			trinnSkattBeløp = Math.round(trinnSkattBeløp * 100.0) / 100.0;
			System.out.println("Du må betale 16,6% i trinnskatt dvs " + trinnSkattBeløp  + "kr");
		}
		else if (inntekt >= 1350001) {
			double trinnSkattBeløp = inntekt * 0.176;
			trinnSkattBeløp = Math.round(trinnSkattBeløp * 100.0) / 100.0;
			System.out.println("Du må betale 17,6% i trinnskatt dvs " + trinnSkattBeløp  + "kr");
		}
		
		
		


	}
	

		
		
		
		
	

}
