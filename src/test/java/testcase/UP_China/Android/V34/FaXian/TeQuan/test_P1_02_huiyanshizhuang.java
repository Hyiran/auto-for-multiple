package testcase.UP_China.Android.V34.FaXian.TeQuan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fwk.UP_Android;

public class test_P1_02_huiyanshizhuang {

	private UP_Android up;

	@BeforeClass
	public void setUp() {

		up = new UP_Android();
		up.log("开始测试：慧眼识庄-交互检查");
		up.openApp();
	}

	/**
	 * 测试名称：02 慧眼识庄-交互检查
	 * [前提条件]：有权限用户登录
	 * [测试步骤]：
	 * 1、｛发现｝－｛L2风云｝，点击慧眼识庄栏目的标题、文案、文案向右箭头
	 * 2、点击慧眼识庄栏目的一项
	 * [预期结果]：
	 * 1、进入｛慧眼识庄｝
	 * 2、进入该股票分时页面
	 */
	@Test
	public void testHuiyanshizhuang() {

		up.goHomePage();
		up.Permissions();
		up.clickOn("我的返回");
		
		up.verifyIsShown("跳转发现");
		up.clickOn("跳转发现");
		up.clickOn("发现导航");
		
		up.swipeUpToElement("L2风云");
		up.clickOn("L2风云");
		
		up.verifyIsShown("慧眼识庄");
		up.clickOn("慧眼识庄");
		
		up.verifyIsShown("详情标题");
		up.clickOn("股票名称1");
		
		up.clickOn("操作提示");
		
		up.verifyIsShown("标题");
		up.verifyIsShown("代码");

	}

	@AfterClass
	public void tearDown() {

		up.close();
	}
}
