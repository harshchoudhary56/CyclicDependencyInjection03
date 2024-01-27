package in.ineuron.test;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import in.ineuron.comp.A;
import in.ineuron.comp.B;

public class TestApp {

	public static void main(String[] args) throws IOException {
		
		System.out.println("*******Container starting**********");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("/in/ineuron/cfg/applicationContext.xml");
		System.in.read();
		
		A a = factory.getBean("a1", A.class);
		
		B b = factory.getBean("b1", B.class);
		System.out.println("*******Container stopped***********");

	}

}
