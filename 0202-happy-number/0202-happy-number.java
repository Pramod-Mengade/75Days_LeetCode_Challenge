class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast != 1){
            slow = fun(slow);
            fast = fun(fast);
            fast = fun(fast);

            if(slow == fast && slow != 1){
                return false;
            }
        }
        return true;
    }

    public int fun(int num){
        int sum = 0;
        while(num > 0){
            int digit =  num %10;
            num /=10;
            sum += digit * digit; 
        }
        return sum;
    }
}