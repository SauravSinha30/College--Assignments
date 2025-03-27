import java.util.Arrays;
public class Q2_CountingInversion {
    public static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            count += mergeSortAndCount(arr, temp, left, mid);
            count += mergeSortAndCount(arr, temp, mid + 1, right);
            count += mergeAndCount(arr, temp, left, mid, right);
        }
        return count;
    }
    public static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left, count = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, left, arr, left, right - left + 1);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1};
        int[] temp = new int[arr.length];

        int inversionCount = mergeSortAndCount(arr, temp, 0, arr.length - 1);
        System.out.println("Number of Inversions: " + inversionCount);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
