/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gettersetter2;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

public class GetSet {

    private int num;

    // Setter
    public void setNumber(int number) {

        // Validasi nilai
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException();
        }

        num = number;
    }

    // Getter
    public int getNumber() {
        return num;
    }
}
