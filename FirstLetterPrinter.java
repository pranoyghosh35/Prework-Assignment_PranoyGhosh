/*
Question 1 : First Letter Printer
Provided with a string, need to create a string with the first letter of every word in the string.
 */

import java.util.Scanner;
class FirstLetterPrinter {
public static void main (String[] args) 
{
 Scanner in = new Scanner(System.in);
 String input = in.nextLine();
 System.out.println(firstLetterPrinter(input));
 in.close();
}
static String firstLetterPrinter(String str)
 {
 // my code begins here
 String firstLetterWord="";
 Scanner sen=new Scanner(str); 
 while (sen.hasNext())
 {
    String token=sen.next();
    firstLetterWord=firstLetterWord+token.charAt(0);
 }
 sen.close();
return firstLetterWord;
 }
}

/* Sample test cases:
 * input: "Pranoy Ghosh;" output: "PG"
 * input: "great learning" output: "gl"
 * input: "dream without fear. Love without Limits." output:"dwfLwL"
 * input: "change the world by being yourself." output:"ctwbby"
 * input: "When nothing goes right, go left." output:"Wngrgl"
 */