import java.util.Arrays;
public class Tester {
  public static int[][] splitArray(int[] arr, int rowSize) {
    int rows = arr.length / rowSize;
    int[][] output = new int[rows][rowSize];
    for (int i = 0; i < rows; i ++) {
      for (int j = 0; j < rowSize; j ++) {
        output[i][j] = arr[i * rowSize + j];
      }
    }
    return output;
  }
  public static void main(String[] args) {
    int rowSize = Integer.parseInt(args[0]);
    int length = args.length - 1;
    int[] arr = new int[length];
    for (int i = 0; i < length; i ++) {
      arr[i] = Integer.parseInt(args[i + 1]);
    }
    int[][] arr2d = splitArray(arr, rowSize);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.deepToString(arr2d));
    System.out.println(ArrayOps.sum(arr));
    System.out.println(ArrayOps.largest(arr));
    System.out.println(Arrays.toString(ArrayOps.sumRows(arr2d)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(arr2d)));
    System.out.println(ArrayOps.sum(arr2d));
  }
}
