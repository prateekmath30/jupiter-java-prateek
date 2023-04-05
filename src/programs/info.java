package programs;

public class info {

    String name;
    int age;
    final static String species = "Homo sapiens" ;

    public info(String name,int age){
    this.name = name;
    this.age = age;

    }
    public static void main(String[] args)
    {


    info obj1 = new info("Prateek", 22);
  //      obj1.name = "Prateek";
  //      obj1.age = 26;

    info obj2 = new info( "Sumit",  27);
  //      obj2.name = "Sumit";
  //      obj2.age = 27;

        obj1.printinfo();
        obj2.printinfo();

    }


    public void printinfo()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(info.species);
        System.out.println("--------------  ");

    }
}
