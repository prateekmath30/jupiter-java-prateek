package programs;

public class ArrayTypes {

    public static void main(String[] args) {

        int num[] = {2, 3, 4, 5, 6};
        String setArray[] = {"Ankit", "Raj"};
        int numArray[] = new int[3];
        numArray[0] = 3;
        numArray[1] = 4;
        numArray[2] = 5;

        for(int i = 0; i < numArray.length; i++){
            System.out.println(numArray[i]);
        }
    }
}