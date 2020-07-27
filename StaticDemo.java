package Module1;

class Employees{
	int id;
	int salary;
	static String company="SRT Traders";
	void check1()
	{
		
		
	}
static void check() {
	company="WIIT";
}
	
	Employees(int i, int s){
		id=i;
		salary=s;	
	}
	
	void display() {
		System.out.println(id+" "+salary+" "+company);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
Employees.check();

Employees e1=new Employees(25,25000);
Employees e2=new Employees(30,3000);
e1.display();
e2.display();
	}
}





