/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadu;
import java.util.Scanner;
/**
 *
 * @author Zidan
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Program Start");
        System.out.println("Inputan : ");
        Scanner in = new Scanner(System.in);
        Dadu dadu = new Dadu();
        String kode;

        while (true) {
            kode = in.nextLine().toLowerCase();
            if (kode.equals("q"))
                break;
            System.out.println(dadu.parse(kode));
        }
    }
}

