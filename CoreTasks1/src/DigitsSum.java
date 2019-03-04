import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DigitsSum {


    static  int summ()
    {
        Random rand = new Random();
        int n = rand.nextInt(1001);
        int sum = 0, aux;

        System.out.println("Number is: " + n);
        do
        {
            aux = n%10;
            sum += aux;
            n/=10;

        }while (n!=0);


        return  sum;
    }

    static void twoIntegers()
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Input first Integer: ");
        int x = read.nextInt();
        System.out.print("Input second Integer: ");
        int y = read.nextInt();


        System.out.println("Sum of two integers: " + ( x + y));

        System.out.println("Difference of two integers: " + ( x - y ));

        System.out.println("Product of two integers: " + ( x * y ));

        System.out.println( ("Average of two integers: " + String.format("%.2f",(double)((x / y)/2))));

        System.out.println("Distance of two integers: " + ( x - y ));

        if ( x > y )
            {System.out.println("Max integer: " + x);
            System.out.println("Min integer: " + y);
            }
        else {System.out.println("Max integer: " + y);
            System.out.println("Min integer: " + x);
        }


    }



    static String reverse(String s)
    {
        String x = "";
        System.out.println("\nInitial String: " + s);
        for (int i = s.length()-1; i >=0; i--)
        {
            x += s.charAt(i);
        }

        return x;
    }
    static  void palindrome()
    {
            String s = "ABCDCBA";
           String x =  reverse(s);

            if ( s.equals(x)) System.out.println("Is palindrome");
                else System.out.println("Not palindrome");

    }

    static  void count()
    {
        String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char c; int n;
        int letters = 0, space = 0, numbers = 0, others = 0;

        for ( int i = 0; i < s.length(); i++)
        {
           c = s.charAt(i);
            n = (int) c;

            if ( n >= 47 && n <= 57) numbers++;
            else if ( n >= 65 && n <= 90 || n >= 97 && n <= 122) letters++;
            else if ( n == 32 ) space++;
            else others++;
        }

        System.out.println("Letters: " + letters + "\nSpace: " + space + "\nNumber: " + numbers + "\nOther: " + others);

    }

    static void divisible()
    {

        System.out.println("Divided by 3: ");
        for ( int i = 1; i <= 100; i++  )
        {
            if ( ( i % 3 ) == 0 ) System.out.print(i + " , ");
        }

        System.out.println("\nDivided by 5: ");
        for ( int i = 1; i <= 100; i++  )
        {
            if ( ( i % 5 ) == 0 ) System.out.print(i + " , ");
        }

        System.out.println("\nDivided by 3 & 5: ");
        for ( int i = 1; i <= 100; i++  )
        {
            if ( ( i % 3 ) == 0 && ( i % 5 ) == 0 ) System.out.print(i + " , ");
        }
    }

    static void finalTask()
    {
        Object[] task = new Object[]{"Today", new Person("Ann Jane" , 20, "Female"), 32344234234L, "is", 23, 652, 'a', new Person("John Lala", 23, "Male"), "big", "day" };
        Long n = 0L;
        ArrayList<Person> aux_pers = new ArrayList<Person>( );
        String aux_str = "";

        for (Object item: task )
       {
           if ( item instanceof String || item instanceof  Character  )
           {
               aux_str +=item;
               aux_str += " ";
           }

           else if ( item instanceof  Person)
                aux_pers.add((Person) item);
           else if ( item instanceof Number )
               n += Long.parseLong(item.toString());

       }
        System.out.println("All strings and chars : " + aux_str);
        System.out.println("Array with persons: ");
       for (Person object: aux_pers)
           System.out.println(object.name + " " + object.gender + " " + object.age);
        System.out.println("Sum: " + n);




    }

    public static void main(String [] args){
        System.out.println(" Task 1:\n");
        System.out.println("The sum of all digits is: "+ summ());
        System.out.println("\n Task 2:\n");
        twoIntegers();
        System.out.println("\n Task 3:\n");
        count();
        System.out.println("\n Task 4: \n");
        divisible();
        System.out.println("\n Task 5: \n");
        System.out.println("Reversed: " + reverse("The quick brown fox "));
        System.out.println("\n Task 6: \n");
        palindrome();
        System.out.println("\n Task 7: \n");
        finalTask();



    }
}
