package programs;

public class ControlStatements {
    public static void main(String[] args) {
        ControlStatements obj = new ControlStatements();
        obj.isOddEven(37);
        obj.isLargerNumber(12,14);
        obj.isEqualNumbers(12,13);
        obj.getWeekdays(6);
    }

    public void isOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even");
        } else {
            System.out.println("The number " + num + " is odd");

        }
    }
        public void isLargerNumber(int p,int m)
        {
            if (p > m) {
                System.out.println("p is greater than m");
            } else if (p < m) {
                System.out.println("m is greater than p");
            } else {
                System.out.println("p is equal to m");
            }
        }
        public void isEqualNumbers(int j,int k)
        {
            if ( j>k || k>j ) {
                System.out.println("j and k are not equal numbers");
            }else{
                System.out.println("j and k are equal numbers");

        }
        }

        public void getWeekdays(int num){
            switch(num){

                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    if (num>7){
                        System.out.println("Weekday does not exist");
                    } else {
                        System.out.println("Weekend Party");}
                    break;
            }

        }


    }


