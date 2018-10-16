class Untitled3 {
	public static void main(String[] args) {
		double radius = 3; 
		System.out.println(radius <= 5);
		
		if (radius < 0) {
		 System.out.println("Incorrect input");
		}
		else {
		 double area = radius * radius * 3.14159;
		 System.out.println("Area is " + area);
		}
	}
}