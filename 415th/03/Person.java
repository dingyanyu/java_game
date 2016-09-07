

/* 如果子类和父类不在同一个包中，则子类无法继承到父类当中的default权限
 * 的成员变量和成员函数
 *
 * 如果子类和父类不在同一个包当中，子类可以继承到父类当中的default权限的成员
 * 变量和成员函数，但是由于权限不够，无法使用
 * protected权限首先拥有和default一样的功能，但是该权限只能修饰成员变量和成员函数
 * public > protected > default > private
 */
package com.marsdroid;

public class Person{
	 public String name;
	 public int age;

	void eat(){
		System.out.println("eat");
	}

	void sleep(){
		System.out.println("sleep");
	}
}


