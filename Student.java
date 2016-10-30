package assignment;

import java.security.KeyStore.LoadStoreParameter;
import java.util.Scanner;

/**
* This is a class to define the necessary attributes and methods to conceptualize a "Student"
* The spepcific tasks are:
* 1. Instiate 
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Student
{
  // Declare the important attributes of a student. For example:
 static int Id;//1.Id
 static String Name; //2. Name
 static String Department; //3. Department
 static  String University; //4. University
 static double[][] GPA; //5. GPAs in various terms (Multidimensional arrays)
 static String[] Subject; //6. subjects for Current terms
 static double Credit; //7. Credits and grades of Current Terms (Multidimmentional Array)
  
   

   /**
    * Define a constructor that initilize the default properties of the Student
    */
   public Student()
   {
       // initialise   variables with defult values
	   Name="\0";
	   Department="\0";
	   University="\0";
	   Id=0;
	   Credit=0;
	   
	   System.out.print("jasdh");
       
   }
   /**
    * Define a method to print the students details.
    */
   
 static  public void studentDetailsById(int Id)
   {
       //write your code here
	   System.out.println(Student.Name);
	   System.out.println(Student.Department);
	   System.out.println(Student.University);
	   System.out.println(Student.Id);
	   System.out.println(Student.Credit);
	   
   }
 
   /**
    * Define a method to update information of students by ID
    * Use as many arguments as required.
    */
   public  Student(int Id,String Name,String Department,String University,double Credit,double[][] gpa)
   {
       //Write your code here
	   this.Id=Id;
	   this.Name=Name;
	   this.Department=Department;
	   this.University=University;
	   this.Credit=Credit;
   }
   
   /**
    * Define a method to compute the CGPA from the Given term GPA for a particular student.
    * se as many arguments as required.
    */
//   public double computeCGPAByID()
//   {
//       // Write your code here
//   }
//   
   /**
    * Define a method to compute the GPA from the given Credits and Grades of all the subjects
    */
//   public double computeGPAById()
//   {
//       //write yor code here
//   }
//   
   /**
    * After performing required operations on each student, save the information to a file. Use File and PrintWriter Class. 
    * use as many arguments as required.
    * 
    */
   public void saveStudents()
   {
       //Write your code here
   }
   
   /**
    * Create a dummy files with infromations to describe the properties of a Student object and load the data files using Java File and Scanner class.
    * use as many arguments as required.
    */
  static  public void loadStudents()
   {
       //Write your code here
	  Scanner input=new Scanner(System.in);
	   int id=input.nextInt();
	   String n=input.nextLine();
	   String u=input.nextLine();
	   String d=input.nextLine();
	   double[][] g=new double[8][8] ; 
	   System.out.println("ENter GPA: ");
	   for(int i=1;i<=4;i++)
		   for (int j=1;j<=2;j++)
		   {
			   g[i][j]=input.nextDouble();
		   }
		   
	   double c=input.nextDouble();
	   
	 //  Student s(id,n,d,u,c,g);
   }
   
   /**
    * The tasks to be carried out here:
    * 1. Create an Arrays of students using Student Class. Initlize them and perfom all the above defined operation to evualuate your code.
    * use as many arguments as required.
    */
   public static void main(String[] args)
   {
	   Student student;
	   //Write your main function to execute call defined methods
	   loadStudents();
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter id: ");
	   int id=input.nextInt();
	   studentDetailsById(id);
	   
	   
   }
}
