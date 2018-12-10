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
    while( !Sorted) {
      for( int i = 0; i < ary.length; i++) {
        Sorted = true;
        for ( int j = 0; j < ary.length - ( i+ 1); j++) {
          if ( ary[j] > ary[j+1]) {
            int a = ary[j];
            int b = ary[j+1];
            ary[j] = b;
            ary[j+1] = a;
            Sorted = false;
          }
        }
      }
    }

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
    System.out.println(" \n");

    //selectionsort(a);
    //selectionsort(b);
    //selectionsort(c);
    //selectionsort(d);
    //selectionsort(e);

    bubblesort(a);
    bubblesort(b);
    bubblesort(c);
    bubblesort(d);
    bubblesort(e);

    System.out.println("A sorted : [-1231, -3, 2, 5, 7, 7, 9, 12, 15, 189]");
    System.out.println("B sorted : [-9, -7, -1, 5, 12, 15, 19, 31, 97, 2123]");
    System.out.println("C sorted : [-3234, -1231, -612, -189, -5, 2, 7, 9, 37, 115]");
    System.out.println("D sorted : [-125, -7, -3, 2, 5, 7, 9, 12, 189, 1231]");
    System.out.println("E sorted : [-3345345, -5578, -1231, -189, -7, 2, 7, 9, 12, 15]");
    System.out.println("\n");


    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(d));
    System.out.println(Arrays.toString(e));
  }
}
