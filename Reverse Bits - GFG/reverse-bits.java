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
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        // code here
        Long result =0l;
        for(int i=0;i<32;i++){
           Long lsb = X&1;
           Long leftShift= lsb<<(31-i);
           result = result | leftShift;
           X=X>>1;
        }
        return result;
    }
};