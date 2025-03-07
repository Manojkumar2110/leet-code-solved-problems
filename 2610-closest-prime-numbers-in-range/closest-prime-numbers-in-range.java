class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                al.add(i);
            }
        }
        int arr[] = new int[2];
        Arrays.fill(arr, -1);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < al.size() - 1; i++) {
            int k = al.get(i + 1) - al.get(i);
            if (k < min) {
                min = k;
                arr[0] = al.get(i);
                arr[1] = al.get(i + 1);
            }
        }
        return arr;
    }

    static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for (int i = 3; i*i <= n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}