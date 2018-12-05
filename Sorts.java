import java.lang.*;
import java.util.*;
public class Sorts {
  //choose the smallest put it into ary[0]
  //choose the next smallest put it into ary[1]  (you can ignore the slots before the current position)
  //choose the next smallest put it into ary[2]  (you can ignore the slots before the current position)
  public static void selectionsort( int[] ary) {
    for( int i = 0; i < ary.length; i++) {
      int val = 0;
      int index = 0;
      int temp = 0;
      for( int j = i; j < ary.length; j++) {
        if( ary[j] <= val) {
          val = ary[j];
          index = j;
        }
      }
      temp = ary[i];
      ary[i] = val;
      ary[index] = temp;
    }
    //System.out.println(Arrays.toString(ary));
  }

  public static void main( String[] args){
    int[] a = {15,2,-3,189,-1231,7,5,9,7,12};

    System.out.println(Arrays.toString(a));

    selectionsort(a);

    System.out.println(Arrays.toString(a));
  }
}
