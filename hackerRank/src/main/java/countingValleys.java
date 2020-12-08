import java.io.*;
import java.util.*;

public class countingValleys {


    static class Result {
        static char DOWN='D';

        /*
         * Complete the 'countingValleys' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER steps
         *  2. STRING path
         */

        public static int countingValleys(String path) {
           List <Integer> valleys= new ArrayList<>();
           Integer valleyLevel=0;
           Integer currentLevel=0;
           for(int i=0;i<path.length();i++){
                if(path.charAt(i)==DOWN){
                    if(currentLevel<=0)
                      valleyLevel+=1;

                    currentLevel-=1;
                }
                else{
                    if((currentLevel+1)==0 && valleyLevel>0){
                        valleys.add(valleyLevel);
                        valleyLevel=new Integer(0);
                    }
                    currentLevel+=1;

                }

           }
            return valleys.size();
        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            // int steps = Integer.parseInt(bufferedReader.readLine().trim());

            // String path = bufferedReader.readLine();

            System.out.println("TEST2: "+Result.countingValleys("DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD"));

            /*bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();*/
        }
    }


}
