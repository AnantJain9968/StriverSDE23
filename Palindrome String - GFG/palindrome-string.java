//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        if(S.length()==1) return 1;
        boolean s = sol(S,0,S.length());
        if(s) return 1;
        return 0;
    }
    boolean sol(String str , int i , int n){
        // code here
        if(i==n-1) return true;
        char c = str.charAt(i);
        boolean res=sol(str,i+1,n);
        if(res==false) return res;
        char rc =str.charAt(n-i-1);
        if(c==rc) return true;
        return false;
    }
    
};