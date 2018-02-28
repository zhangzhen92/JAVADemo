import java.lang.System.Logger;

/**
 * 归并排序（将数据分为两半 每部分递归的应用归并排序，，两部分都排好序，在进行归并）
 * 
 * @author zhang
 *
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] value = new int[] { 22, 11, 66, 99, 33, 55, 77, 88 };
		mergeSort(value);
		for (int result : value) {
			System.out.println(result);
		}
	}

	// private static void mergeSort() {
	// merge(list[0]....list[list.size / 2]);
	// merge(list[list.size / 2 + 1] ... list[list.size])
	// merge(list[0]....list[list.size / 2]) with merge(list[list.size / 2+1]
	// ...list[list.size])
	// }

	private static void mergeSort(int[] value) {
		if (value.length > 1) {
			int[] firstHalf = new int[value.length / 2];
			System.arraycopy(value, 0, firstHalf, 0, firstHalf.length);
			mergeSort(firstHalf);

			int[] secondHalf = new int[value.length - value.length / 2];
			System.arraycopy(value, value.length / 2, secondHalf, 0, secondHalf.length);
			mergeSort(secondHalf);
			int[] temp = mSort(firstHalf, secondHalf);
			System.arraycopy(temp, 0, value, 0, temp.length);
		}
	}

	private static int[] mSort(int[] list1, int[] list2) {
		int[] temp = new int[list1.length + list2.length];
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		while (current1 < list1.length && current2 < list1.length) {
			if (list1[current1] < list2[current2]) {
				temp[current3++] = list1[current1++];
			} else {
				temp[current3++] = list2[current2++];
			}
		}
		while (current1 < list1.length) {
			temp[current3++] = list1[current1++];
		}
		while (current2 < list2.length) {
			temp[current3++] = list2[current2++];
		}
		return temp;
	}

	/**
	 * 进行对半排序
	 * 
	 * @param secondHalf
	 */

}
