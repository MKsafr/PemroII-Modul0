import java.util.Scanner ;

public class PRAK105_2210817210025_MuhammadKholidSyaifullah {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in) ;
        System.out.print("Masukan Makanan Favorit : ") ;
        String makanan = masuk.nextLine() ;
        System.out.print("Masukan Hobi : ") ;
        String hobi = masuk.nextLine() ;
        System.out.println("Aku suka makan " + makanan + ", dan Hobiku " + hobi) ;
        masuk.close() ;
    }
}
