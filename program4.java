import java.util.Scanner;
 
public class program4
{
  public static void main(String args[])
  {
    int rows, i, j;
    int ch = 64;
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter the number of rows: ");
    rows = sc.nextInt();
 
    System.out.print("Output:\n");
    for (i = 1; i <= rows; i++)
    {
      for (j = 1; j <= i; j++)
        System.out.print((char)(i + ch)+" ");
 
      System.out.println();
    }
  }
}