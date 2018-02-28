
/**
 * 冒泡排序(以及改进)
 * 
 * @author zhang
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		bubbleSort();
	}

	public static void bubbleSort() {
		//是否需要继续循环排序
		boolean isNeedFor = true;   
		int[] values = new int[] { 1, 5, 2, 6, 3, 9, 8 };
		int temp = 0;
		for (int i = 1; i < values.length && isNeedFor; i++) {
			isNeedFor = false;
			for (int j = 0; j < values.length - i; j++) {
				if (values[j] > values[j + 1]) {
					temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
					isNeedFor = true;
				}
			}
		}
		for(int result : values) {
			System.out.println(result);
		}
	}
}
