package testcase.UP_China.Android.V33.duanXianJuJi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fwk.UP_Android;


public class test_V33_12_liezhuangshoudongshuaxin {
	private UP_Android up;

	@BeforeClass
	public void setUp() {

		up = new UP_Android();
		up.log("开始测试：数据手动刷新");
		up.openApp();
	}

	/**
	 * 测试名称：12 数据手动刷新 
	 * [前提条件]： 
	 * [测试步骤]： 
	 * 1、进入【选股】->【股票池】->【猎庄狙击】 
	 * 2、在有庄操作界面下拉刷新
	 * 
	 * [预期结果]： 
	 * 1、数据较刷新前有变化
	 */
	@Test
	public void testLiezhuangshoudongshuaxin() {

		up.goHomePage();
		up.verifyIsShown("选股");
		up.clickOn("选股");
		up.verifyIsShown("短线狙击");
		up.clickOn("短线狙击");
		up.verifyIsShown("猎庄狙击");
		up.clickOn("猎庄狙击");
		up.swipe(5, 4, 5, 9, 5000);
	}

	@AfterClass
	public void tearDown() {

		up.close();
	}
}
