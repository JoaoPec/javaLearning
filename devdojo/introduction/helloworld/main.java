package devdojo.introduction.helloworld;

public class main {

   public static void main(String[] args) {

       int[][] dias = new int[3][];

       dias[0] = new int[3];

       dias[0][0] = 1;
       dias[0][1] = 2;
       dias[0][2] = 3;


       for (int v : dias[0]){
           System.out.println(v);
       }

    }
}