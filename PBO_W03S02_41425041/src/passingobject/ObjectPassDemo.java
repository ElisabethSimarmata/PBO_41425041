/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passingobject;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

public class ObjectPassDemo {

    int a, b;

    // Constructor
    ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }

    // Method untuk membandingkan objek
    boolean equalTo(ObjectPassDemo o) {
        return (o.a == a && o.b == b);
    }
}
