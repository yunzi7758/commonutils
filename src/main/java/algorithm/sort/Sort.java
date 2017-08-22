package algorithm.sort;

/**
 * �����㷨
 * 1��������
 * 		1��������
 * 			ð�ݣ������������ݣ�
 * 			����
 * 		2ѡ������
 * 			ѡ��
 * 			��
 * 		3��������
 * 			����
 * 			shell
 * 		4�ϲ�����
 * 2��·�鲢����
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
		int ltemp,rtemp;//ָ��
		
		ltemp = left;
		rtemp = right;
		f = intarr[(left+right)/2];//���������������
		
		while (ltemp<rtemp) {
			//����߿�ʼ������һ������base��ָ��
			while (intarr[ltemp]<f) {
				++ltemp;
			}
			//���ұ߿�ʼ������һ��С��base��ָ��
			while (intarr[rtemp]>f) {
				--rtemp;
			}
			
			//�ҵ�ʱltempһ��С�ڵ���rtemp
			if (ltemp<=rtemp) {
				t = intarr[ltemp];//����ҵ��Ĵ�����temp
				intarr[ltemp] = intarr[rtemp];//�ұ��ҵ���С������ָ��λ�ã���ָ��λ���������С��base��
				intarr[rtemp] = t;//����ҵ��Ĵ�������ָ��λ�ã���ָ��λ�����ҵ�������base��
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
		for (int i = 0; i < intarr.length-j; i++) {//-j,û���һ����ѵ������ֵ����
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
				[1,2,3,4,5,6,7,8,9,10]=1*9��ͬ����ѵ
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
		 * һֱ��Ϊð���������ģ�ÿ�ν���ֵ��ǰ�棨i�������������ε�i�����ݶԱȲ���������ôiλ�þ�����ֵ����
		 * o=(len-1)+(len-2)+...+(len-(len-2))+1
		 * ----��i����Ҫ�ͺ���len-i�����Ƚ�,û���һ����ѵ������ֵð��
		 * ��ʵ
		 * ð���������������ݶԱȲ�����
		 * o=(len-1)+(len-2)+...+(len-(len-2))+1
		 * ----ÿ�������������len-i��ʾ�������Ҫ�ȽϵĴ�������û���һ����ѵ������ֵ����
		 * 
		 * Ŀǰ�������߲������¡�
		 * 
		 * �����Է��֣�
		 * ��һ�У���i�����ݱ��¾�����ֵ��ȴ���ò���Ҫ��i�����������ѵ
		 * �ڶ��У�ĳ�����ݱ����������õģ�ȴ��Ҫ��ѵ
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
