package testcase.UP_Metal.Android.P1.HangQing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fwk.UPMetal_Android;

public class test_P1_04_guojihangqing {

	private UPMetal_Android up;

	@BeforeClass
	public void setUP() {

		up = new UPMetal_Android();
		up.log("开始测试：点击行情列表进入关联品种分析页");
		up.openApp();
	}

	/**
	 * 测试名称：04 点击行情列表进入关联品种分析页
	 * [测试步骤]：
	 * 1、打开app默认进入【行情】页
	 * 2、页面中部，点击【国际黄金】栏目进入市场行情页
	 * 3、点击任意品种行
	 * 
	 * 
	 * [预期结果]：
	 * 1、页面跳转到关联品种分析页面
	 */
	@Test
	public void testQuanburuko() {

		up.goHomePage();
		up.verifyIsShown("标题");
		up.swipe(9,3.5,5, 3.5,3000);
		up.verifyIsShown("国际黄金");
		up.clickOn("国际黄金");

		up.verifyIsShown("品种名称");
		up.clickOn("品种名称");
		
		up.clickOn("操作提示");
		up.verifyIsShown("名称");
	}

	@AfterClass
	public void tearDown() {

		up.close();
	}
}
