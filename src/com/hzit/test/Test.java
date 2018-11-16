package com.hzit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzit.entity.Classes;
import com.hzit.entity.Student;

public class Test {
	public static void main(String[] args) {
		//此处需要一个student对象
		//开发者手动new出来的对象
//		Student student = new Student();
//		System.out.println(student);
		//IOC 开发者只需要从IOC容器中取出该对象
		//1.加载spring.xml配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		//通过变量名获取对象
//		Student stu = (Student) applicationContext.getBean("stu");
//		System.out.println(stu);
//		Student stu2 = (Student) applicationContext.getBean("stu");
//		System.out.println(stu2);
		//通过运行时类获取对象
//		Student stu2 = (Student) applicationContext.getBean(Student.class);
//		System.out.println(stu2);
//		Student stu3 = (Student) applicationContext.getBean("stu3");
//		System.out.println(stu3);
		
		//级联
//		Student stu = (Student) applicationContext.getBean("stu");
//		System.out.println(stu);
		
//		Student stu = (Student) applicationContext.getBean("stu");
//		System.out.println(stu);
		
		Classes classes = (Classes) applicationContext.getBean("classes");
		System.out.println(classes);
	}
}
