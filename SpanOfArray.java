import java.util.Scanner;

public class SpanOfArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter size of an array: ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int min=arr[0], max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}if(arr[i]<min){
				min=arr[i];
			}
		}
		
		int span=max-min;
		System.out.println("Span of an array: "+span);
	}
}