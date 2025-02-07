class Solution {
    public int[] queryResults(int limit, int[][] queries) {
          int n = queries.length;
        int[] result = new int[n];

        Map<Integer, Integer> ballColor = new HashMap<>(); 
        Map<Integer, Integer> colorCount = new HashMap<>(); 
        int distinctCount = 0;

        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];
            if (ballColor.containsKey(ball)) {
                int oldColor = ballColor.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    distinctCount--; 
                }
            }
            ballColor.put(ball, newColor);
            colorCount.put(newColor, colorCount.getOrDefault(newColor, 0) + 1);
            if (colorCount.get(newColor) == 1) {
                distinctCount++; 
            }
            result[i] = distinctCount;
        }

        return result;
    }
}