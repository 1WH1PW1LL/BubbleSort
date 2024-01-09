import  java.util.*;

public class SortProject1 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the first number?");
        int firstNumber = keyboard.nextInt();
        System.out.println("What is the second number?");
        int secondNumber = keyboard.nextInt();
        System.out.println("What is the third number?");
        int thirdNumber = keyboard.nextInt();
        System.out.println("What is the fourth number?");
        int fourthNumber = keyboard.nextInt();
        System.out.println("What is the fifth number?");
        int fifthNumber = keyboard.nextInt();
        System.out.println("What is the sixth number?");
        int sixthNumber = keyboard.nextInt();
        System.out.println("What is the seventh number?");
        int seventhNumber = keyboard.nextInt();
        System.out.println("What is the eighth number?");
        int eighthNumber = keyboard.nextInt();
        System.out.println("What is the ninth number?");
        int ninthNumber = keyboard.nextInt();
        System.out.println("What is the tenth number?");
        int tenthNumber = keyboard.nextInt();
        keyboard.nextLine();
        int storage1 = 0;

        int largest = 0;

        // Go until 10 and for loop the whole thing.
        for(int count = 0; count < 10; count++)
        {
            if(firstNumber > secondNumber)
            {
                storage1 = firstNumber;
                firstNumber = secondNumber;
                secondNumber = storage1;
            }

            if(secondNumber > thirdNumber)
            {
                storage1 = secondNumber;
                secondNumber = thirdNumber;
                thirdNumber = storage1;
            }

            if(thirdNumber > fourthNumber)
            {
                storage1 = thirdNumber;
                thirdNumber = fourthNumber;
                fourthNumber = storage1;
            }

            if(fourthNumber > fifthNumber)
            {
                storage1 = fourthNumber;
                fourthNumber = fifthNumber;
                fifthNumber = storage1;
            }

            if(fifthNumber > sixthNumber)
            {
                storage1 = fifthNumber;
                fifthNumber = sixthNumber;
                sixthNumber = storage1;
            }

            if(sixthNumber > seventhNumber)
            {
                storage1 = sixthNumber;
                sixthNumber = seventhNumber;
                seventhNumber = storage1;
            }

            if(seventhNumber > eighthNumber)
            {
                storage1 = seventhNumber;
                seventhNumber = eighthNumber;
                eighthNumber = storage1;
            }

            if(eighthNumber > ninthNumber)
            {
                storage1 = eighthNumber;
                eighthNumber = ninthNumber;
                ninthNumber = storage1;
            }

            if(ninthNumber > tenthNumber)
            {
                storage1 = ninthNumber;
                ninthNumber = tenthNumber;
                tenthNumber = storage1;
            }

        }


        System.out.println("First number is " + firstNumber);
        System.out.println("Second number is " + secondNumber);
        System.out.println("Third number is " + thirdNumber);
        System.out.println("Fourth number is " + fourthNumber);
        System.out.println("Fifth number is " + fifthNumber);
        System.out.println("Sixth number is " + sixthNumber);
        System.out.println("Seventh number is " + seventhNumber);
        System.out.println("Eigth number is " + eighthNumber);
        System.out.println("Ninth number is " + ninthNumber);
        System.out.println("Tenth number is " + tenthNumber);

    }
}
