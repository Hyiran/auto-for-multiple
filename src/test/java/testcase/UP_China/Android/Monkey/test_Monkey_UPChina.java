package testcase.UP_China.Android.Monkey;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import fwk.UP_Android;

public class test_Monkey_UPChina {

	private UP_Android up;

	@BeforeClass
	public void setUp() {

		up = new UP_Android();

	}

	/**
	 * 测试名称：Monkey随机事件测试
	 */
	@Test
	public void test010Navigation() {

		up.log(">========================<");
		up.log("开始测试：Monkey随机事件测试");
		up.monkeyTest(50000);
	}
}
