import java.util.Arrays;
import java.util.Scanner;


public class SieveofEratosthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int []arr = new int[num+1];
		
		Arrays.fill(arr, -1);//for initialize all values as -1
		
		int len = arr.length;
		for(int i=2;i<len;i++){
			if(arr[i]==-1){//if arr[i]=-1 then goto inside the condition
				for(int j=2;i*j<len;j++){
					arr[i*j]=0;//if both are able to (*) then assign 0
				}
			}
		}
		for(int i=2;i<len;i++){
			if(arr[i]==-1){
				System.out.println(i);
			}
			
		}
	}

}
