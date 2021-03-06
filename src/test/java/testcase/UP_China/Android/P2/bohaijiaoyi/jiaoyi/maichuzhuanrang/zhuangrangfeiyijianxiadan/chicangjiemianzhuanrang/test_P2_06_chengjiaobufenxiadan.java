package testcase.UP_China.Android.P2.bohaijiaoyi.jiaoyi.maichuzhuanrang.zhuangrangfeiyijianxiadan.chicangjiemianzhuanrang;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fwk.UP_Android;

public class test_P2_06_chengjiaobufenxiadan {

	private UP_Android up;

	@BeforeClass
	public void setUp() {

		up = new UP_Android();
		up.log("开始测试：全部可成交-平部分-下单确认");
		up.openApp();

	}

	/**
	 * 测试名称：06 全部可成交-平部分-下单确认
	 * [前提条件]：
	 * 1、在交易时间内下单；
	 * 2、资金充足
	 * 3、所转让的品种有买订类型的仓单；
	 * [测试步骤]：
	 * 1、点击某品种的买订仓单的平仓按钮
	 * 2、在委托价格编辑框输入可以立马成交的委托价格（如对手价）
	 * 3、在委托数量编辑框输入入大于零小于买可转数量的值
	 * 4、点击卖出按钮
	 * [预期结果]：；
	 * 1、弹出委托确认对话框；
	 * 2、委托确认对话框标题显示委托确认
	 * 3、委托确认对话框正文一次显示商品、方向，数量、价格字段；
	 * 4、商品字段显示商品名称，方向显示卖出转让，数量字段委托数量，价格为委托价格；
	 * 5、对话框底部显示确定按钮和取消按钮
	 */
	@Test(dependsOnGroups = "Bohai time")
	public void testChengjiaobufenxiadan() {

		up.goHomePage();
	}

	@AfterClass
	public void tearDown() {

		up.close();
	}

}
