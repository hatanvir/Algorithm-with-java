import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(prime(n));
	}
	static int prime(int n){
		int root = (int) Math.sqrt(n);
		if(n<=2) return 1;
		for(int i=2;i<=root;i++){
			if(n%i==0)
				return 0;
			     break;
			}
		return 1;
	}
}
