import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int sum = 0, avg;      
    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    for(int i=0;i<size;i++){
        int num = sc.nextInt();
        list.add(num);
    }
  
    for(int i = 0; i < list.size(); i++)  
    sum = sum + list.get(i);  
    avg = sum / list.size();   
    System.out.println("The average of the List: " + avg);  
	}
}