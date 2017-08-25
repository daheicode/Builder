package com.cn.dahei.it;
/*
 * 抽象builder对应的是抽象product
 */
public abstract class BaseBuilder {
//	protected BaseProduct bProduct;
	{
//		bProduct=new BaseProduct();
	}
	/*protected abstract void builderDisplay(String display);
	protected abstract void builderOs(String Os);
	protected abstract void builderBoard(String board);
	protected abstract BaseProduct builder();*/
	//改进后的builder
	protected abstract BaseBuilder builderDisplay(String display);
	protected abstract BaseBuilder builderOs(String Os);
	protected abstract BaseBuilder builderBoard(String board);
	protected abstract BaseProduct builder();

}
