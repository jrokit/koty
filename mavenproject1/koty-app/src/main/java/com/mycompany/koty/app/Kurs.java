/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koty.app;






import com.mycompany.koty.domain.Kot;
import com.mycompany.koty.domain.KotDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrokita
 */
public class Kurs {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    private Kot kot;
    public static void main(String[] args) {
        
            // TODO code application logic here
        System.out.println("Menu: D - dodaj kota, Z- zobacz kota, X- koniec");
        boolean exit = true;
        String inPutString;
        KotDAO kotDAO = new KotDAO();
        do {            
            inPutString =  getUserString();
            switch (inPutString){
                case "D": System.out.println("Dodaj");
                            kotDAO.dodajKota(tworzKot());
                            break;
                case "Z": System.out.println("Zobacz");
                            kotDAO.getListaKotow();
                            break;
                case "X": System.out.println("Koniec");
                            exit = false;
                            break;
                default: System.err.println("Zly wybor");
                    
                
            }
            
        } while (exit);
            
        
        
    }

    /**
     *
     * @return
     */
    public static Kot tworzKot(){
        Kot nowyKot = new Kot();
        boolean bError = true;
        
        System.out.println("Podaj imie");
        nowyKot.setImie(getUserString());
        
        System.out.println("Podaj imie Wlasciciela");
        nowyKot.setImieOp(getUserString());
      
        System.out.println("Podaj date urodzenia w formacie YYYY-MM-DD");
     
        do {            
           try {
            nowyKot.setData(sdf.parse(getUserString()));
            bError =false;
        } catch (Exception e) {
               System.out.println("Dupa zla data");
        }
        } while (bError);
        
        
        System.out.println("Podaj wage z przecinkiem");
        bError=true;
        
        do {            
           try {
            String wagaString = getUserString();
            Float wagaFloat = new Float(wagaString);
            nowyKot.setWaga(wagaFloat);
            bError =false;
        } catch (NumberFormatException e) {
               System.out.println("Dupa zla waga" +e);
        }
        } while (bError);
        
               
        
        
        return nowyKot;
    }
    
    
    
    public static void tworzycKoty() {
        Kot Maja = new Kot();
        //boolean bError=true;
           
        try {
            Maja.setData(sdf.parse("30-03-2016"));
        } catch (ParseException ex) {
            Logger.getLogger(Kurs.class.getName()).log(Level.SEVERE, null, ex);
        }
        Maja.setImie("Maja");
        Maja.setImieOp("Jaras");
        Maja.setWaga(10.5f);
        
        
        Kot NowyKot = new Kot();
        
        try {
            NowyKot.setData(sdf.parse("30-03-2016"));
        } catch (ParseException ex) {
            Logger.getLogger(Kurs.class.getName()).log(Level.SEVERE, null, ex);
        }
        NowyKot.setImie("Kicia");
        NowyKot.setImieOp("Werca");
        NowyKot.setWaga(10.6f);   

        Kot Pow = new Kot();        
         try {
            Pow.setData(sdf.parse("30-04-2016"));
        } catch (ParseException ex) {
            Logger.getLogger(Kurs.class.getName()).log(Level.SEVERE, null, ex);
        }
        Pow.setImie("Pow");
        Pow.setImieOp("Jaras");
        Pow.setWaga(12.5f);
        
        KotDAO bazaKotow = new KotDAO();
        bazaKotow.dodajKota(Pow);
        bazaKotow.dodajKota(Maja);
        bazaKotow.dodajKota(NowyKot);
        
        bazaKotow.getListaKotow();
       // System.out.println("Podaj imie");
        //NowyKot.setImie(getUserString());
      
        
  /*      System.out.println("Podaj date urodzenia w formacie YYYY-MM-DD");
     
        
        do {            
           try {
            NowyKot.setData(sdf.parse(getUserString()));
            bError =false;
        } catch (Exception e) {
               System.out.println("Dupa zla data");
        }
        } while (bError);
        
        
        System.out.println("Podaj wage z przecinkiem");
        bError=true;
        
        do {            
           try {
            String wagaString = getUserString();
            Float wagaFloat = new Float(wagaString);
            NowyKot.setWaga(wagaFloat);
            bError =false;
        } catch (NumberFormatException e) {
               System.out.println("Dupa zla waga" +e);
        }
        } while (bError);
        
        System.out.println("Nowy Kot "+NowyKot.przedstawSie());        
*/
    }
    public static String getUserString()
    {
     return sc.nextLine();
    }

    
}
