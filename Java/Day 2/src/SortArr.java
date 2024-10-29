import java.util.Scanner;
public class SortArr{
	public static void Arrsort(int arr[]){
		for(int i=0;i<9;i++){
			for(int j=i+1;j<10;j++){
					if(arr[i]>arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			}
		}
			
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 10 elements: ");
			int arr[]=new int[10];
			for(int i=0;i<10;i++){
				arr[i] = sc.nextInt();
			}
			Arrsort(arr);
			System.out.println("Sorted Array:");
			for(int i=0;i<10;i++){
				System.out.print(arr[i]+ " ");
			}
	}
}