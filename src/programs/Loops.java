package programs;


public class Loops
{

    public static void main(String[]args){
        //printNumbers();
        //printN();
        printRepeat();
    }
   // while loop ->
    public static void printNumbers()
    {
        int p=0;
        while(p<=10){
            System.out.println(p);
            p++;
        }

    }
    // For loop ->

    public static void printN(){

        for(int z = 0;z<=10;z++){
            for(int k=0;k<=10;k++){
                System.out.println("z is " + z);
                System.out.println("k is " + k);
                System.out.println("-----------");

            }

        }

    }

    public static void printRepeat(){

        String str = "Avengers Assemble";
        for(int z = 0;z<=str.length()-1;z++){
            int count=0;
            for(int k=z+1;k<=str.length()-1;k++){

                if(str.charAt(z)==str.charAt(k)){
                    System.out.println("The char: " + str.charAt(z) + " is repeated");
                    count++;
                    break;
                }
            }

        if(count>0)
            break;
        }
    }
}