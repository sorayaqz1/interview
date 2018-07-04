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
      ArrayList output = pa.getProductOutput(input);
      System.out.println(output);
  }

  public ArrayList getProductOutput(int[] inputArray) {
    ArrayList outputArray = new ArrayList();

    int frontProduct = 1;
    for (int i=0; i<inputArray.length; i++) {

      int value = (int)inputArray[i];

      int remainderProuct = 1;
      for (int j=i+1; j<inputArray.length; j++) {
        remainderProuct *= (int)inputArray[j];
      }
      // System.out.println(i);
      // System.out.println("frontProduct-"+frontProduct);
      // System.out.println("remainderProuct-"+remainderProuct);

      int product = frontProduct * remainderProuct;
      outputArray.add(i, product);
      frontProduct *= value;
    }
    return outputArray;
  }

}
