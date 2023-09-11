
package melyikkartya;

import java.util.Scanner;

public class MelyikKartya {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] szamok = new int[21];
        
        String[] pakli = pakliOsszeAllit();
        
        for (int i = 0; i < 3; i++) {
            kirak(pakli);
            int oszlop = melyik();
            kever(pakli, oszlop);
        }
        
        ezVolt(pakli);
        
        
    }
    
    
    private static void kirak(String[] kartyak) {
        for (int i = 1; i < kartyak.length; i++) {
            System.out.printf("%-10s", kartyak[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }
    
    private static int melyik() {
        int oszlop;
        
        do{
            System.out.print("Melyik oszlopban van a kiválasztott szám (1-3)? ");
            oszlop = SC.nextInt();
        }while (oszlop > 3 || oszlop < 1);
        
        return oszlop;
    }
    
    private static void ezVolt(String[] kartyak) {
        System.out.printf("A kiválasztott kártya a %s volt\n", kartyak[11]);
    }
    
    private static void kever(String[] kartyak, int oszlop) {
        
    }

    private static String[] pakliOsszeAllit() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        String[] pakli = new String[22];
        int i = 1;
        
        for (String szin : szinek) {
            int j = 0;
            
            while(i< pakli.length && j< ertekek.length){
                pakli[i++] = szin+"_"+ertekek[j++];
            }
        }
        
        return pakli;
    }
    
}
