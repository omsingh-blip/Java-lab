public class Operators {
    
    public static void main(String[] args){

        //Arthimetic Operators
        System.out.println("Arthimetic Operators:");

        int a = 10;
        int b = 3;

        // Addition
        System.out.println("a + b = " + (a + b));

        // Subtraction
        System.out.println("a - b = " + (a - b));

        // Multiplication
        System.out.println("a * b = " + (a * b));

        // Division
        System.out.println("a / b = " + (a / b)); // integer division

        // Modulus (remainder)
        System.out.println("a % b = " + (a % b));



        //Agumented Assignment Operators
        System.out.println("\nAgumented Assignment Operators:");

        int c = 10;

        // Addition assignment
        c += 5;  // same as c = c + 5
        System.out.println("c after += 5: " + c);

        // Subtraction assignment
        c -= 3;  // same as c = c - 3
        System.out.println("c after -= 3: " + c);

        // Multiplication assignment
        c *= 2;  // same as a = a * 2
        System.out.println("c after *= 2: " + c);
        // Division assignment
        c /= 4;  // same as c = c / 4
        System.out.println("c after /= 4: " + c);

        // Modulus assignment
        c %= 3;  // same as c = c % 3
        System.out.println("c after %= 3: " + c);



        //Increment and Decrement Operators
        System.out.println("\nIncrement and Decrement Operators:");

           int d = 5;

        // Postfix increment: value used first, then increased
        System.out.println("d++ = " + (d++)); // prints 5, then a becomes 6
        System.out.println("After a++: " + d); // now d = 6

        // Prefix increment: value increased first, then used
        System.out.println("++d = " + (++d)); // d becomes 7, then prints 7

        // Postfix decrement: value used first, then decreased
        System.out.println("d-- = " + (d--)); // prints 7, then a becomes 6
        System.out.println("After d--: " + d); // now d = 6

        // Prefix decrement: value decreased first, then used
        System.out.println("--d = " + (--d)); // d becomes 5, then prints 5



        //Order of Operators (PEMDAS: Parentheses, Exponents, Multiplication/Division, Addition/Subtraction)
        System.out.println("\nOrder of Operators (PEMDAS: Parentheses, Exponents, Multiplication/Division, Addition/Subtraction):");

        /*

        | Precedence Level   | Operators         | Notes |

        | **Highest**        | ()                | Parentheses override all default rules |
        | Next               | Unary +, -, ++, --| Applied before multiplication/division |
        | Next               | *, /, %           | Multiplication, division, modulus |
        | Next               | +, -              | Addition and subtraction |
        | Lowest (arithmetic)| Assignment =      | Evaluated last; right-associative |

        */

        int result1 = 2 + 3 * 4;       // 2 + (3*4) = 14
        int result2 = (2 + 3) * 4;     // (2+3)*4 = 20
        int result3 = 10 - 2 + 5;      // (10-2)+5 = 13
        int result4 = 10 - (2 + 5);    // 10-(2+5) = 3

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
