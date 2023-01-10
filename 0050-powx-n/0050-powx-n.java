class Solution {
    public double mul(double x, int n, double ans){
        if(n==0){
            return ans;
        }
        
        ans *= x;
        
        return mul(x,n-1,ans);
    }
    
     public double div(double x, int n, double ans){
        if(n==0){
            return ans;
        }
         
        ans /= x;
        
        return div(x,n-1,ans);
    }
    
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        
        if(x<0 && n>=Integer.MAX_VALUE){
            return -1;
        }
        
        if(x<0 && n<=Integer.MIN_VALUE){
            return 1;
        }
        
        if(x>=0 && x<1 && (n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE)){
            return 0;
        } 
         
         if(x>=1 && x<2 && (n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE)){
             return 1;
         }
        
        if(n<=Integer.MIN_VALUE || n>=Integer.MAX_VALUE){
            return 0;
        }
        
        
        if(n>0){
           return mul(x,n,1);
        }else{
           return div(x,(int)Math.abs(n),1);
        }
    }
}