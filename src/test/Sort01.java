package test;

public class Sort01 {
	public static void main(String[] args) { // ������ ���ߴ� ��
		/* ������ �ϱ� ���ؼ��� ���� for�� ���
		 �ܺ�for�� i, ����for�� j
		 1. ���� ����
		 {5,3,1,4,2}
		 1��
			3 5
			  1 5
			    4 5
			      2 5
		   {3,1,4,2,5}
		   ...���� */
		int[] arr = {5,3,1,4,2};
		
		for(int i = 0; i<5; i++) {
			for(int j=0;j<4;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1]; // �̰͸� ���� �ڸ��ٲ� �Ұ�
					arr[j+1] = tmp;
				}
			}
			System.out.println("#### "+(i+1) + "�� ####");
			System.out.println(arr[0] + " " + arr[1]+ " "+arr[2] + " "+arr[3] + " "+arr[4]);
		}
		
		
		 /*2. ���� ����
		  * �ϳ��� ���ڸ� �����ؼ� ����
		   {5,3,1,4,2}
		   1��
		   3 5
		   1   3
		   1     4
		   1       2
		   {1,5,3,4,2}
		   2��
		   1 3 5
		   1 3   4
		   1 2     3
		   {1,2,5,4,3}
		   ...���
		   */
		int[] arr1 = {5,3,1,4,2};
		
		int idx = 0;
		int tmp = 0;
		
		for(int i =0;i<arr1.length;i++) {
			idx = i;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[j] < arr1[i]) {
					tmp = j;
				}
			}
		}
		 /*3. ���� ����
		  */
	}
}
