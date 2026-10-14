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

public class Main {

    public static void main(String args[]) {

        // Membuat tiga objek
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);

        // Membandingkan objek pertama dengan objek kedua
        System.out.println(
            "ob1 == ob2: "
            + ob1.equalTo(ob2)
        );

        // Membandingkan objek pertama dengan objek ketiga
        System.out.println(
            "ob1 == ob3: "
            + ob1.equalTo(ob3)
        );
    }
}
