package belajar.Java;

public class Array2D {
    public static void main (String[] args){
        int [][] a = {{1, 2, 3, 4}, {5, 6, 7, 8},{9, 10, 11, 12}};
        //tanda [][] tetap kosong. berbeda dengan di C++ harus mengisi nilai nya [3][4]
        System.out.println("Menampilkan nilai elemen array 2 dimensi 3x4");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j<4; j++){
                System.out.println( a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
