class StringBufferDemo2 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        String str = "The Quick Brown FOx";
        for (int i = 0; i < str.length(); i++) {
            s.append(str.charAt(i));
            System.out.println("capacity is: " + s.capacity() + "      length is: " + s.length());
        } 
    }
}