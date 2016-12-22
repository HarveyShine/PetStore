package pet.utils;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
	private final static String BEANS_XML = "beans.xml";
	private static BeanFactory factory = null;

	// ��ֹ��������
	private SpringUtils() {
	}

	// ��̬���鴴��Bean����
	static {
		if (factory == null)
			factory = new ClassPathXmlApplicationContext(BEANS_XML);
	}

	// ���Bean����
	public static BeanFactory getBeanFactory() {
		return factory;
	}
}
