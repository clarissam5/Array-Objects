public class Tutorials {

 public static void main(String[] args){
  
  Student anil = new Student();
  Student shreesh = new Student("Shreesh",25);
  Student anjali = new Student();  
  
  int [] marks = new int[10]; 
  
  //class name is Student array name students 
  //can only store 1 type of data in an array 
  Student[] student = new Student[3]; //how many elements in student array 
  	student[0]= anil;
	student[1]= shreesh;
	student[2]= anjali;
	
	//setname for anil object
	anil.setNameAndAge("anil", 24);
 } 
}