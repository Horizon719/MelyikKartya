
package melyikkartya;

import java.util.Scanner;

public class MelyikKartya {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] szamok = new int[21];
        
        for (int i = 0; i < szamok.length; i++) {
            szamok[i] = i + 1;
        }
        
        for (int i = 0; i < 3; i++) {
            kirak(szamok);
            int oszlop = melyik();
            kever(szamok, oszlop);
        }
        
        ezVolt(szamok);
        
        
    }
    
    
    private static void kirak(int[] kartyak) {
        for (int i = 0; i < kartyak.length; i++) {
            System.out.printf("%d ", kartyak[i]);
            if (i % 3 == 2) {
                System.out.println("");
            }
        }
    }
    
    private static int melyik() {
        System.out.print("Melyik oszlopban van a kiválasztott szám? (1-3)");
        int oszlop;
        
        do{
            oszlop = SC.nextInt();
        }while (oszlop > 3 || oszlop < 1);
        
        return oszlop;
    }
    
    private static void ezVolt(int[] kartyak) {
        System.out.printf("A kiválasztott kártya a %s volt", kartyak[10]);
    }
    
    private static void kever(int[] kartyak, int oszlop) {
        
    }
    
}
