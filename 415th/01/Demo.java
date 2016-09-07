
//将类放置到一个包当中,需要使用package 包名
//编译时需要使用-d参数，该参数的作用是依照包名生成相应的文件夹
//一个类的全名应该是包名+.+类名
//mars.Demo

/* 包名的命名规范
 * 1. 要求包名所有的字母都要小写
 * 2. 包名一般情况下，是你的域名倒过来写;
 * 
 */
package org.marsdroid;

class Demo {
	public static void main(String[] args){
		System.out.println("hello world!!");
	}

	
}


