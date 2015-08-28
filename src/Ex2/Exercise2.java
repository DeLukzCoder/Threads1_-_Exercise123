/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author LukaszKrawczyk
 */
public class Exercise2 {

    public static void main(String[] args) {
        EvenNumbers even1 = new EvenNumbers();

        EvenThreadS thread1 = new EvenThreadS(even1);
        EvenThreadS thread2 = new EvenThreadS(even1);

        thread1.start();
        thread2.start();
    }

    public static class EvenNThread extends Thread {

        EvenNumbers even1;

        public EvenNThread(EvenNumbers even1) {
            this.even1 = even1;
        }

        @Override
        public void run() {
            System.out.println(even1.next());
        }
    }

    public static class EvenThreadS extends Thread {

        EvenNumbers even1;

        public EvenThreadS(EvenNumbers even1) {
            this.even1 = even1;
        }

        @Override
        public void run() {
            synchronized (even1) {
                System.out.println(even1.next());
            }
        }

    }

}
