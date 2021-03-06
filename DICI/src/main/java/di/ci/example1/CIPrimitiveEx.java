package di.ci.example1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class CIPrimitiveEx {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationcontext.xml");
		BeanFactory bean = new XmlBeanFactory(resource);
		
		Employee e1 = (Employee)bean.getBean("e1");
		e1.show();
		
		Employee e2 = (Employee)bean.getBean("e2");
		e2.show();
	}
}