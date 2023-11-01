/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package april.java;


import java.util.Scanner;
public class AprilJava {

    public static void main(String[] args) {
         double Nilai1, Nilai2, hasil;
        boolean hasil1;
        
        Scanner keyboard = new Scanner(System.in);
        //
//        ARITMATIKA
//        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 =keyboard.nextInt();
////
//        // penjumlahan
        hasil = Nilai1 + Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
////
        // pengurangan
        hasil = Nilai1 - Nilai2;
        System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
////
//        // perkalian
        hasil = Nilai1 * Nilai2;
        System.out.println("Hasil = " + hasil);
//
//
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
//
//        // Pembagian
        hasil = Nilai1 / Nilai2;
        System.out.println("Hasil = " + hasil);
//
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = Nilai1 % Nilai2;
        System.out.println("Hasil = " + hasil);
        
//        OPERATOR PENUGASAN
           
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Pengisian dan Penambahan
        hasil = Nilai1 += Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil += " + hasil);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        // Pengisian dan Pengurangan
        hasil = Nilai1 -= Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil -= " + hasil);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        //pengisian dan perkalian
        hasil = Nilai1 *= Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil *= " + hasil);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        //pengisian dan pembagian
        hasil = Nilai1 /= Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil /= " + hasil);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        //pengisian dan sisa bagi
        hasil = Nilai1 %= Nilai2;
        System.out.println("OPERATO PENUGASAN");
        System.out.println("Hasil %= " + hasil);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        
//          OPERATOR PEMBANDING
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();

        // Lebih besar
        hasil1 = Nilai1 > Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 > Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        //lebih kecil
         hasil1 = Nilai1 < Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 < Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        //sama dengan
         hasil1 = Nilai1 == Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 == Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        //tidak sama dengan
         hasil1 = Nilai1 != Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 != Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        //lebih besar sama dengan
         hasil1 = Nilai1 >= Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 >= Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        //lebih kecil sama dengan
         hasil1 = Nilai1 <= Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 <= Nilai2 = " + hasil1);
        
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();

//          OPERATOR BITWISE
        int Nilai3, Nilai4, hasil3;
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise and (&)
        hasil3 = Nilai3 & Nilai4;
        System.out.println("Bitwise and (&)");
        System.out.println("Nilai3 & Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise OR (|)
        hasil3 = Nilai3 | Nilai4;
        System.out.println("Bitwise OR (|)");
        System.out.println("Nilai3 | Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise XOR (|)
        hasil3 = Nilai3 ^ Nilai4;
        System.out.println("Bitwise OR (|)");
        System.out.println("Nilai3 ^ Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise Negasi (~)
        hasil3 = ~ Nilai4;
        System.out.println("Bitwise Negasi (~)");
        System.out.println("~Nilai4 = " + hasil3);
        
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-1: ");
        Nilai4 = keyboard.nextInt();
        // Bitwise left shift
        hasil3 = Nilai4 << Nilai3;
        System.out.println("Bitwise left shift (<<)");
        System.out.println("Nilai3 << Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-1: ");
        Nilai4 = keyboard.nextInt();
        //Bitwise right shift
         hasil3 = Nilai4 >> Nilai3;
        System.out.println("Bitwise right shift (>>)");
        System.out.println("Nilai3 >> Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-1: ");
        Nilai4 = keyboard.nextInt();
        //Bitwise right shift (unsigned)
         hasil3 = Nilai4 >>> Nilai3;
        System.out.println("Bitwise right shift (>>>)");
        System.out.println("Nilai3 >>> Nilai4 = " + hasil3);
        
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-1: ");
        Nilai4 = keyboard.nextInt();
        

        
    }
}
