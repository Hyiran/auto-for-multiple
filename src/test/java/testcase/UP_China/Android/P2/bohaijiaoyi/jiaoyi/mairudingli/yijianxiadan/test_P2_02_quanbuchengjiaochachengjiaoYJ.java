package testcase.UP_China.Android.P2.bohaijiaoyi.jiaoyi.mairudingli.yijianxiadan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fwk.UP_Android;

public class test_P2_02_quanbuchengjiaochachengjiaoYJ {

	private UP_Android up;

	@BeforeClass
	public void setUp() {

		up = new UP_Android();
		up.log("开始测试：全部成交-查成交");
		up.openApp();

	}

	/**
	 * 测试名称：02 全部成交-查成交
	 * [前提条件]：
	 * 1、在交易时间内
	 * 2、资金充足
	 * [测试步骤]：
	 * 1、选择委托类型为订立
	 * 2、在委托价格编辑框输入可以立马成交的价格（如对手价）
	 * 3、在委托数量编辑框输入可立马成交的数量（如默认数量）
	 * 4、点击买入按钮
	 * 5、点击委托成功提示对话框上的确定按钮
	 * 6、点击查成交标签
	 * [预期结果]：
	 * 1、查询界面切换到查成交；
	 * 2、本次所下单分一条或多条显示在成交列表中
	 * 3、成交列表中本次所成交的单类型字段显示买入订立，数量显示小于或等于委托数量，但总和等于委托数量,价格显示委托价格，转让盈亏为0.00；
	 * 4、委托时间显示下单时间；
	 */
	@Test
	public void testQuanbuchengjiaochachengjiaoYJ() {

		up.goHomePage();
	}

	@AfterClass
	public void tearDown() {

		up.close();
	}

}
