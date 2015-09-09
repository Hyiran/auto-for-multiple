package testcase.UP_China.Android.P2.bohaijiaoyi.jiaoyi.maichuzhuanrang.zhuangrangfeiyijianxiadan.weituojiemianzhuanrang;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fwk.UP_Android;

public class test_P2_12_weichengsuoyouchaweituoWT {

	private UP_Android up;

	@BeforeClass
	public void setUp() {

		up = new UP_Android();
		up.log("开始测试：全部未成交-平所有-查委托");
		up.openApp();

	}

	/**
	 * 测试名称：12 全部未成交-平所有-查委托
	 * [前提条件]：
	 * 1、在交易时间内
	 * 2、资金充足
	 * 3、所转让的品种有买订类型的仓单；
	 * [测试步骤]：
	 * 1、选择委托类型为转让
	 * 2、在委托价格编辑框输入可以委托成功但不能立马成交的委托价格（如高于对手价的价格）
	 * 3、在委托数量编辑框输买可转数量
	 * 4、点击卖出按钮
	 * 5、点击委托确认对话框的确认按钮
	 * 6、点击委托成功对话框的确定按钮
	 * [预期结果]：
	 * 1、界面跳转到查询界面；
	 * 2、查询界面默认停留在查委托栏；
	 * 3、查委托最新一条显示进入查询前所下的那一单的信息；
	 * 4、类型字段显示卖出转让，数量字段为委托数量（买可转数量），价格显示委托价格，状态显示已委托，剩余为委托数量；
	 * 5、委托时间显示下单时间；
	 */
	@Test
	public void testWeichengsuoyouchaweituoWT() {

		up.goHomePage();
	}

	@AfterClass
	public void tearDown() {

		up.close();
	}

}