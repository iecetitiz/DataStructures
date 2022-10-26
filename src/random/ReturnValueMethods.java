package random;

public class ReturnValueMethods {
    public static void main(String[] args) {
        method(5, 8);

        {
            int a = 40;
            {
                //int a = 60;
            }
        }

        {
            int a = 50;
        }
    }

    public static void method(int a, int b) {
        if(a < 0 || b < 0) {
           System.out.println("you can not enter the negative value");
            return;
       }
        //a = a + count;
        int count = 0;
        System.out.println("a + b = " + (a + b) );
      //return a + b;
    }

    public static int retunsometin(int a) {
        return a;
    }


}
