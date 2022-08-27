/*Print the following pattern for a given n value. Eg:
n=2:
2 2 1 1
2 1

n=3:
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1 */
import java.util.Scanner;
public class PatternPrinter 
{
 public static void main(String[] args) 
 {
 Scanner in = new Scanner(System.in);
 int n = in .nextInt();
 patternPrinter(n);
 in.close();
 }
 static void patternPrinter(int n) 
 {
// mycode begins here
// We create an int array with n to 1 elements.
int num[]=new int[n];
for (int ind=0;ind<n;ind++)
    num[ind]=n-ind;
// We see there will be n new lines.
for (int i=0;i<n;i++)
{
// In each line num[index] will be printed count=n-i times each then index increments by 1.
int ind=0,count=0;
while(ind<=(n-1))
    {
        System.out.print(num[ind]+" ");
        count++;
        if(count==n-i)
        {
        ind++;
        count=0;
        }
    }
System.out.println();
}
}
}

/*5
5 5 5 5 5 4 4 4 4 4 3 3 3 3 3 2 2 2 2 2 1 1 1 1 1 
5 5 5 5 4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1 
5 5 5 4 4 4 3 3 3 2 2 2 1 1 1 
5 5 4 4 3 3 2 2 1 1 
5 4 3 2 1 */