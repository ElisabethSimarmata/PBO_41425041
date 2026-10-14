/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

public class Geeks {
    
    static String name;
    static float price;
    
    static void set(String n, float p) {
        name = n;
        price = p;
    }
    
    static void get()
    {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + name);
    }
    
    public static void main(String args[])
    {
        Geeks.set("Visual studio", 0.0f);
        Geeks.get();
    }
}

