public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer(20);
        StringBuffer s3 = new StringBuffer("Hello");
        System.out.println("Capacity of s1: " + s1.capacity() + ",\t" + "Length is :" + s1.length());
    }
}