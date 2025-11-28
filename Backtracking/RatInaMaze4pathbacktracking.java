public class RatInaMaze4pathbacktracking {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isvisited = new boolean[rows][cols];
        print(0,0,rows-1,cols-1,"",isvisited);

    }

      private  static void print(int sr,int sc, int er, int ec,String s,boolean[][] isvisited ){
        if(sr<0||sc<0)return;
        if(sr>er || sc>ec) return ;
        if(isvisited[sr][sc]==true){ return ;}
      
        if(sr==er && sc==ec) {
            System.out.println(s);
        return ;}
isvisited[sr][sc]= true;



print(sr, sc+1, er, ec, s+"R",isvisited); //go right
print(sr+1, sc, er, ec, s+"D",isvisited);//go down
print(sr, sc-1, er, ec, s+"L",isvisited);//goleft;
print(sr-1, sc, er, ec, s+"U",isvisited);
//go up

//backtracking
isvisited[sr][sc]=false;

        }
         
    }
    

