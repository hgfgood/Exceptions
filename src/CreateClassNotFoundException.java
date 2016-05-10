
public class CreateClassNotFoundException {
	
	public void notFound2(){
		try {
			this.getClass().getClassLoader().loadClass("A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		try {
			Class.forName("A");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
