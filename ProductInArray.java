/*
Given an array of integers, return an array where each respective
location contains the product of the numbers except the one that
occupied this same location in the input array. T
hus, given in={1,2,3}, out={6,3,2}.
*/

import java.util.*;

public class ProductInArray {
  public static void main(String[] args) {
      int[] input = {1, 2, 3, 4, 5};

      ProductInArray pa = new ProductInArray();
      int[] output = pa.getProductOutput(input);

      for (int i=0; i<output.length; i++) {
        System.out.println(output[i]);
      }
  }

  public int[] getProductOutput(int[] inputArray) {
    int[] outputArray = new int[inputArray.length];

    int totalProduct = 1;
    for (int i=0; i<inputArray.length; i++) {
      totalProduct *= inputArray[i];
    }

    for (int j=0; j<inputArray.length; j++) {
      outputArray[j] = totalProduct / inputArray[j];
    }

    return outputArray;
  }

}
