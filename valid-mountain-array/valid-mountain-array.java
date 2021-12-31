class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int i, j;
        int len = arr.length;
        for (i = 0, j = len - 1; i <= j && j > 0 && i < len - 1; ) {
            boolean pass = true;
            if (arr[i] < arr[i + 1]) { i++; pass = false; }
            if (arr[j] < arr[j - 1]) { j--; pass = false; }
            if (pass) break;
        }
        if (i != 0 && j != len - 1 && i == j) return true;
        return false;
    }
}