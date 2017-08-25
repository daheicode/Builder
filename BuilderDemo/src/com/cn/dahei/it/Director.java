package com.cn.dahei.it;

public class Director {
	private BaseBuilder builder;
	public Director(BaseBuilder builder){
		this.builder=builder;
	}
	public void builder(String board,String display,String Os){
		builder.builderBoard(board);
		builder.builderDisplay(display);
		builder.builderOs(Os);
		builder.builder();
	}
}
