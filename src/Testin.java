public class Testin {
    public static void main(String[] args) {

        // First Assignment (Difference between reference & primitive type)
        // Primitive types are basic data types that are not objects and are represented by a reserved keyword.
        // They have a fixed size and are stored on the stack. There are eight primitive data types in Java:
        //
        // 1. byte: 8-bit signed integer
        // 2. short: 16-bit signed integer
        // 3. int: 32-bit signed integer
        // 4. long: 64-bit signed integer
        // 5. float: 32-bit floating-point number
        // 6. double: 64-bit floating-point number
        // 7. char: 16-bit Unicode character
        // 8. boolean: true or false

        // *Example

        int num = 5;
        char letter = 'm';
        boolean flag = true;

        // Reference types, on the other hand, are objects that are stored on the heap and have a reference
        // (a memory address) that points to the location where the object is stored.
        // They can be created using a class or an interface. Some common examples of reference types are:

        // 1. String: a sequence of characters
        // 2. Integer: a wrapper class for the int primitive type
        // 3. Double: a wrapper class for the double primitive type
        // 4. Array: a collection of elements of the same data type

        //For example:

        String name = "Maxwell";
        Integer age = 25;
        double[] numbers = { 1.0, 2.0, 3.0 };

        // In summary, the main difference between primitive and reference types is that
        // primitive types are basic data types and are stored on the stack,
        // while reference types are objects that are stored on the heap
        // and have a reference that points to their location in memory.
    }
}
