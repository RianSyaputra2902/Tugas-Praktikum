package modul2_tugas;
import java.util.Scanner;
public class Nomor4 {
    public static void main(String[] args){
        int i,j,m,n;
        int matriks[][] = new int[10][10];
        int transpose[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Jumlah Baris Matriks");
        m=sc.nextInt();
        System.out.println("Masukan Jumlah Kolom Matriks");
        n=sc.nextInt();
        System.out.println("Masukan Element Matriks");
        for(i=0;i < m;i++){
            for(j=0;j < n;j++){
                matriks[i][j]=sc.nextInt();
            }
        }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                transpose[j][i]=matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose Matriks : ");
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                System.out.println(transpose[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
