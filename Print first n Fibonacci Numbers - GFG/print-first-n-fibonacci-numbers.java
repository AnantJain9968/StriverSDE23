//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
       
       ArrayList<Long> res= sol(n);
       long[] ans = new long[res.size()];
       for(int i=0;i<res.size();i++){
           ans[i]=res.get(i);
       }
       return ans;
        
        
    }
    static ArrayList<Long> sol(int n){
        if(n==1) return new ArrayList<>(Arrays.asList(1l));
        if(n==2) return new ArrayList<>(Arrays.asList(1l,1l));
        ArrayList<Long> temp = sol(n-1);
        int sz=temp.size();
        temp.add(temp.get(sz-1)+temp.get(sz-2));
        return temp;
    }
}