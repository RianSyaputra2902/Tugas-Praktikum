package modul2_tugas;
public class Nomor3 {
    public static void main(String[] args){
        int[][] A ={
            {25, 19},
            {11, 10},
            {21, 31}
        };
        int[][] B = {
            {22, 13, 27},
            {32, 18, 31}
        };
        if (A[0].length == B.length){
           int[][] C = new int[A.length][B[0].length];
           for(int i=0; i<A.length; i++){
               for(int j=0; j<B[0].length; j++){
                   for(int k=0; k<A[0].length; k++){
                       C[i][j] += A[i][k] * B[k][j];
                   }
               }
           }
           for(int[] x:C){
               for(int i:x){
                   System.out.print(i + " ");
               }
               System.out.println();
           }
        }else{
            System.out.println("Ukuran Kolom A tidak sama dengan baris B");
        }
    }
    
}
