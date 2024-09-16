// Java programs are defined in a CLASS
// the class name must match the file name (Main.java)
// curly bracets define the start and end of a section
public class Main {

   // the main method is what runs when you press RUN
   public static void main(String []args) {
      // below is a print STATEMENT (instruction/command)
      // Java statements end in a semicolon
      System.out.println("Hello World");

      // print will output on the same line 
      // println will enter on the next line after printing
      System.out.print("alex");
      System.out.print("hey");

      // declare VARIABLES 
      int students; 
      boolean isRaining; // camelCase for multi-word names
      double cash; 

      //ASSIGN VALUES to the variables
      students = 8;
      cash = 5.00; 
      isRaining = false; // false is "off" or 0

      // INSTANTIATE or INITALIZE (declare + assign in one line)
      int numClasses = 9;
      double gpa = 3.4;
      boolean isSnowy = false; 

      // ARITHMETIC OPERATORS 

      System.out.println(2 + 3);
      System.out.println(2 - 3);
      System.out.println(2 * 3);
      System.out.println(2 / 3); // returns 0

      // IMPORTANT: if you divide two INTEGERS, you will get an int result 
      // this is called "integer division" and it TRUNCATES (chops off) the decimal part after dividing

      System.out.println(2.0 / 3); // returns 0.66666

      // == is to test = is to assign
      System.out.println(2 == 3); // returns false (boolean)
      // != is to test if NOT equal
      System.out.println(2 != 3); // returns true (!= : means not equal)

      // % operator returns the REMAINDER after long divison
      System.out.println(16 % 2); // returns 0 (even number)
      System.out.println(17 % 2); // returns 1 (odd number)
      System.out.println(17% 5); // returns 2

      // COMPOUND ASSIGNMENT OPERATORS (shortcuts)

      int score = 0;

      // long way to increase value score by 1 
      score = score + 1;
      System.out.println(score);

      //shortcut addition assignment
      score += 5;
      System.out.println(score); // score is now 6

      // increment operator (only works for changes by 1)
      score++; // score is now 7
      System.out.println(score);

      score--; // score is back to 6
      System.out.println(score);

      // there are shortcuts for multiplication and division too
      score /=3; // returns 2, same operation as score = socre/3;
      System.out.println(score);

      score *= 732; // returns 1464, same op. as score = score*732;
      System.out.println(score);

      //CASTING
      // casting from a DOUBLE to an INT results in TRUNCATING 
      double g = 9.81; 
      int g_cast = (int) g;
      System.out.println(g_cast);

      // casting from a INT to a DOUBLE is a WIDENING CONVERSION
      int num = 10;
      double num_cast = (double) num;
      System.out.println(num_cast);

      // ROUNDING BY CASTING 
      double posNumber = 6.78;
      double negNumber = -273.15;
      
      // round a positive num to the nearest Int
      int nearestPosInt = (int)(posNumber + 0.5);
      System.out.println(nearestPosInt);
      
      //round a negative num nto the nearest int
      int nearestNegInt = (int)(negNumber - 0.5);
      System.out.println(nearestNegInt);

      //NOTE: primitive types take up different amts of MEMORY
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);

      // int badInteger = 9147483647;
      

      
      
      


   }
}
