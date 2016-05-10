
public class CreateUnsatisfiedLinkError {
	public native void nativeMethod();
	static{
		System.out.println("no lib");
	}

	public static void main(String[] args) {
		new CreateUnsatisfiedLinkError().nativeMethod();//由于本地库中不存在nativeMethod方法，所以报错UnsatisfiedLinkError
	}
	

}
