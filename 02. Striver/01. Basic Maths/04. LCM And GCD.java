class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long num1 = A;
        Long num2 = B;
        
        while(num1 > 0 && num2 > 0) {
            if(num1 > num2) num1 = num1 % num2;
            else num2 = num2 % num1;
        }
        
        Long gcd = num1 == 0 ? num2 : num1;
        Long lcm = (A * B) / gcd;
        
        return new Long[]{lcm, gcd};
    }
};