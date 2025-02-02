 import java.util.Scanner;
 class bubblesort{
 public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of an array");
	  int n=sc.nextInt();
	  int array []=new int[n];
	  System.out.println("Enter elements into the array");
	  for(int i=0;i<5;i++){
	    array [i]=sc.nextInt();
	   System.out.println("Before sorting elements in the array :"+array [i]);
	  }
	   for(int i=0;i<n-1;i++){
	  for(int j=0;j<n-i-1;j++){
	  if(array[j]>array[j+1]){
	       int temp=array[j];
		   array[j]=array[j+1];
		   array[j+1]=temp;
		  }
		   }
		   }
		   for(int i=0;i<n;i++){
		  System.out.println("After sorting elements in the array:"+array [i]);
			 }
			 }
 }