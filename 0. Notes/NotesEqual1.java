public class NotesEqual1 {
    public static void main(String[] args) {
        System.out.println(10 == 11); // We know this must be `false`
        System.out.println(10.5 == 10.5); // We know this must be `true`
        System.out.println(true == false); // We know this must be `false`
        System.out.println("Hello" == "Hello"); // Since this is comparing two objects, and not references to two objects,
                                                // these are equal and will result in `true`
        String var1 = "Hello";
        String var2 = var1;
        String var3 = new String("Hello");
        System.out.println(var1 == var2); // Since `var1` and `var2` are set to share the same memory location, they must be equal.
        System.out.println(var1 == var3); // Since `var1` and `var3` are set to different memory locations, they must not be equal.
    }
}
