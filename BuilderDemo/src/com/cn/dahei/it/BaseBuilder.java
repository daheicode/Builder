package com.cn.dahei.it;
/*
 * ����builder��Ӧ���ǳ���product
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
	//�Ľ����builder
	protected abstract BaseBuilder builderDisplay(String display);
	protected abstract BaseBuilder builderOs(String Os);
	protected abstract BaseBuilder builderBoard(String board);
	protected abstract BaseProduct builder();

}
