package kodlamaioOdev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1= new Course();
		course1.id=1;
		course1.name="yaz�l�m geli�tirici yeti�tirme kamp�";
		course1.progressPercentage=13;
		course1.teacherName="Engin DEM�RO�";
		Course course2= new Course(2,"yaz�l�m gelitirici yeti�tirme kamp�(java)",43,"Engin Demiro�");
		Course[] courses= {course1,course2};
		for(Course course:courses) {
			System.out.println(course.name +" "+ course.teacherName);
		}
		CourseManager courseManager1= new CourseManager();
		courseManager1.start(course1);
	
		
		
		

	}

}
