class Solution {
    public String reverseStr(String s, int k) {

        int n = s.length();
        char[] ch = s.toCharArray();

        int i=0;

        while(i<n){
            if(i+k-1<n){
                reverse(i,i+k-1,ch);
            }
            // else if(n>=k && n<=2*k){
            //     reverse(i,i+k-1,ch);
            // }
            else{
                reverse(i,n-1,ch);
            }
            i += (2*k);
            // n -= (2*k);
        }
        String s2 = new String(ch);
        return s2;
        
    }

    public void reverse(int i,int j,char[] ch){

        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
    }
}