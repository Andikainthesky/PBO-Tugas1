package belajar.Java;

import java.util.Scanner;

public class Inputoutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama, prodi, nim;

        System.out.println("Masukkan nama   : ");
        nama = input.nextLine();
        //Bagian Input Nama

        System.out.println("Masukkan NIM    : ");
        nim = input.nextLine();
        //Bagian Input NIM

        System.out.println("Masukkan Prodi   : ");
        prodi = input.nextLine();
        //Bagian Input Prodi

        System.out.println("-----------------------------");
        System.out.println("Data diri");
        System.out.println("-----------------------------");
        System.out.println("Nama    : " + nama);
        //ini adalah OUTPUT variabel nama
        System.out.println("NIM : " + nim);
        //ini adalah OUTPUT variabel NIM
        System.out.println("Fakultas    : " + prodi);
        //ini adalah OUTPUT variabel prodi
    }
    
}
