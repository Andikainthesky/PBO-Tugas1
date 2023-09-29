package belajar.Java;

import java.util.Scanner;

public class Array1D {
    public static void main (String[] args){
        Scanner name = new Scanner(System.in);
        //Objek dan atribut untuk menginputkan data dengan keyboard
        String[] nama = new String[3];

        System.out.println("Masukkan Nama ke 1 : ");
        nama[0] = name.nextLine();
        //penginputan Nama ke 1
        System.out.println("Masukkan Nama ke 2 : ");
        nama[1] = name.nextLine();
        //Penginputan Nama ke 2
        System.out.println("Masukkan Nama ke 3 : ");
        nama[2] = name.nextLine();
        //Penginputan Nama ke 3

        System.out.println("Nama Anak Pertama : " + nama[0]);
        //Hasil output Ke 1
        System.out.println("Nama Anaka Kedua : " + nama[1]);
        //Hasil output ke 2
        System.out.println("Nama Anak Ketiga : " + nama[2]);
        //Hasil output ke 3

    }
    
}
