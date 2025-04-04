// Program to check strings equals by == , equals() and compareTo() 

class Main {
    public static void main(String[] args) {
        String s1 = "JAva", s2 = "JAva";
        String s3 = new String(s1);
        String s4 = new String("jaVA");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s4));
    }
}

/*

Output : 

false
true
true
true
-32

=== Code Execution Successful ===

*/
