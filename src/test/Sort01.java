package test;

public class Sort01 {
	public static void main(String[] args) { // 순서를 맞추는 것
		/* 정렬을 하기 위해서는 이중 for문 사용
		 외부for문 i, 내부for문 j
		 1. 버블 정렬
		 {5,3,1,4,2}
		 1차
			3 5
			  1 5
			    4 5
			      2 5
		   {3,1,4,2,5}
		   ...연속 */
		int[] arr = {5,3,1,4,2};
		
		for(int i = 0; i<5; i++) {
			for(int j=0;j<4;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1]; // 이것만 쓰면 자리바꿈 불가
					arr[j+1] = tmp;
				}
			}
			System.out.println("#### "+(i+1) + "차 ####");
			System.out.println(arr[0] + " " + arr[1]+ " "+arr[2] + " "+arr[3] + " "+arr[4]);
		}
		
		
		 /*2. 선택 정렬
		  * 하나의 숫자를 선택해서 정렬
		   {5,3,1,4,2}
		   1차
		   3 5
		   1   3
		   1     4
		   1       2
		   {1,5,3,4,2}
		   2차
		   1 3 5
		   1 3   4
		   1 2     3
		   {1,2,5,4,3}
		   ...계속
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
		 /*3. 삽입 정렬
		  */
	}
}
