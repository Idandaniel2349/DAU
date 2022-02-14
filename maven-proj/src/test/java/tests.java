import java.io.IOException;

import com.proj.DAU;

public class tests {
	public static void main(String []args) throws IOException {
		DAU d= new DAU("src/test/resources/input.txt");
		
		//test1
		if(d.getUsersNum("01/01/2020")!=3) {
			System.out.print("test1 Failed\n");
		}
		else {System.out.print("test1 Sucess\n");}
		
		//test2
		if(d.getUsersNum("02/01/2020")!=2) {
			System.out.print("test2 Failed\n");
		}
		else {System.out.print("test2 Sucess\n");}
		
		//test3
		if(d.getUsersNum("03/01/2020")!=2) {
			System.out.print("test3 Failed\n");
		}
		else {System.out.print("test3 Sucess\n");}
		
		//test4
		if(d.getUsersNum("04/01/2020")!=0) {
			System.out.print("test4 Failed\n");
		}
		else {System.out.print("test4 Sucess\n");}
		
		//test5
		if(d.getUsersNum("04/01/2049")!=0) {
			System.out.print("test5 Failed\n");
		}
		else {System.out.print("test5 Sucess\n");}
		
		//test6
		if(d.getUsersNum("04/01")!=0) {
			System.out.print("test6 Failed\n");
		}
		else {System.out.print("test6 Sucess\n");}
		
		//test7
		if(d.getUsersNum("04/01/yy")!=0) {
			System.out.print("test7 Failed\n");
		}
		else {System.out.print("test7 Sucess\n");}
		
		//test8
		if(d.getUsersNum("67")!=0) {
			System.out.print("test8 Failed\n");
		}
		else {System.out.print("test8 Sucess\n");}
		
		
		
		DAU d2= new DAU("src/test/resources/input2.txt");
		
		//test9
		if(d2.getUsersNum("01/01/2020")!=5) {
			System.out.print("test9 Failed\n");
		}
		else {System.out.print("test9 Sucess\n");}
		
		//test10
		if(d2.getUsersNum("03/03/2022")!=10) {
			System.out.print("test10 Failed\n");
		}
		else {System.out.print("test10 Sucess\n");}
	}
}
