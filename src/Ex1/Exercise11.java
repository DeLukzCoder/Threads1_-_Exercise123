package Ex1;

import sun.nio.cs.ext.Big5_HKSCS_2001;
import sun.org.mozilla.javascript.internal.ast.Assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LukaszKrawczyk
 */
public class Exercise11 {

    public static void main(String[] args) {

        Assignment1 Asg1 = new Assignment1();
        Assignment2 Asg2 = new Assignment2();
        Assignment3 Asg3 = new Assignment3();

        try {
            Asg1.start();
            Asg2.start();
            Asg3.start();
            Thread.sleep(10000);
            Asg3.setv1(false);
        } catch (Exception e) {
        }
    }

    public static class Assignment1 extends Thread {

        @Override
        public void run() {

            long sum = 0;
            for (int i = 0; i < 1000000000; i++) {
                sum += i;

            }
            System.out.println(sum);
        }
    }

    public static class Assignment2 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(i);

                    sleep(2000);
                } catch (Exception e) {
                }
            }
        }
    }

    public static class Assignment3 extends Thread {

        boolean v1 = true;
        int i = 10;

        @Override
        public void run() {

            while (v1) {
                try {
                    System.out.println(i);
                    i++;
                    sleep(3000);
                } catch (Exception e) {
                }
            }
        }

        public void setv1(boolean v1) {
            this.v1 = v1;
        }
    }
}
