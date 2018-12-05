public class sort {
  //choose the smallest put it into ary[0]
  //choose the next smallest put it into ary[1]  (you can ignore the slots before the current position)
  //choose the next smallest put it into ary[2]  (you can ignore the slots before the current position)
  public static void selectionsort( int[] ary) {
    int[] temp = new int[ary.length];
    for( int i = 0; i < ary.length; i++) {
      int val = 0;
      for( int j = 0; j < ary.length; j++) {
        if( val < ary[j])
        val = j;
      }
      temp[i] = val;
    }
    ary = temp;
  }
}
