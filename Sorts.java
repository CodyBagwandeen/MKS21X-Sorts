import java.lang.*;
import java.util.*;
public class Sorts {
  //choose the smallest put it into ary[0]
  //choose the next smallest put it into ary[1]  (you can ignore the slots before the current position)
  //choose the next smallest put it into ary[2]  (you can ignore the slots before the current position)
  public static void selectionsort( int[] ary) {
    for( int i = 0; i < ary.length; i++) {
      int val = ary[i];
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

  public static void bubblesort( int [] ary) {
    boolean Sorted = false;

  }

  public static void main( String[] args){
    int[] a = {15,2,-3,189,-1231,7,5,9,7,12};
    int[] b = {15,2123,-1,19,31,-7,5,-9,97,12};
    int[] c = {115,2,-3234,-189,-1231,37,-5,9,7,-612};
    int[] d = {-125,2,-3,189,1231,7,5,9,-7,12};
    int[] e = {15,2,-3345345,-189,-1231,-7,-5578,9,7,12};

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(d));
    System.out.println(Arrays.toString(e));

    selectionsort(a);
    selectionsort(b);
    selectionsort(c);
    selectionsort(d);
    selectionsort(e);

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(d));
    System.out.println(Arrays.toString(e));
  }
}
