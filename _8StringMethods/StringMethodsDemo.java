package _8StringMethods;

// | Method                        | Description                      | Example                     | Output |
// | ---                           | ---                              | ---                         | ---    |
// | length()                      | Returns number of characters     | "Hello".length()            | 5 |
// | charAt(int index)             | Returns character at given index | "Hello".charAt(1)           | e |
// | substring(int begin, int end) | Extracts part of string          | "Hello".substring(1,4)      | ell |
// | concat(String str)            | Appends another string           | "Hello".concat(" World")    | Hello World |
// | indexOf(String str)           | Finds first occurrence           | "Hello".indexOf("l")        | 2 |
// | lastIndexOf(String str)       | Finds last occurrence            | "Hello".lastIndexOf("l")    | 3 |
// | toUpperCase()                 | Converts to uppercase            | "Hello".toUpperCase()       | HELLO |
// | toLowerCase()                 | Converts to lowercase            | "Hello".toLowerCase()       | hello |
// | trim()                        | Removes leading/trailing spaces  | " Hi ".trim()               | Hi |
// | equals(String str)            | Compares strings (case-sensitive)| "Hi".equals("hi")           | false |
// | equalsIgnoreCase(String str)  | Compares ignoring case           | "Hi".equalsIgnoreCase("hi") | true |
// | contains(CharSequence s)      | Checks if substring exists       | "Hello".contains("ell")     | true |
// | startsWith(String prefix)     | Checks prefix                    | "Hello".startsWith("He")    | true |
// | endsWith(String suffix)       | Checks suffix                    | "Hello".endsWith("lo")      | true |
// | replace(char old, char new)   | Replaces characters              | "Hello".replace('l','x')    | Hexxo |
// | split(String regex)           | Splits into array                | "a,b,c".split(",")          | [a, b, c] |
// | toCharArray()                 | Converts to char array           | "Hi".toCharArray()          | ['H','i'] |
// | isEmpty()                     | Checks if empty                  | "".isEmpty()                | true |



public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "Hello, World!";

        System.out.println("Length: " + text.length());
        System.out.println("Char at 7: " + text.charAt(7));
        System.out.println("Substring: " + text.substring(7, 12));  //index 12 is not included
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Contains 'World': " + text.contains("World"));
        System.out.println("Replace 'World' with 'Java': " + text.replace("World", "Java"));
    }
}
