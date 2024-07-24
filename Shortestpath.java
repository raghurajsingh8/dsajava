public class Shortestpath{


  public static void main(String args [] ){
    String dir="WNEENESENNNWWWSSSS";
    int x=0;
    int y=0;

    for(int i=0;i<dir.length();i++){
      if(dir.charAt(i)=='W'){
        x--;
      }
      else if(dir.charAt(i)=='E'){
        x++;
      }
      else if(dir.charAt(i)=='N'){
        y++;
      }
      else{
        y--;
      }
    }

    System.out.print(Math.sqrt(x*x+y*y));

  }
}