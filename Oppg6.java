package oppgaverArrays2;

import javax.swing.*;

public class Oppg6 {
    public static void main(String[] args){
        int antallAnmeldere = Integer.parseInt(JOptionPane.showInputDialog("Antall anmeldere: "));
        int antallFilmer = Integer.parseInt(JOptionPane.showInputDialog("Antall filmer: "));
        int [][] tabell = new int[antallAnmeldere][antallFilmer];
        for (int i = 0; i < antallAnmeldere; i++){
            for (int j = 0; j < antallFilmer; j++){
                tabell[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn scores"));
                System.out.print(tabell[i][j] + " ");
            }
            System.out.println();
        }
    }
}
