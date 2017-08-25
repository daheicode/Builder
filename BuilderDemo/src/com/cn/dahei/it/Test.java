package com.cn.dahei.it;

public class Test {
	public static void main(String[] args) {
		//第一种   原始builder
		/*BookBuilder builder=new BookBuilder();
		Director Director=new Director(builder);
		Director.builder("联想", "技嘉", "Window");
		System.out.print("信息："+builder.builder().toString());*/
		//第二种    改进为链式编程
		BaseProduct product=new BookBuilder().builderBoard("联想").builderDisplay("技嘉").builderOs("Window").builder();
		System.out.println("xinxi +"+product.toString());
	}
}
