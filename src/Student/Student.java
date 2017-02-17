package Student;

public class Student implements Comparable<Student>{
	
	private String name;
	private String ID;
	
	public Student(){
		this.name="N/A";
		this.ID="N/A";
	}
	public Student(String name,String ID){
		this.name=name;
		this.ID=ID;
	}
	//mutator
	public void setName(String name){
	
		this.name=name;
	
	}
	public void setID(String ID){
		
		this.ID=ID;
		
	}
	//accessor
	public String getName(){
		
		return this.name;
	
	}
	public  String getID(){
		
		return this.ID;
	}
	
	public String toString(){
		
		return "My name is "+name+", and my id is "+ID;
		
		
	}

	public int compareTo(Student S){
		
	    return this.name.compareToIgnoreCase(S.name);
	//	return this.ID.compareToIgnoreCase(S.ID);
	}
	
}
