/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clone_method;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

public class Geeks implements Cloneable {
    @Override //method 1
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // super mengacu ke parent class
    }

    String name = "GeeksForGeeks";

    public static void main(String[] args) {
        Geeks o1 = new Geeks();
        try {
            Geeks o2 = (Geeks) o1.clone();
            System.out.println(o2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}