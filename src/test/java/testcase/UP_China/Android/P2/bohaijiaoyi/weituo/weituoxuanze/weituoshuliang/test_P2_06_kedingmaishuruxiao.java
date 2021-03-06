package testcase.UP_China.Android.P2.bohaijiaoyi.weituo.weituoxuanze.weituoshuliang;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fwk.UP_Android;

public class test_P2_06_kedingmaishuruxiao {

	private UP_Android up;

	@BeforeClass
	public void setUp() {

		up = new UP_Android();
		up.log("开始测试：可订买可订卖数量变大-输入较小价格");
		up.openApp();

	}

	/**
	 * 测试名称：06 可订买可订卖数量变大-输入较小价格
	 * [前提条件]：
	 * 1、界面处于复位状态
	 * [测试步骤]：
	 * 1、在价格编辑框手动输入位于涨停和跌停之间，且比对手价格小3%左右的价格
	 * 2、查看可订买可订卖数值变化
	 * [预期结果]：
	 * 1、可订买和可订卖的值变为一致；
	 * 2、可订买和可订卖的数值统一变大；
	 */
	@Test
	public void testKedingmaishuruxiao() {

		up.goHomePage();
	}

	@AfterClass
	public void tearDown() {

		up.close();
	}

}
