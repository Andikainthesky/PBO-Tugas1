package belajar.Java;

public class Kondisional {
    public static void main(String[] args){
        int nilai = 5;

        for(int i = 1; i<=nilai; i++){
            if ( i % 2 == 0 ){
                System.out.println(i + "merupakan bilangan genap");
            } else {
                System.out.println(i + "merupakan bilangan ganjil");
            }
        }

        int j = 1;
        while ( j <= nilai){
            System.out.println("Barisan ke "+ j);
            j++;
        }
        int k = 1;
        do {
            System.out.println("Barisan ke " + k);
            k++;
        } while (k <= nilai);
    }
}