class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1=points[0][0];
        int y1=points[0][1];
        int x2=points[1][0];
        int y2=points[1][1];
        int x3=points[2][0];
        int y3=points[2][1];
        return (x2-x1)*(y3-y1)!=(y2-y1)*(x3-x1);
    }
}