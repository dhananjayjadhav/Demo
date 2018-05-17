class Simple 
{
   String designation = "Teacher";
   String collegeName = "Modern";
   void does()
    {
	System.out.println("Teaching");
   }
}

public class PhysicsTeacher extends Simple{
   String Subjects1 = "OOPs";
   public static void main(String args[]){
	OopsTeacher obj = new OopsTeacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.Subjects1);
	obj.does();
   }
}