
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 30, 40, 40, 50};

        int n = arr.length;
        int j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
