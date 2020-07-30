// add two integers and result sum, we aill modify arguments and check the effect on
// actual argument
public class methodCallByValue{
    public static void main(String[] args) {
        int a = 10, b = 20;
        methodCallByValue ob = new methodCallByValue();
        System.out.println("SUM: " + ob.add(a, b));
        System.out.println("b: " + b);
        System.out.println("a: " + a);
    }

    public int add (int a, int b){
        int sum = a + b;
        a = 0;
        b = 0;
        System.out.println("b: " + b);
        System.out.println("a: " + a);
        return sum;
    }
}