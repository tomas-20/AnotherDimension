import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int[] cheese = {8, 42, 2187, 379};
    System.out.println(ArrayOps.sum(cheese));
    System.out.println(ArrayOps.largest(cheese));
    int[][] queso = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(Arrays.toString(ArrayOps.sumRows(queso)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(queso)));
  }
}
