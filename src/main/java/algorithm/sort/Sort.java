package algorithm.sort;

/**
 * 排序算法
 * 1基本排序
 * 		1交换排序
 * 			冒泡（交换相邻数据）
 * 			快速
 * 		2选择排序
 * 			选择
 * 			堆
 * 		3插入排序
 * 			插入
 * 			shell
 * 		4合并排序
 * 2多路归并排序
 * @author Administrator
 *
 */
public class Sort {

	
	public static void main(String[] args) {
		int[] intarr = {3,6,7,4,8,10,5,9,1,2};
//		doubleSort(intarr);
		quickSort(intarr, 0, intarr.length-1);
	}

	private static void quickSort(int[] intarr ,int left ,int right) {
		int f,t;//base,temp
		int ltemp,rtemp;//指针
		
		ltemp = left;
		rtemp = right;
		f = intarr[(left+right)/2];//整数相除还是整数
		
		while (ltemp<rtemp) {
			//从左边开始往右找一个大于base的指针
			while (intarr[ltemp]<f) {
				++ltemp;
			}
			//从右边开始往左找一个小于base的指针
			while (intarr[rtemp]>f) {
				--rtemp;
			}
			
			//找到时ltemp一定小于等于rtemp
			if (ltemp<=rtemp) {
				t = intarr[ltemp];//左边找到的大数给temp
				intarr[ltemp] = intarr[rtemp];//右边找到的小数给左指针位置（左指针位置以左的数小于base）
				intarr[rtemp] = t;//左边找到的大数给右指针位置（右指针位置以右的数大于base）
				--rtemp;
				++ltemp;
			}
		}
		if (rtemp == ltemp) {
			++ltemp;
		}
		if (left < rtemp) {
			quickSort(intarr, left, ltemp-1);
		}
		if (right > ltemp) {
			quickSort(intarr, rtemp+1, right);
		}
	}
	private static void doubleSort(int[] intarr) {
		
		int times = 0 , newtimes = 0;
		/*for (int j = 1; j < intarr.length; j++) {
		for (int i = 0; i < intarr.length-j; i++) {//-j,没完成一次轮训都有最值沉底
			if (intarr[i]>intarr[i+1]) {
				int t = intarr[i];
				intarr[i] = intarr[i+1];
				intarr[i+1] = t;
			}
			newtimes++;
		}print(intarr);
		}*/
		/*
				[3,6,4,7,8,5,9,1,2,10]
				[3,4,6,7,5,8,1,2,9,10]
				[3,4,6,5,7,1,2,8,9,10]
				[3,4,5,6,1,2,7,8,9,10]
				[3,4,5,1,2,6,7,8,9,10]
				[3,4,1,2,5,6,7,8,9,10]
				[3,1,2,4,5,6,7,8,9,10]
				[1,2,3,4,5,6,7,8,9,10]=1*9
				[1,2,3,4,5,6,7,8,9,10]=1*9相同的轮训
				[1,2,3,4,5,6,7,8,9,10]=1*9
				0:45*/
		
		/*for (int i = 0; i < intarr.length-1; i++) {
			if (intarr[i]>intarr[i+1]) {
				int t = intarr[i];
				intarr[i] = intarr[i+1];
				intarr[i+1] = t;
				newtimes++;
			}
			print(intarr);
		}*/
		/*
				[3,6,7,4,8,10,5,9,1,2]
				[3,6,7,4,8,10,5,9,1,2]
				[3,6,4,7,8,10,5,9,1,2]==
				[3,6,4,7,8,10,5,9,1,2]==
				[3,6,4,7,8,10,5,9,1,2]==
				[3,6,4,7,8,5,10,9,1,2]
				[3,6,4,7,8,5,9,10,1,2]
				[3,6,4,7,8,5,9,1,10,2]
				[3,6,4,7,8,5,9,1,2,10]
		*/
		
		/**
		 * 一直以为冒泡是这样的，每次将最值放前面（i后面所有数依次第i个数据对比并交换，那么i位置就是最值）。
		 * o=(len-1)+(len-2)+...+(len-(len-2))+1
		 * ----第i个数要和后面len-i个数比较,没完成一次轮训都有最值冒顶
		 * 其实
		 * 冒泡排序是相邻数据对比并交换
		 * o=(len-1)+(len-2)+...+(len-(len-2))+1
		 * ----每次相邻数据相比len-i表示间隔数（要比较的次数），没完成一次轮训都有最值沉底
		 * 
		 * 目前来看两者不相上下。
		 * 
		 * 但测试发现：
		 * 第一中，第i个数据本事就是最值，却不得不还要和i后面的数据轮训
		 * 第二中，某段数据本身就是排序好的，却还要轮训
		 */
		for (int i = 0; i < intarr.length; i++) {
			for (int j = i+1; j < intarr.length; j++) {
				if (intarr[i]>intarr[j]) {
					int t = intarr[i];
					intarr[i] = intarr[j];
					intarr[j] = t;
				}
				times++;
			}
			print(intarr);
		}
			/*[1,6,7,4,8,10,5,9,3,2]
				[1,2,7,6,8,10,5,9,4,3]
				[1,2,3,7,8,10,6,9,5,4]
				[1,2,3,4,8,10,7,9,6,5]
				[1,2,3,4,5,10,8,9,7,6]
				[1,2,3,4,5,6,10,9,8,7]
				[1,2,3,4,5,6,7,10,9,8]
				[1,2,3,4,5,6,7,8,10,9]
				[1,2,3,4,5,6,7,8,9,10]
				[1,2,3,4,5,6,7,8,9,10]
				45*/
		System.out.println(times+":"+newtimes);
	}

	private static void print(int[] intarr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < intarr.length; i++) {
			sb.append(intarr[i]);
			if (i<intarr.length-1) {
				sb.append(",");
			}
		}
		sb.append("]");
		System.out.println(sb);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
