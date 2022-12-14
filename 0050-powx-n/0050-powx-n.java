class Solution {
 //    public double mul(double x, int n, double ans){
//         if(n==0){
//             return ans;
//         }        
//         ans *= x;
//         return mul(x,n-1,ans);
//     }
    
//     public double myPow(double x, int n) {
//         if(x==0 || x==1 || n==1){
//             return x;
//         }
        
//         if(x<0 && n>=Integer.MAX_VALUE){
//             return -1;
//         }
        
//         if(x<0 && n<=Integer.MIN_VALUE){
//             return 1;
//         }        
        
//         if(n<=Integer.MIN_VALUE || n>=Integer.MAX_VALUE){
//             return 0;
//         }
                
//         if(n>0){
//            return mul(x,n,1);
//         }else{
//            double temp =  mul(x,-1*n,1);
//             return (double)(1.0)/(double)temp;
//         }
//     }
    
    
    
    public double myPow(double x, int n) {
        double ans = 1.0;
        long temp = n;
        if(temp<0){
            temp = (-1)*temp;
        }
        
        while(temp!=0){         
            if(temp%2==0){
                x = x*x;
                temp = temp/2;
            }else{
                ans *= x;
                temp = temp-1;
            }
        }
        
        if(n<0){
           ans =  (double)(1.0)/(double)ans;
        }
        return ans;
    }
}