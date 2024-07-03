class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      int changecolor=image[sr][sc];
      if(changecolor!=color){
        changefunc(image,sr,sc,changecolor,color);
      }  
      return image;
    }
    public static void changefunc(int image[][],int sr,int sc,int changecolor,int color){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=changecolor){
            return;
        }
        image[sr][sc]=color;
        changefunc(image,sr-1,sc,changecolor,color);
        changefunc(image,sr+1,sc,changecolor,color);
        changefunc(image,sr,sc-1,changecolor,color);
        changefunc(image,sr,sc+1,changecolor,color);
    }
}