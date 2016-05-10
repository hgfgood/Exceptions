
public class CreateNoClassDefFondError {
	public  void print(){
		System.out.println(this.getClass().getClassLoader().getResource("").toString());
	}
	
	public static void main(String[] args) {
		new CreateNoClassDefFondError().print();
		
	}

}
