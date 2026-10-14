/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjConcurrency;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

public class Main {
    private static final Object lock = new Object();
    private static boolean siap = false;

    public static void main(String[] args) throws InterruptedException {
        Thread menunggu = new Thread(() -> {
            synchronized (lock) {
                while (!siap) {
                    try {
                        System.out.println("Thread menunggu...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Thread dilanjutkan!");
            }
        });
        menunggu.start();

        Thread.sleep(1000);

        synchronized (lock) {
            siap = true;
            lock.notify();
            System.out.println("notify() dipanggil");
        }
    }
}
