package codeTree.practice;
import java.util.Scanner;

public class Maximum_sum_of_element_values { //원소값들의 최대 합

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = 0;

        int[] arr = new int[n];
        for(int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n;i++){
            int cnt = 0;
            int sum = 0;
            int index = arr[i];
            while(cnt < m){
                sum += index;
                //System.out.println((cnt+1)+"번째 합: "+sum);

                int tmp=arr[index-1];
                //arr[index-1] = index;
                index = tmp;

                cnt++; 
                
            }
            
            if(sum > max){
               // System.out.println("합: "+sum);
                max = sum;
            }
        }

        System.out.print(max);
	}

}
