package com.cn.dahei.it;

public class BookBuilder extends BaseBuilder {
	BaseProduct bProduct=new BaseProduct();
	/*@Override
	public void builderDisplay(String display) {
		// TODO Auto-generated method stub
			bProduct.setDisplay(display);
	}

	@Override
	protected void builderOs(String Os) {
		// TODO Auto-generated method stub
		bProduct.setOs(Os);
	}

	@Override
	protected void builderBoard(String board) {
		// TODO Auto-generated method stub
		bProduct.setBoard(board);
	}

	@Override
	protected BaseProduct builder() {
		// TODO Auto-generated method stub
		return bProduct;
	}*/

	@Override
	protected BaseBuilder builderDisplay(String display) {
		// TODO Auto-generated method stub
		bProduct.setDisplay(display);
		return this;
	}

	@Override
	protected BaseBuilder builderOs(String Os) {
		// TODO Auto-generated method stub
		bProduct.setOs(Os);
		return this;
	}

	@Override
	protected BaseBuilder builderBoard(String board) {
		// TODO Auto-generated method stub
		bProduct.setBoard(board);
		return this;
	}

	@Override
	protected BaseProduct builder() {
		// TODO Auto-generated method stub
		return bProduct;
	}

}
