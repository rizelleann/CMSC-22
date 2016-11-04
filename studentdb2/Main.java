/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentdb2;

/**
 *  created by Rizelle Ann Bahin
 */

import java.io.*;
import java.util.*;

public class Main {

	public static final String FILE = "StudentDataBase.cer";
	public static void main(String[] args){
            
                FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
                
		List<Student> myList = new ArrayList<Student>();
                
		
		BufferedReader	br = null;
		String stdn = " ";
		String first= " ";
		String last=" ";
		String pg=" ";
		char middle= '\0';
		int year;
		
		if(file.exists()){
		try{
			br = new BufferedReader(new FileReader("studentrecords.txt"));
			
			
			String line;
			int c=0;
			while((line = br.readLine())!=null){
				if(c==0){
				   stdn = line; 
				}
				else if(c==1){
				   first = line;
				}
				else if(c==2){
					middle = line.charAt(0);
				}
				else if(c==3){
					last = line;
				}
				else if(c==4){
					pg = line;
				}
				else if(c==5){
					year = Integer.parseInt(line);
					
					Student b = new Student(stdn,first, middle,last,pg,year);
					myList.add(b);
					c=0;
				}
				c++;
				
			}
		}
		catch(IOException e){
			e.printStackTrace();
			
		}try{
			br.close();
		}catch(IOException x){
			x.printStackTrace();
		}
		
		}
		
		int choice;
		
		do{
		System.out.println("\t MENU\t");
		System.out.println("1) Register a student");
		System.out.println("2) Retrieve a student");
		System.out.println("3) Delete a student");
		System.out.println("4) Save");
		System.out.println("5) Exit");
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		String sn,fn,ln,c;
		char mi;
		int yl;
		
		switch(choice){
		case 1:
			System.out.println("Enter Student Number:");
			sn = sc.next();
			System.out.println("Enter Student First Name:");
			fn = sc.next();
			System.out.println("Enter Student Middle Initial:");
			mi = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Enter Student Last Name:");
			ln = sc.nextLine();
			System.out.println("Enter Student Course:");
			c = sc.nextLine();
			System.out.println("Enter Student Year Level:");
			yl = sc.nextInt();
			
			boolean clear;
			
			clear = check(myList, sn);
			
			if(clear){
			Student a = new Student(sn,fn,mi,ln,c,yl);
			
			myList.add(a);
			
			System.out.println("Student added!");
			
			}
			
			displayAllStudents(myList);
			break;
			
		case 2:
			System.out.println("Enter Student Number:");
			sn = sc.next();
			
			for(Student s: myList){
				if(s.getStudentNumber().equals(sn)){
					System.out.println(s);
					
				}
			}
			//System.out.println("NO SUCH STUDENT WITH STUDENT NUMBER EXISTS");
			
			break;
		case 3:
			System.out.println("Enter Student Number:");
			sn = sc.next();
			int count = 0;
			
			for(Student s: myList){
				if(s.getStudentNumber().equals(sn)){
					myList.remove(count);
					break;
				}
				count++;
			}
			System.out.println("Student " + sn + " deleted!");
			displayAllStudents(myList);
			break;
		case 4:
			BufferedWriter bw = null;
			try{
			
			File fl = new File("studentrecords.txt");
			
			if(!fl.exists()){
				fl.createNewFile();
			}
			
			FileWriter f = new FileWriter(fl.getAbsoluteFile());
			bw = new BufferedWriter(f);
			
				
				for(Student s : myList){
					bw.append(s.getStudentNumber());
					bw.newLine();
					bw.append(s.getFirstName());
					bw.newLine();
					bw.append(s.getMiddleInitial());
					bw.newLine();
					bw.append(s.getLastName());
					bw.newLine();
					bw.append(s.getCourse());
					bw.newLine();
					bw.append(String.valueOf(s.getYearLevel()));
					bw.newLine();
				}
			}
		catch(IOException e){
				//System.out.println("Error in filewriting");
			e.printStackTrace();
		}	
				try{
					//	fw.flush();
					bw.close();
				}catch(IOException e){
					//System.out.println("Error while flushing filewriter");
					e.printStackTrace();
					
				}
			
			System.out.println("Database Saved");
			
			break;
		case 5:
			System.out.println("EXIT");
			break;
		}
		
		}while(choice!=5);
		
		}
	public static void displayAllStudents(List<Student> myList,ObjectInputStream ois) throws IOException {
		for (Student s: myList){
			System.out.print(s.toString());
		}
	}
	
	public static boolean check(List<Student> myList, String sn){
		for(Student s: myList){
			if(s.getStudentNumber().equals(sn)){
				System.out.println("Student number already exists");
				return false;
			}
		}
		return true;
	}
	
	
	
}
