package review06;

public class School {

		public static void main (String[] args) {
			
			Student student1=new Student();
			
			student1.name="Samira";
			student1.lastName="Hurst";
			student1.address="Virginia";
			
			student1.studentID=101;
			student1.age=25;
			student1.grade='A';
			
			Student student2=new Student();
			student2.name="Omide";
			student2.lastName="Jake";
			student2.address="Vali";
			student2.age=18;
			student2.studentID=102;
			student2.grade='A';
			//accessing method of student class
			student2.study();
			student2.doHomework();
			
			System.out.println("________");
			
			student1.study();
			student1.doHomework();
			
		}
}
