package september22;

public class StudentsMain {
	
	public static void main(String [] args) {
		
		Students Wajhul = new Students();
		Students Akshay = new Students();
		Students Hritik = new Students();
		Students Salman = new Students();
		Students Ajay = new Students();
		
		Wajhul.setstudentRollNo(1);
		Wajhul.setstudentName("Wajhul Huda");
		Wajhul.setstudentClass(7);
		Wajhul.setstudentAge(13);
		Wajhul.setstudentCity("Barabanki");
		
		Akshay.setstudentRollNo(2);
		Akshay.setstudentName("Akshay Khanna");
		Akshay.setstudentClass(9);
		Akshay.setstudentAge(23);
		Akshay.setstudentCity("Kolkata");
		
		Hritik.setstudentRollNo(3);
		Hritik.setstudentName("Hritik Sharma");
		Hritik.setstudentClass(3);
		Hritik.setstudentAge(10);
		Hritik.setstudentCity("Mohali");
		
		Salman.setstudentRollNo(3);
		Salman.setstudentName("Salman Khan");
		Salman.setstudentClass(4);
		Salman.setstudentAge(18);
		Salman.setstudentCity("Mumbai");
		
		Ajay.setstudentRollNo(5);
		Ajay.setstudentName("Ajay Kumar");
		Ajay.setstudentClass(12);
		Ajay.setstudentAge(23);
		Ajay.setstudentCity("Mohali");
		
		System.out.println(Wajhul.getstudentRollNo());
		System.out.println(Wajhul.getstudentName());
		System.out.println(Wajhul.getstudentClass());
		System.out.println(Wajhul.getstudentAge());
		System.out.println(Wajhul.getstudentCity());
		
		System.out.println(" ");
		
		System.out.println(Hritik.getstudentRollNo());
		System.out.println(Hritik.getstudentName());
		System.out.println(Hritik.getstudentClass());
		System.out.println(Hritik.getstudentAge());
		System.out.println(Hritik.getstudentCity());
		
		System.out.println(" ");
		
		System.out.println(Akshay.getstudentRollNo());
		System.out.println(Akshay.getstudentName());
		System.out.println(Akshay.getstudentClass());
		System.out.println(Akshay.getstudentAge());
		System.out.println(Akshay.getstudentCity());
		
		System.out.println("");
		
		System.out.println(Salman.getstudentRollNo());
		System.out.println(Salman.getstudentName());
		System.out.println(Salman.getstudentClass());
		System.out.println(Salman.getstudentAge());
		System.out.println(Salman.getstudentCity());
		
		System.out.println(" ");
		
		System.out.println(Ajay.getstudentRollNo());
		System.out.println(Ajay.getstudentName());
		System.out.println(Ajay.getstudentClass());
		System.out.println(Ajay.getstudentAge());
		System.out.println(Ajay.getstudentCity());
	}

}
