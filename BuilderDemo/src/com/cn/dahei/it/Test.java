package com.cn.dahei.it;

public class Test {
	public static void main(String[] args) {
		//��һ��   ԭʼbuilder
		/*BookBuilder builder=new BookBuilder();
		Director Director=new Director(builder);
		Director.builder("����", "����", "Window");
		System.out.print("��Ϣ��"+builder.builder().toString());*/
		//�ڶ���    �Ľ�Ϊ��ʽ���
		BaseProduct product=new BookBuilder().builderBoard("����").builderDisplay("����").builderOs("Window").builder();
		System.out.println("xinxi +"+product.toString());
	}
}
