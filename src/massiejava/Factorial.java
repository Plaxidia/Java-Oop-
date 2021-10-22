package massiejava;

public class Factorial {

	public static void main(String[] args) {
		//write  a function that  takes the value of  n and  return the sum of 1 to n 
		
		System.out.println(sum(4));
				  // write a function that computes the factorial *hint* use the  recussion
		//1!=1*1
		  //2!=2*1
		  //3!=3*2*1
		  //4!=4*3*2*1
		  //5!=5*4*3*2*1
		//n=n*(n-1)!=n*(n-1)*(n-2)!=n*(n-1)*(-2)*(n-3)....
		System.out.println("factorial :" + fac (5));
		
		
		
		
		
		//write 3 function  that return the min ,average and max of an array  
		
		int [] num ={8,2,1,-3,124};
		System.out.println("min of 5 numbers is =" + FindMin(num) );
		System.out.println("max of 5 numbers is =" + FindMax(num) );
		System.out.println("average of 5 numbers is =" + FindAverage(num) );
	}
	
	
	public static int FindAverage( int [] arr) {
		//the average is found by dividing the sum with the number of elements 
		int sum  =0;
		for(int n =1; n  < arr.length ; n++) {
			sum = sum + arr[n];
		}
		System.out.println(" sum " + sum );
		return sum/arr.length;
	}
	
	public static int FindMin (int [] arr) {
		
		int min = arr [0];
		
		for( int i =0;i< arr.length ;i++) {
		
			if (arr[i] < min ) {
				min=arr[i];
				
			}
			
		}
		return min;
		
	}
	
	
	
public static int FindMax (int [] arr) {
		
		int max = arr [0];
		
		for( int i =0;i< arr.length ;i++) {
			if (arr[i] >max) {
				max=arr[i];
				
			}
			
		}
		return max;
		
	}
	public static int sum (int n) {
		int sum =0;
	for(int i =1; i  <=n; i++) {
		System.out.println(sum + " +" + i);
		sum  = sum +i;
		System.out.println(" = " + sum );
	
	}
		return sum ;
	}
	 public static int  fac (int n) {
		
		if (n==0) {
			return 1;
		}
		System.out.println((n));
		return fac(n-1)*n;
		//n*(n-1)!=5*(5-1)=5*4!=5*4*3*2*1= 120
	}
	
	

}
