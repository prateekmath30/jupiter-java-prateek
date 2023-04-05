package programs;

public class Example
{
    public static void main(String[] args) {
        Example obj = new Example();
       int addOfTwoNumbers =   obj.getsumofTwoNumbers(10,27 );
        System.out.println("Sum of two numbers: " + addOfTwoNumbers);

        obj.isEvenNumbers(addOfTwoNumbers);
    }
    public int getsumofTwoNumbers (int a, int b ){

        int sum = a + b;
        return sum;
    }

    public void isEvenNumbers (int a)
    {

        int isEven = a % 2;
        if(isEven==0){
            System.out.println("is an Even number");
        } else {
            System.out.println("is not an Even number");

        }


    }

}
