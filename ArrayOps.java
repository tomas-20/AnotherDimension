public class ArrayOps {
  public static int sum(int[] arr) {
    int output = 0;
    for (int i = 0; i < arr.length; i ++) {
      output += arr[i];
    }
    return output;
  }
  public static int largest(int[] arr) {
    int output = arr[0];
    for (int i = 1; i < arr.length; i ++) {
      int n = arr[i];
      if (n > output) {
        output = n;
      }
    }
    return output;
  }
  public static int[] cheese(int[][] matrix, boolean type) {
    int length = matrix.length;
    int[] output = new int[length];
    for (int i = 0; i < length; i ++) {
      if (type) {
        output[i] = sum(matrix[i]);
      }
      else {
        output[i] = largest(matrix[i]);
      }
    }
    return output;
  }
  public static int[] sumRows(int[][] matrix) {
    return cheese(matrix, true);
  }
  public static int[] largestInRows(int[][] matrix) {
    return cheese(matrix, false);
  }
  public static int sum(int[][] matrix) {
    return sum(sumRows(matrix));
  }
  public static int[][] rotate(int[][] matrix) {
    int length = matrix.length;
    int rowLength = matrix[0].length;
    int[][] output = new int[rowLength][length];
    for (int i = 0; i < length; i ++) {
      for (int j = 0; j < rowLength; j ++) {
        output[j][i] = matrix[i][j];
      }
    }
    return output;
  }
}
