/******************************************************************************

 merging of two sorted arrays

*******************************************************************************/

public class MergeSortedArrays
{
	public static int[] A = {3,8,16,20,25};
	public static int[] B = {4,10,12,22,23};
	public static int[] C = new int[A.length + B.length];
	
	
	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<A.length && j<B.length) {
		    if(A[i] < B[j]) {
		        C[k++] =  A[i++];
		    }
		    
		    else {
		        C[k++] = B[j++];
		    }
		}
		
		for( ; i<A.length;i++) {
		    C[k++] =  A[i];
		}
		
		for( ; j<B.length;j++) {
		    C[k++] = B[j];
		}
		
		System.out.println("After merging A and B: ");
		
		for(int x=0;x<C.length;++x) System.out.print(" "+C[x]);
		
	}
}
