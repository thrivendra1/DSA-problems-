//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToPre(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        int i=0,size=post_exp.length();
        Stack<String> st=new Stack<>();
        while (i<size)
        {
            char c=post_exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                st.push(Character.toString(c));
            }
            else {
                String t1=st.pop();
                String t2=st.pop();
                st.push(c+t2+t1);
            }
            i++;
        }
        return st.pop();
    }
    
}
