/**
 * 插入排序
 * @author zhang
 *
 */
public class InsertSort {
   public static void main(String[] args) {
	InsertSort();
}

   /**
    * 插入排序
    */
private static void InsertSort() {
  int[] values = new int[] {33,55,22,99,66,88,77,11};	
  int temp = 0;
  for (int i = 0; i < values.length; i++) {
	 temp = values[i];
	 int j = i -1;
	 for(; j>=0 && temp < values[j];j--) {
		 values[j+1] = values[j];
	 }
	 values[j + 1] = temp;
}
  for(int resule : values) {
	  System.out.println("the Sort value is  "+resule);
  }
}

}
