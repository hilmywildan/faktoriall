/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah : ");
        int n = input.nextInt();
        
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print("0");

            for (int j = 0; j < i; j++)
                System.out.print("*");
            
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print("0");
            System.out.print("\n");
        }

        for (int i = n; i > 0; i -= 2) {
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print("0");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print("0");
            System.out.print("\n");
        }
    }
}
