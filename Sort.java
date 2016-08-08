import java.io.*;
import java.util.*;

class SearchIntArray2
{

 public static void main(String[] args)
 throws IO exception
 {
  int n,max,num,pos;
  int[] array;
  Random rand = new Random();
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter number of integers: ");
  n = Integer.parseInt(in.readLine());
  array = new int[n];
  System.out.print("Enter highest integer: ");
  max = Integer.parseInt(in.readLine());
  for(int i=0; i<n; i++)
     array[i] = (int)(rand.nextDouble()*max)+1;
  System.out.println("The array is:");
  System.out.println(arrayToString(array));
  System.out.print("Enter the number you want: ");
  num = Integer.parseInt(in.readLine());
  pos = search(num,array);
  if(pos==-1)
     System.out.println("The number is not in the array");
  else
     System.out.println("The number is at position "+pos);
 }