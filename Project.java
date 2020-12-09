package Abdulmalik.Project;

import java.util.Scanner ;


public class Project {

	public static void main(String[] args) {
		int rank[]= {1,2,3,4,5};
		
		
            
            	 Scanner input=new Scanner(System.in);{
         		Studints stu=new Studints();
         		System.out.println("Welcome ");
         		stu.name="Abdulmalik";
                
         		System.out.println(stu.name+" Please Enter Your Mark ");
         		stu.mark=input.nextDouble();
         		if(stu.average() >=60)
         			
         			
         		System.out.println("Your average is "+stu.average()+" You have passed "+ "your rank is "+rank[0]);
         		
         			else 
         				System.out.println("Abdulmalik Your Average is "+stu.average()+" You do't passed"); 
         		{
         		Studints stu1=new Studints();
         		System.out.println("Welcome ");
         		stu1.name="Faisal";
                
         		System.out.println(stu1.name+" Please Enter Your Mark ");
         		stu1.mark=input.nextDouble();
         		if(stu1.average() >=60)
         			
         			
         		System.out.println("Faisal Your average is "+stu1.average()+" You have passed "+ "your rank is "+rank[1]);
         		
         			else 
         				System.out.println("Faisal Your Average is "+stu1.average()+" You do't passed"); 
         		Studints stu2=new Studints();
         		System.out.println("Welcome ");
         		stu2.name="Ali";
                
         		System.out.println(stu2.name+" Please Enter Your Mark ");
         		stu2.mark=input.nextDouble();
         		if(stu2.average() >=60)
         			
         			
         		System.out.println("Ali Your average is "+stu2.average()+" You have passed "+"your rank is "+ rank[2]);
         		
         			else 
         				System.out.println("Ali Your Average is "+stu2.average()+" You do't passed");
         		Studints stu3=new Studints();
         		System.out.println("Welcome ");
         		stu3.name="Ahmed";
                
         		System.out.println(stu3.name+" Please Enter Your Mark ");
         		stu3.mark=input.nextDouble();
         		if(stu3.average() >=60)
         			
         			
         		System.out.println("Ahmed Your average is "+stu3.average()+" You have passed" +"your rank is "+  rank[3]);
         		
         			else 
         				System.out.println("Ahmed Your Average is "+stu3.average()+" You do't passed");
         		Studints stu4=new Studints();
         		System.out.println("Welcome ");
         		stu4.name="Saleh";
                
         		System.out.println(stu4.name+" Please Enter Your Mark ");
         		stu4.mark=input.nextDouble();
         		if(stu4.average() >=60)
         			
         			
         		System.out.println("Saleh Your average is "+stu4.average()+" You have passed "+ "your rank is "+rank[4]);
         		
         			else 
         				System.out.println("Saleh Your Average is "+stu4.average()+" You do't passed");
            	 }
			
		
            	 }
		
		
		
				

	}

}

