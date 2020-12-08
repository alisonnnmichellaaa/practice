import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class JumpingOnTheClouds {

         // Complete the jumpingOnClouds function below.
        static int jumpingOnClouds(int[] c) {
            int jumpCounter=0;
            int currentCloud=0;
                while(currentCloud<(c.length-1)){
                    if (currentCloud+2<=(c.length-1) && c[currentCloud+2]!=1) {
                        jumpCounter+=1;
                        currentCloud+=2;

                    }
                    else if(currentCloud+1<=(c.length-1) && c[currentCloud+1]!=1){
                            jumpCounter+=1;
                            currentCloud+=1;
                    }


                }
            return jumpCounter;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            int[] intArray = new int[] {0,1,0,0,0,1,0};
            int[] intArray1 = new int[] {0,0,1,0,0,1,0};
            int[] intArray2 = new int[] {0,0,0,0,1,0};

            System.out.println("intArray:  "+jumpingOnClouds(intArray));
            System.out.println("intArray1:  "+jumpingOnClouds(intArray1));
            System.out.println("intArray2:  "+jumpingOnClouds(intArray2));



        }
    }


