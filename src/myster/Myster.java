
package myster;

import java.util.Scanner;

/**
 *
 * @author ounissi
 */
public class Myster {
	//another change
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choix ;
        int max1=15;
        int max2=10;
        int max3=10;
        int mystereChoix;
        Scanner sc = new Scanner (System.in);
        System.out.println("---Bienvenue au jeu du mystere---");
        System.out.println("---Veuillez choisir le niveau---");
        System.out.println("---1: Niveau Facile---");
        System.out.println("---2: Niveau Moyen---");
        System.out.println("---3: Niveau Difficile---");
        System.out.println("---0: Quitter---");
        choix = sc.nextInt();
        while(choix<0 || choix > 3){
        System.out.println("---Bienvenue au jeu du mystere---");
        System.out.println("---Veuillez choisir le niveau---");
        System.out.println("---1: Niveau Facile---");
        System.out.println("---2: Niveau Moyen---");
        System.out.println("---3: Niveau Difficile---");
        System.out.println("---0: Quitter---");
        choix = sc.nextInt();
        }
        
        if (choix==0)
            return;
        
        if(choix ==1){
            System.out.println("Niveau Facile : Le mystere est un nombre entre 0 et 100");
            int mystere = (int) ((Math.random() * ((100 - 0) + 1)) + 0) ;
            int tentative = 0;
            while(max1!=0){
                System.out.println("Donner le mystere entre 0 et 100");
                mystereChoix=sc.nextInt();
                tentative++;
                max1--;
                if(mystereChoix == mystere){
                    System.out.println("Bravo ! Vous avez gagnez au bout de "+tentative+" tentative");
                    return;
                }
                
                if(mystereChoix > mystere)
                    System.out.println("C'est moins , Il vous reste "+max1+" tentatives");
                if(mystereChoix < mystere)
                    System.out.println("C'est plus , Il vous reste "+max1+" tentatives");
            }
            System.out.println("Vous avez perdu votre nombre mystere a etait "+mystere);
        }


        if(choix ==2){
            System.out.println("Niveau Moyen : Le mystere est un nombre entre 0 et 10000");
            int mystere = (int) ((Math.random() * ((10000 - 0) + 1)) + 0) ;
            int tentative = 0;
            while(max2!=0){
                System.out.println("Donner le mystere entre 0 et 10000");
                mystereChoix=sc.nextInt();
                tentative++;
                max2--;
                if(mystereChoix == mystere){
                    System.out.println("Bravo ! Vous avez gagnez au bout de "+tentative+" tentative");
                    return;
                }
                
                if(mystereChoix > mystere)
                    System.out.println("C'est moins , Il vous reste "+max2+" tentatives");
                if(mystereChoix < mystere)
                    System.out.println("C'est plus , Il vous reste "+max2+" tentatives");
            }
            System.out.println("Vous avez perdu votre nombre mystere a etait "+mystere);
        }
        
        
        
            int mystere = (int) ((Math.random() * ((100 - 10) + 1)) + 10) ;
            int tentative = 0;
            String alpha ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int ascii = (int) ((Math.random() * ((25 - 0) + 1)) + 0);
            char mystereChar = alpha.charAt(ascii);
            String mystereChoixChar ;
            boolean foundNumber = false;
            boolean foundChar = false;
        
        if(choix == 3){

            while( max3!=0 ){
                System.out.println("Donner le mystere entre 10 et 100");
                mystereChoix=sc.nextInt();
                System.out.println("Donner le caractere entre A et Z");
                mystereChoixChar = sc.next().toUpperCase();
                
                tentative++;
                max3--;
                if(mystereChoix == mystere){
                    foundNumber = true ;
                    System.out.println("le nombre est correct");
                }
                if(ascii == alpha.indexOf(mystereChoixChar)){
                    foundChar = true ;
                    System.out.println("le charactere est correct");
                }
                
                if(!foundNumber && !foundChar && mystereChoix > mystere){
                    System.out.println("C'est plus pour le nombre");
                }
                if(!foundNumber && !foundChar && mystereChoix < mystere){
                    System.out.println("C'est moins pour le nombre");
                }
                
                
                if(!foundNumber && !foundChar && mystereChoixChar.charAt(0) > mystereChar){
                    System.out.println("C'est plus pour le charactere");
                }
                
                if(!foundNumber && !foundChar && mystereChoixChar.charAt(0) < mystereChar){
                    System.out.println("C'est plus pour le charactere");
                }
                
            if(foundNumber && foundChar){
            System.out.println("Bravo ! Vous avez gagnez au bout de "+tentative+" tentative");
            return ;
        }
                
                System.out.println("Il vous reste "+max3+" tentative");
                

            }
        }

        System.out.println("Vous avez perdu ! votre combinaison mystere etait "+mystere+mystereChar);
        
    }
    
}
