package class_examples;

public class Main {
    public static void main(String[] args) {

        // dizide en çok tekrar eden sayı dışında kalanları silecek ve bu adımı min. silmede yapacak.
        // Silme sayısını ekrana yazdıracak.

        int [] arr = {3,5,3,2,1};
        ArrControler arrControler = new ArrControler();
        System.out.println(arrControler.Controler(arr));
    }
}
