import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void exercise1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your first name?");
        String firstName = input.next();
        System.out.println("Enter your last name:");
        String lastname = input.next();
        System.out.println("Hello "+ firstName + " " + lastname);
    }

    public static void exercise2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum = input.nextInt();
        System.out.println("Enter your second number");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The sum of your numbers is " + sum);
    }

    public static void exercise3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum = input.nextInt();
        System.out.println("Enter your second number");
        int secondNum = input.nextInt();
        int quotient = (secondNum/firstNum);
        System.out.println("The quotient is " + quotient);
    }

    public static void exercise4(){
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 -8 % 3);
    }

    public static void exercise5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum = input.nextInt();
        System.out.println("Enter your second number");
        int secondNum = input.nextInt();
        int product = firstNum * secondNum;
        System.out.println(firstNum + "*" + secondNum + "=" + product);
    }

    public static void exercise6(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum = input.nextInt();
        System.out.println("Enter your second number");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        int difference = secondNum - firstNum;
        int product = firstNum * secondNum;
        int quotient = (secondNum/firstNum);
        int mod = secondNum % firstNum;
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
        System.out.println("The quotient is " + quotient);
        System.out.println("The mod is " + mod);
    }

    public static void exercise7(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        for(int i = 1; i < 11; i++){
            int product = num * i;
            System.out.println(product);
        }
    }

    public static void exercise11(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for the radius:");
        double radius = input.nextInt();
        double perimeter = 2*radius*Math.PI;
        double area = radius*radius*Math.PI;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    public static void exercise12(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNum = input.nextInt();
        System.out.println("Enter a number");
        int thirdNum = input.nextInt();
        System.out.println("Enter a number");
        int secondNum = input.nextInt();
        float average = (float)(firstNum + secondNum + thirdNum)/3;
        System.out.println(average);
    }
    public static void exercise13(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        double length = input.nextInt();
        System.out.println("Enter width:");
        double width = input.nextInt();
        double perimeter = (length*2) + (width*2);
        double area = length*width;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    public static void exercise14(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstVar = input.nextInt();
        System.out.println("Enter second number: ");
        int secondVar = input.nextInt();
        int var = 0;
        var = firstVar;
        firstVar = secondVar;
        secondVar = var;

        System.out.println("Swapped variables are:" + firstVar + " and " + secondVar);
    }

    public static void exercise17(){
        int [] binary = new int [10];
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int firstBinary = input.nextInt();
        System.out.println("Enter another binary number");
        int secondBinary = input.nextInt();

        while(firstBinary == 1 || secondBinary ==1){

        }

    }

    public static void exercise19 (){
        float[]dBinary = new float[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int decimal = input.nextInt();

        while (decimal != 0 ){
            float newDec = decimal%2;
            dBinary[0]=newDec;


        }
    }

    public static void exercise32(){
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();
        if(firstNum>secondNum) {
            System.out.println(firstNum + ">" + secondNum);
        }
        else{
            System.out.println(firstNum + "<" + secondNum);
        }
        if(firstNum != secondNum) {
            System.out.println(firstNum + "!=" + secondNum);
        }
        else{
            System.out.println(firstNum + "=" + secondNum);
        }
    }
    public static void exercise33(){
        int num = 0;
        int finalNum = 0;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number with more than 2 digits: ");
        int userNum = input.nextInt();
        while(userNum!=0){
            num = userNum % 10;
            userNum = userNum / 10;
            finalNum += num;
        }
        System.out.print("The sum of the digits is: " + finalNum);
    }

    public static void exercise37(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        char [] userString = input.nextLine().toCharArray();
        for(int i = userString.length-1; i>=0 ; i--){
            System.out.print(userString[i]);
        }
    }
    public static void exercise38(){
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string with a combination of letter, spaces, numbers, and special character: ");
        //char [] userString = input.nextLine().toCharArray();
        String userString = input.nextLine();
        for(int i = 0; i < userString.length()-1; i++) {
            if (Character.isDigit(userString.charAt(i))) {
                numberCount++;
            } else if (Character.isSpaceChar(userString.charAt(i))) {
                spaceCount++;
            } else if (Character.isLetter(userString.charAt(i))) {
                letterCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Number of spaces: " + spaceCount);
        System.out.println("Number of special characters: " + otherCount);
    }

    public static void exercise39(){
        int count = 0;
        for(int o=1; o<=4; o++){
            for(int t=1; t<=4; t++){
                for(int h=1; h<=4; h++){
                    if(o!=t && t!=h && h!=o){
                        count++;
                        System.out.println(o + "" + t + "" + h);
                    }
                }
            }
        }
        System.out.print("number of 3 digit combinations: " + count);

    }
    // 50, 51, 52, 54
    public static void exercise48() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void exercise49(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNum = input.nextInt();
        if (userNum % 2 != 0){
            System.out.print("0");
        }
        else{
            System.out.print("1");
        }
    }

    public static void exercise50() {
        System.out.println("Divisible by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Divisible by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Divisible by 9: ");
        for (int i = 1; i < 100; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void exercise51(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        String userString = input.nextLine();
        int finalInt = Integer.parseInt(userString);
        System.out.printf("The integer value is:" +  finalInt);

    }
    public static void exercise52() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number : ");
        int z = in.nextInt();
        System.out.print("The result is: "+sumoftwo(x, y, z));
        System.out.print("\n");
    }
    public static boolean sumoftwo(int p, int q, int r)
    {
        return ((p + q) == r || (q + r) == p || (r + p) == q);
    }

    public static void exercise55(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);
        System.out.print("\n");
    }
    public static void exercise56(){
        int x = 5;
        int y = 20;
        int p = 3;
        System.out.println(result(x,y,p));
    }

    public static int result(int x, int y, int p) {
        if (x%p == 0)
            return( y/p - x/p + 1);
        return(y/p - x/p);
    }

    public static void exercise57(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int x = in.nextInt();

        System.out.println(result(x));
    }
    public static int result(int num) {
        int ctr = 0;
        for (int i=1; i<=(int)Math.sqrt(num); i++)
        {
            if(num%i==0 && i*i!=num)
            {
                ctr+=2;
            } else if (i*i==num)
            {
                ctr++;
            }
        }
        return ctr;
    }

    public static void exercise58()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = input.nextLine();
        String upper_case_line = "";
        Scanner lineScan = new Scanner(line);

        while(lineScan.hasNext())
        {
            //.hasNext returns returns true if the next token matches the pattern constructed from the specified string
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim()); // .trim eliminates leading and trailing spaces
    }

    public static void exercise60()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = input.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Last word: "+words[words.length - 1]);
    }

    public static void exercise61()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String line = input.nextLine();
        char[] lineArray = line.toCharArray();
        for (int i = lineArray.length-1; i >= 0 ; i--)
        {
            System.out.print(lineArray[i]);
        }
    }

    public static void exercise62()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int firstNum = input.nextInt();
        System.out.print("Enter a number: " );
        int secondNum = input.nextInt();
        System.out.print("Enter a number: " );
        int thirdNum = input.nextInt();
        if (Math.abs(firstNum- secondNum)>20 || Math.abs(secondNum-thirdNum)>20 || Math.abs(thirdNum-firstNum)>20)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }

    }

    public static void exercise63()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter a number: ");
        int secondNum = input.nextInt();

        if(firstNum==secondNum)
        {
            System.out.print("0");
        }
        else if(firstNum%6 == secondNum%6)
        {
            if(firstNum> secondNum) {
                System.out.print(secondNum);
            }
            else
            {
                System.out.print(firstNum);
            }
        }
        else if(firstNum>secondNum)
        {
            System.out.print(firstNum);
        }
        else
        {
            System.out.print(secondNum);
        }
    }

    public static void exercise64()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 25 and 75: ");
        int firstNum = input.nextInt();
        System.out.print("Enter a number between 25 and 75: ");
        int secondNum = input.nextInt();
        int firstDigit = firstNum%10;
        int secondDigit = firstNum/10;
        int thirdDigit = secondNum%10;
        int fourthDigit = secondNum/10;
        if (firstDigit==secondDigit || firstDigit==thirdDigit || firstDigit==fourthDigit || secondDigit==thirdDigit ||secondDigit==fourthDigit ||thirdDigit==fourthDigit)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }


    }
    public static void exercise67() {
        String baseString = "Python 3.0";
        String inputWord = "Tutorial";
        System.out.println(baseString.substring(0, 7) + inputWord + baseString.substring(6));
    }

    public static void exercise68(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String baseString = input.nextLine();
        String lastThree = baseString.substring(baseString.length() - 3);
        System.out.println(lastThree + lastThree + lastThree + lastThree);
    }

    public static void exercise69(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String baseString = input.nextLine();
        String halfString = baseString.substring(baseString.length()/2);
        System.out.println(halfString);
    }
    public static void exercise70() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String firstString = input.nextLine();
        System.out.print("Enter another word: ");
        String secondString = input.nextLine();
        if (firstString.length() >= secondString.length()) {
            System.out.print(secondString + firstString + secondString);
        } else {
            System.out.println(firstString + secondString + firstString);
        }
    }

    public static void exercise71(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String firstString = input.nextLine();
        System.out.print("Enter another word: ");
        String secondString = input.nextLine();

        String newFirstString = firstString.substring(1);
        String newSecondString = secondString.substring(1);
        System.out.print(newFirstString +newSecondString);
    }

    public static void exercise72(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String stringInput = input.nextLine();

        if (stringInput.length()>=3){
            System.out.print(stringInput.substring(0,3));
        }
        else if (stringInput.length()==2){
            System.out.print(stringInput + "#");
        }
        else if (stringInput.length()==1) {
            System.out.print(stringInput + "##");
        }
        else
            System.out.print("###");
    }

    public static void exercise74(){
        int size = 10;
        Scanner input = new Scanner(System.in);
        int numArray[] = new int [size];
        System.out.println("Enter the elements of the array one by one: ");
        for(int i=0; i<size; i++) {
            numArray[i] = input.nextInt();
        }

        if(numArray[0]==10 || numArray[9] ==10)
        {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }

    public static void exercise122() {
//        int size = 10;
//        Scanner input = new Scanner(System.in);
//        int numArray[] = new int [size];
//        System.out.println("Enter the elements of the array one by one: ");
//        for(int i=0; i<size; i++) {
//            numArray[i] = input.nextInt();
//        }
        int numArray[] = new int[]{-1, 2, 3, -1, 4, 5, 6};
        int maxSum =numArray[0];
        int maxBegin = 0;
        int maxEnd = 0;

        int sum = numArray[0];
        int begin = 0;
        int current = 0;

        while (current < numArray.length)
        {
            if (numArray[current] < 0){
                current = current+1;
                begin = current;
                sum = 0;
            }
            sum += numArray[current];
            if (sum > maxSum) {
                maxSum = sum;
                maxBegin = begin;
                maxEnd = current;
            }
            current++;
        }

        System.out.println("max sum= "+maxSum);

    }
        //make your own array for testing
//        int largestSum =0;
//        int previousSum = 0;
//        int storeSum = 0;
//        ArrayList<Integer> integers = new ArrayList<Integer>();
//        for(int x = 0; x<numArray.length; x++){
//            largestSum = largestSum + numArray[x];
//            previousSum += largestSum;
//            integers.add(x);
//            if(largestSum<previousSum){
//                largestSum =0;
//                previousSum =0;
//                integers.clear();
//            }
//        }
//        for(int i=0;i<integers.size();i++){
//            System.out.println(integers.get(i));

        //System.out.print(largestSum);

    public static void exercise178(){
        int numArray[] = new int[]{-1, 2, 3, -1, 4, 5, 6};
        int maxSum =numArray[0];
        int maxBegin = 0;
        int maxEnd = 0;

        int sum = numArray[0];
        int begin = 0;
        int current = 0;

        int count = 0;
        while (current < numArray.length)
        {
            if (numArray[current] < 0){
                current = current+1;
                begin = current;
                sum = 0;
            }
            sum += numArray[current];
            if (sum > maxSum) {
                maxSum = sum;
                maxBegin = begin;
                maxEnd = current;
                count ++;
            }
            current++;
        }

        System.out.println(count);

    }

    public static void exerciseArr26(){
        int numArray[] = new int[]{0, 2, 0, 3, 0, -1, 0, 4, 5, 6};

        int index = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] != 0) {
                numArray[index++] = numArray[i];
            }
        }
        for (int i = index; i < numArray.length; i++) {
            numArray[i] = 0;
        }


        for(int print: numArray) {
            System.out.print(print);
        }
    }

    public static void exerciseArr49(){
//        int numArr[] = new int[]{-1, 2,3};
        int numArr[] = new int[]{1, -1, 2, -2, 3, -3, 4, -4, 5, -5};
        int temp = 0;
        int n = 0;
        while(n<numArr.length){
            for (int i = 0; i < numArr.length-1; i++){
                if (numArr[i]<0){
                    temp = numArr[i];
                    numArr[i]= numArr[i+1];
                    numArr[i+1]= temp;

                }
            }
            n++;
        }
        for(int print: numArr){
            System.out.print(print + ", ");
        }
    }

    public static void exerciseArr55() {
        int numArr[] = new int[]{1, 3, -4, 5, 6, -1, 3, 7, 2, 5, -7};
        int sum = 0;
        int n = 0;
        ArrayList<Integer> subArray = new ArrayList<Integer>();
        for (int i = 0; i < numArr.length - 1; i++) {
            sum =0;
            subArray.removeAll(subArray);

            for (int j = i; j < numArr.length; j++) {
                sum += numArr[j];
                subArray.add(numArr[j]);
                if (sum == 0) {
                    System.out.print(subArray.toString());

                }
            }
        }

    }

    public static void exerciseArr58(){
        int[] numArrOne = new int[]{2,5,3,7,8};
        int[] numArrTwo = new int[]{1,4,6};
        int tempOne = 0;
        int tempTwo = 0;
        int arrayTwoindex = 0;

        while (arrayTwoindex<numArrTwo.length) {
            for (int i = 0; i < numArrOne.length; i++) {
                if (numArrOne[i] > numArrTwo[arrayTwoindex]) {
                    tempOne = numArrOne[i];
                    numArrOne[i] = numArrTwo[0];
                    numArrTwo[0] = tempOne;

                    for ( int j = 0; j < numArrTwo.length; j++) {
                        for ( int k = j + 1; k < numArrTwo.length; k++) {
                            if (numArrTwo[j] > numArrTwo[k]) {
                                tempTwo = numArrTwo[j];
                                numArrTwo[j] = numArrTwo[k];
                                numArrTwo[k] = tempTwo;

                            }
                        }
                    }

                }
            }
            arrayTwoindex++;
        }
        System.out.print(Arrays.toString(numArrOne));
        System.out.print(Arrays.toString(numArrTwo));
    }

    public static void exerciseArr59(){
        int numArray [] = new int[]{2,5,7,9,8,100,-5,3,99,60};


        int temp = 0;
        int largest = numArray[0];
        int secondLargest = numArray[1];

        if (largest <secondLargest ){
            temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }
        for (int i = 2; i< numArray.length; i ++){
            if(numArray[i]>largest){
                secondLargest = largest;
                largest = numArray[i];
            }
            else if (numArray[i] > secondLargest && numArray[i]!=largest){
                secondLargest = numArray[i];
            }
        }
        System.out.print(largest*secondLargest);
    }

    public static void exerciseArr61(){
        int [] numArray = new int[]{1,6,7,8,2,3,5,43,75,19,11};
        int temp = 0;
        for (int i = 1; i < numArray.length; i += 2)
        {
            if (numArray[i - 1] > numArray[i]) {
                temp = numArray[i-1];
                numArray[i-1] = numArray[i];
                numArray[i] = temp;
            }

            if (i + 1 < numArray.length && numArray[i + 1] > numArray[i]) {
                temp = numArray[i+1];
                numArray[i+1] = numArray[i];
                numArray[i] = temp;
            }
        }
        System.out.print(Arrays.toString(numArray));
    }

    public static void exerciseArr68() {
        int[] numArray = new int[]{1, 2, 3};
        int startIndex = 0;
        int endIndex = 0;
        int temp = 0;

        //if ( ==numArray.length)
        {
            for (int i = 0; i < numArray.length; i++) {
                System.out.print(" [" + numArray[i] + "] ");
            }
            System.out.println();

        }

    }
    public static void exerciseArr71(){
        int [] numArray = new int[]{3,9,1,8,4};

        Arrays.sort(numArray);
        for(int i = numArray.length-1; i>=0; i--) {
            if(numArray[i]>0){
                System.out.print(numArray[i]);
            }
        }

    }
}



