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
  public static int[] sumRows(int[][] matrix) {
    int length = matrix.length;
    int[] output = new int[length];
    for (int i = 0; i < length; i ++) {
      output[i] = sum(matrix[i]);
    }
    return output;
  }
  public static int[] largestInRows(int[][] matrix) {
    int length = matrix.length;
    int[] output = new int[length];
    for (int i = 0; i < length; i ++) {
      output[i] = largest(matrix[i]);
    }
    return output;
  }
}
