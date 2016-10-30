import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.util.logging;
public class Matrix_Multiplication {


	public static int[][] m1;
	public static int[][] m2;
	public static int[][] m3;
	public static int[][] LoadMatrix()throws Exception {

		Scanner s= new Scanner(System.in);	
		int rows = s.nextInt();
		int cols = s.nextInt();
		int mat[][] =new int [rows][cols];
		for(int i=0;i<rows;i++)
			for (int j=0;j<cols;j++)
				mat[i][j]=s.nextInt();


		return mat;	
	}	



	public static class Thread1 extends Thread{
		@Override
		public  void run(){

			//int r= m1.length;
			int c = m2[0].length;
			int k=(m1.length)/4;
			for(int i=0;i<=k;i++)
				for(int j=0;j<c;j++)
					for(int l=0;l<m2.length;l++)
						m3[i][j]+=m1[i][l]*m2[l][j];


		}


	}


	public static class Thread2 extends Thread{
		@Override
		public  void run(){

			//int r= m1.length;
			int c = m2[0].length;
			int k=(m1.length)/2+1;
			int s=(m1.length)/4+1;

			for(int i=s;i<k;i++)
				for(int j=0;j<c;j++)
					for(int l=0;l<m2.length;l++)
						m3[i][j]+=m1[i][l]*m2[l][j];


		}


	}

	public static class Thread3 extends Thread{
		@Override
		public  void run(){

			int r= m1.length;
			int c = m2[0].length;
			int k=((3*m1.length)/4)+1;
			int s=(m1.length)/2+1;
			for(int i=s;i<k;i++)
				for(int j=0;j<c;j++)
					for(int l=0;l<m2.length;l++)
						m3[i][j]+=m1[i][l]*m2[l][j];


		}


	}


	public static class Thread4 extends Thread{
		@Override
		public  void run(){

			int r= m1.length;
			int c = m2[0].length;
			int k=((3*m1.length)/4)+1;
			for(int i=k;i<r;i++)
				for(int j=0;j<c;j++)
				{for(int l=0;l<m2.length;l++)
					m3[i][j]+=m1[i][l]*m2[l][j];
				}    

		}


	}

	public static void main(String[] args)throws Exception {

		long t1=System.currentTimeMillis();
		m1 = LoadMatrix();
		m2= LoadMatrix();
		m3 = new int [m1.length][m2[0].length];
		Thread1 th1=new Thread1();
		Thread2 th2= new Thread2();
		Thread3 th3= new Thread3();
		Thread4 th4= new Thread4();

		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th1.join();
		th2.join();
		th3.join();
		th4.join();

		for(int i=0;i<m1.length;i++){
			for(int j=0;j<m2[0].length;j++)
			{System.out.print(m3[i][j]+"   ");}
			System.out.println();}

		long t2= System.currentTimeMillis();
		System.out.println("Total time count "+(t2-t1)/1000+" seconds");


	}
}


