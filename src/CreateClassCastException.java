import java.util.HashMap;
import java.util.Map;


public class CreateClassCastException {
	public static Map m = new HashMap() {
		{
			put("a", 3);
		}
	};

	public static void main(String[] args) {
		Integer isInt = (Integer) m.get("a");//由于在匿名内部类中插入的是“2”字符串，不能被强制转为Integer类型，所以报错ClassCastException。
		System.out.println(isInt);
	}

}
