package Utils;

import java.lang.reflect.Constructor;

public class ClassUtil {
	static Class<?> clazz;
	private ClassUtil(){}
	
	
	
	public static Object method(Object obj,String method,Class<?>... classes){
		try {
			clazz = Class.forName(ReadProperties.ClassBytype);
			Constructor<?> construcor = clazz.getConstructor();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e){
			e.printStackTrace();
		} catch (SecurityException e){
			e.printStackTrace();
		}
		return new Object();
	}
}
