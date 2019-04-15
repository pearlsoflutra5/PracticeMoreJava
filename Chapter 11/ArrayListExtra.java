import java.util.ArrayList;
import java.util.Sanner;


class ArrayListExtra {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<INTeger> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		if (list.isEmpty()){
			System.out.println("Emptey List")
		}
		else {
			System.out.println("lsit has size" + list.size());
		}
		
		System.out.println("enter a number: ")
		num = input.nextInt
		
		if (list.contains(num)){
			System.out.println("list does contain your number: " + num);
			
		}
		
		
	}
	
}