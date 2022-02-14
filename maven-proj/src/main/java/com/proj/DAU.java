package com.proj;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;  

public class DAU {
	//get the data of a date and all the users on that date
	HashMap<String,Set<Integer>> map;
	
	public DAU(String file) throws IOException {
	   map=new HashMap<String,Set<Integer>>();
		
	
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			//loop lines
			for (String line = br.readLine(); line != null; line = br.readLine()) {
				//getting a line data
				String [] parts=line.split(",");
				int id = Integer.parseInt(parts[0]);
				String date = (parts[1].split(" "))[0];
				
				//put data in map
				if(!map.containsKey(date)) {
					Set<Integer> s=new HashSet<Integer>();;
					s.add(id);
					map.put(date, s);
				}
				else {
					map.get(date).add(id);
				}
			}
			
			br.close();
		}catch (IOException e) {
			System.out.print("IOException exception\n");
		}	
	}
	
	//you can both give input through the scanner or through passing argument to getUsersNum, 
	//if you pass a non empty("") string then function will take the argument, else will use scanner
	public int getUsersNum(String arg) {
		String date;
		//get the date
		Scanner sc= new Scanner(System.in);  
		try { 
			if(arg=="") {
				System.out.print("Enter the date in day/month/year format:\n");  
				date= sc.nextLine(); 
			}
			else {
				date=arg;
			}
			if(!checkDate(date)) {
				System.out.print("Date format is incorrect\n");  
				sc.close();
				return 0;
			}
			if(!map.containsKey(date)) {//no users in this date
				sc.close();
				return 0;
			}
			else {//return the number of users
				sc.close();
				return map.get(date).size();
			}
        }
        catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }
		sc.close();
		return 0;
	}
	
	public boolean checkDate(String date) {
		String [] parts=date.split("/");
		if(parts.length!=3) {
			return false;
		}
		try {
		    int day = Integer.parseInt(parts[0]);
		    int month = Integer.parseInt(parts[1]);
		    int year = Integer.parseInt(parts[2]);
		    
		    if(day<1 || day>31) {
		    	return false;
		    }
		    if(month<1 || day>12) {
		    	return false;
		    }
		    if(year>2022) {//assume all logs are of this year at max
		    	return false;
		    }
		} catch (NumberFormatException e) {
		    System.out.println("Input String cannot be parsed to Integer.");
		}
		return true;
	}
}
