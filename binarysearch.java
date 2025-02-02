import java.util.Scanner;
import java.util.Arrays;
 class binarysearch{
 public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of an array");
	  int n=sc.nextInt();
	  int array []=new int[n];
	  System.out.println("Enter elements into the array");
	  for(int i=0;i<n;i++){
	    array [i]=sc.nextInt();
	  }
		Arrays.sort(array);
	    int key;
		System.out.println("Enter key value");
	    key=sc.nextInt();
		int low=0;int high=n-1; int mid; 
		int result=-1;
		while(low<=high){
		mid=(low+high)/2;
		if(array[mid]>key){
		high=mid-1;
		}
		else if(array[mid]==key){
		result=mid;
		break;
		}
		else{
		low=mid+1;
		}
		}
		if(result==-1){
		System.out.println("Key element do not found");
		}
		else{
		System.out.println("The key element found in the position:"+result);
		sc.close();
		}
		}
 }
 
 
		
		