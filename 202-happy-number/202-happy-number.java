class Solution {    
    public int digitSquare(int x) {
        int s = 0;
        while (x != 0) {
            int t = x % 10;
            x /= 10;
            s += t * t;
        }
        return s;
    }
    
    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while (n != 1) {
            if (map.containsKey(n)) return false;
            map.put(n, 1);
            n = digitSquare(n);
        }
        return true;
    }
}