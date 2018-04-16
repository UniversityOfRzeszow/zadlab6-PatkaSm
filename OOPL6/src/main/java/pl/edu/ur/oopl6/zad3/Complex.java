/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;

import java.util.Scanner;

/**
 *
 * @author Patrycja
 */
public class Complex {
    
    double r;
    double i;
    
    public static void sprzezenie(double r,double i)
    {
       System.out.println("Sprzężenie:");
       i = -i;
       System.out.println(r+""+i+"i");  
    }   
    
    public static double modul(double r,double i)
    {
        return Math.sqrt(r*r + i*i);
    }
    public static double kat(double r, double i) {
        double cos = r / modul(r, i);
        double sin = i / modul(r, i);

        if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) > 0) {
            return Math.toDegrees(Math.asin(sin));
        } else if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) < 0) {
            return Math.toDegrees(Math.asin(sin) + (Math.PI / 2));
        } else if (Math.toDegrees(Math.asin(sin)) < 0 && Math.toDegrees(Math.acos(cos)) < 0) {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 3 / 2));
        } else {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 2));
        }
    }
   public static void wykladnicza(double r, double i) {
         System.out.println(modul(r, i) + "*e^(" + kat(r, i) + "*i)");
        
    } 
    public static void algebr(double r, double i) {
         System.out.println((modul(r, i) * Math.cos(Math.toRadians(kat(r,i)))) + "+(" + (modul(r, i) * Math.sin(Math.toRadians(kat(r,i))))+"i");
        
    } 
   public static void dodawanie(double r,double i, double x, double y)
   {
       System.out.println( (x+r) + "+" + (y+i) + "i");
   }
   public static void odejmowanie(double r,double i, double x, double y)
   {
       System.out.println((r-x)+"+"+(i-y) +"i");  
   }
    public static void dzielenie(double r,double i, double x, double y)
   {
       double rzeczywista = (r*x+i*y)/x*x + y*y;
       double urojona = (i*x-r*y)/x*x + y*y;
       
       System.out.println(rzeczywista + "+" + urojona + "i");  
   }
    public static void mnozenie(double r,double i, double x, double y)
   {
       System.out.println(((x*r)-(i*y)) + "+" + ((x*i)+(r*y))+"i");
   }

     public static double dodWyklad(double mod1, double kat1, double mod2, double kat2) {
        Math.toRadians(kat1);
        Math.toRadians(kat2);
        double x = mod1 * Math.cos(kat1) + mod2 * Math.cos(kat2);
        double y = mod1 * Math.sin(kat1) + mod2 * Math.sin(kat2);
        return kat(x, y);
    }
    public static void dzielWyklad(double mod1, double kat1, double mod2, double kat2) {
        double mod = mod1 / mod2;
        double kat = kat1 - kat2;
       
       System.out.println(mod+"*e^("+kat+"i");
    }
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj część rzeczywistą i urojoną liczby: ");
    double r = in.nextDouble();
    double i = in.nextDouble();
}
     
}
