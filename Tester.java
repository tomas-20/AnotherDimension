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
    int row = Integer.parseInt(args[1]);
    int col = Integer.parseInt(args[2]);
    int length = args.length - 3;
    int[] arr = new int[length];
    for (int i = 0; i < length; i ++) {
      arr[i] = Integer.parseInt(args[i + 3]);
    }
    int[][] arr2d = splitArray(arr, rowSize);
    System.out.println("arr:");
    System.out.println(Arrays.toString(arr));
    System.out.println("arr2d:");
    System.out.println(Arrays.deepToString(arr2d));
    System.out.println("row:");
    System.out.println(row);
    System.out.println("col:");
    System.out.println(col);
    System.out.println("sum(arr):");
    System.out.println(ArrayOps.sum(arr));
    System.out.println("largest(arr):");
    System.out.println(ArrayOps.largest(arr));
    System.out.println("sumRows(arr2d):");
    System.out.println(Arrays.toString(ArrayOps.sumRows(arr2d)));
    System.out.println("largestInRows(arr2d):");
    System.out.println(Arrays.toString(ArrayOps.largestInRows(arr2d)));
    System.out.println("sum(arr2d):");
    System.out.println(ArrayOps.sum(arr2d));
    System.out.println("rotate(arr2d):");
    System.out.println(Arrays.deepToString(ArrayOps.rotate(arr2d)));
    System.out.println("sumCols(arr2d):");
    System.out.println(Arrays.toString(ArrayOps.sumCols(arr2d)));
    System.out.println("isSame(arr):");
    System.out.println(ArrayOps.isSame(arr));
    System.out.println("isRowMagic(arr2d):");
    System.out.println(ArrayOps.isRowMagic(arr2d));
    System.out.println("isColMagic(arr2d):");
    System.out.println(ArrayOps.isColMagic(arr2d));
    System.out.println("isLocationMagic(arr2d, row, col):");
    System.out.println(ArrayOps.isLocationMagic(arr2d, row, col));
  }
}
