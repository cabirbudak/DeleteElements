package class_examples;

public class ArrControler {
    public int Controler(int[] arr) {
        int max = 0;
        int maxArr = 0;
        int x = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }

        }
        int[] arrControler = new int[(max + 1)];

        for (int i = 0; i < arr.length; i++) {

            arrControler[arr[i]] += 1;
        }

        for (int j : arrControler) {
            if (j > maxArr) {
                maxArr = j;
            }
        }

        x = arr.length - maxArr;

        return x;
    }
}