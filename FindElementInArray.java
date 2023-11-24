import java.util.Scanner;

public class FindElementInArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter size of an array: ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Enter data to be find: ");
		int data=sc.nextInt();
		int idx=-1;

		for(int i=0;i<arr.length;i++){
			if(arr[i]==data){
				idx=i;
				break;
			}
		}
		System.out.println(idx);
	}
}