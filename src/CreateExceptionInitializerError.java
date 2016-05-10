import java.util.HashMap;
import java.util.Map;

public class CreateExceptionInitializerError {
	public static Map m = new HashMap() {
		{
			m.put("a", 3); // 在还没有生成完该匿名内部类，然后就是用该类的实例，在初始化的时候就会报错
		}
	};

	public static void main(String[] args) {
		Integer isInt = (Integer) m.get("a");
		System.out.println(isInt);
	}

}
