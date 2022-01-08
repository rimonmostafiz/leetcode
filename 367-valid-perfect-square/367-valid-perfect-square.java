class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;
        long mid = (l + r) / 2;
        
        while (l <= r) {
            if (mid * mid == num) return true;
            
            if (mid * mid > num) r = mid - 1;
            else if (mid * mid < num) l = mid + 1;
            mid = (l + r) / 2;
        }
        return false;
    }
}