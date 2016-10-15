/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;

/**
 *
 * @author RizelleAnn
 */


import java.io.*;
import java.util.*;


public class StudentDB {

    public static void main(String[] args) throws FileNotFoundException, IOException{

 List<Student> myList = new ArrayList<Student>();
		String sn = "";
		String fn = "";
		char mi = '\0';
		String ln = "";
		String c = "";
		int yl = 0;    
		int choice = 0; 	
	    BufferedReader br = null;

	    
	        /*try{
	            br = new BufferedReader(new FileReader("C:\\Users\\RizelleAnn\\Desktop\\testing.txt"));	
	            String line;
	            Student s = new Student(sn, fn, mi, ln, c, yl);
	            while((line = br.readLine()) != null) {
	            	 	sn = line.toString();
						fn = line;
			        	mi = line.charAt(0);
			        	ln = line;
			        	c = line;
			        	yl  = (int)Integer.parseInt(line);
	                    
	            }
	            
					myList.add(s);
	        } catch(IOException e) {
	        	e.printStackTrace();
	        } finally {
	            //System.out.println("goodbye");
	            try{
	                    if(br!=null)
	                    br.close();
	            }
	            catch(IOException x){
	            	x.printStackTrace();
	            }		
	        }
/*
	    for(Student s: myList) {
            System.out.println(s);

        }*///System.out.println("success");*/


        System.out.println("\n============== STUDENT INFORMATION SYTEM ==============\n");

        while(choice >= 0 && choice <= 4){
            System.out.println("");
            System.out.println("1) Register a Student");
            System.out.println("2) Retrieve Student Information");
            System.out.println("3) Delete Student Information");
            System.out.println("4) Save");
            System.out.println("5) Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            sc.nextLine();

            switch(choice){
            case 1:

                System.out.println("\t\t\tREGISTER\n");
                System.out.print("Student Number:\t\t");
                sn = sc.nextLine();
                System.out.print("Student First Name:\t");
                fn = sc.nextLine();
                System.out.print("Student Middle Initial:\t");
                mi = sc.nextLine().charAt(0);
                System.out.print("Student Last Name:\t");
                ln = sc.nextLine();
                System.out.print("Student Course:\t\t");
                c = sc.nextLine();
                System.out.print("Student Year Level:\t");
                yl = Integer.parseInt(sc.nextLine());

                Student a = new Student(sn,fn,mi,ln,c,yl);

                myList.add(a);

                System.out.println("\n\tStudent added!");

                break;

            case 2:

                System.out.println("\t\t\tSEARCH\n");
                System.out.println("Enter Student Number:");
                sn = sc.next();

                for(Student s: myList){
                        if(s.getStudentNumber().equals(sn)){
                                System.out.println("Student Number:"+ s.getStudentNumber());
                                System.out.println("Name: "+ s.getLastName()+","+ s.getFirstName()+ s.getMiddleInitial());
                                System.out.println("Program: "+ s.getCourse());
                                System.out.println("Year Level: "+ s.getYearLevel());

                        }
                        else{
                                System.out.println("NO SUCH STUDENT WITH STUDENT NUMBER EXISTS");

                        }
                }

                break;

            case 3:

                System.out.println("\t\t\tDELETE\n");
                System.out.print("Enter Student Number:\t");
                sn = sc.next();
                int i = 0;
                    for(Student s: myList){
                        if(s.getStudentNumber().equals(sn)){
                                myList.remove(i);
                        }
                    i++;
                    }
                break;
            case 4:


                try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\RizelleAnn\\Desktop\\testing.txt", true))) {
                    for(Student s: myList){
                        bw.write(s.getStudentNumber());
                        bw.newLine();
                        bw.write(s.getFirstName());
                        bw.newLine();
                        bw.write(s.getMiddleInitial());
                        bw.newLine();
                        bw.write(s.getLastName());
                        bw.newLine();
                        bw.write(s.getCourse());
                        bw.newLine();
                        bw.write(String.valueOf(s.getYearLevel()));
                        bw.newLine();

                   }
               } catch (IOException e) {}


                br = null;
                    try{
                        br = new BufferedReader(new FileReader("C:\\Users\\RizelleAnn\\Desktop\\testing.txt"));	
                        String line;
                        //StringBuilder sb = new StringBuilder();

                        while((line = br.readLine()) != null) {
                                System.out.println(line);
                        }
                    } catch(IOException e) {
                    } finally {
                        //System.out.println("goodbye");
                        try{
                                if(br!=null)
                                br.close();
                        }
                        catch(IOException x){
                        }		
                    }

                     break;
            default: 
                System.out.println("============== THANK YOU! ==============");
                break;
            }
        }
    }
    
}



