import java.util.Arrays;

public class deleteElements {

    public static int deleteElements(int[] arr) {
        int countTwos = 0;
        int countOthers = 0;
        for (int element : arr) {
            if (element == 2) {
                countTwos++;
            } else {
                countOthers++;
            }
        }
        return countOthers == 1 ? 3 : 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        System.out.println(deleteElements(arr));
    }
}
