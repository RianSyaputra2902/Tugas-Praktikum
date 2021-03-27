package modul2_tugas;
public class Nomor1 {
    public static void main(String[] args) {
        int[][] angka = {
            {34, 56, 41},
            {45, 56, 37},
            {51, 32, 46},
        };
        for(int i=0;i<angka.length; i++){
            for (int j=0;j<angka.length;j++){
                System.out.print(angka[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
