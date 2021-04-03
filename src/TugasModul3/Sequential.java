package TugasModul3;
import java.util.Scanner;
public class Sequential {
     public static void main (String[]args){
        System.out.println("****** SEQUENTIAL SEARCH ******"+"\n");
            int data [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };//isi array
            Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Data Yang di Cari: ");
            int key = scan.nextInt();// nilai yang dicari
        
        //menampilkan data array
        System.out.print("Isi Data Adalah: ");
            for (int i = 0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
            for (int i = 0; i<= data.length; i++){
            if (key == data [i]){ // nilai data yang dicari
                System.out.print("data "+key+" berada pada indeks ke : "+i);
                break;// stop perulangan
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println(" ***** TERIMA KASIH *****");
        System.out.println();
        System.out.println("FIRDA NUR FALAH");
    }
    
}
