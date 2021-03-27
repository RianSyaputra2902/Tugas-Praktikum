package modul2_tugas;
public class Nomor2 {
    public static void main(String[] args){
        int[][] A = {
        {32, 23},
        {40, 26},
        {50, 35},
        };
    int[][] B = {
        {15, 9},
        {20, 23},
        {35, 20},
        };
    if((A.length==B.length)&&(A[0].length==B[0].length)){
    int[][] C=new int[A.length][A[0].length];
    for(int i=0;i<A.length;i++){
        for(int j=0;j<A[0].length;j++){
            C[i][j]+=A[i][j]-B[i][j];
        }
    }
    for(int[] c:C){
        for(int x:c){
            System.out.print(x+" ");
        }
        System.out.println();
        }
    }
    else{
        System.out.println("Ukuran Matriks Tidak Sama");
        }
    }
}
