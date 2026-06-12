package String;

public class SortestPath {
    public static double getSortestPath(String path){
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='E'){
                x++;
            }
            if(path.charAt(i)=='W'){
                x--;
            }
            if(path.charAt(i)=='N'){
                y++;
            }
            if(path.charAt(i)=='S'){
                y--;
            }
        }
        double dis = Math.sqrt(x*x + y*y);
        return dis;
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("sortest path is: "+ getSortestPath(path));
    }
}
