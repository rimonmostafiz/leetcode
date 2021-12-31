class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int half = n / 2;
            if (map.containsKey(half) && 2 * half == n && map.get(half) != i) {
                return true;
            }
        }
        
        return false;
    }
}