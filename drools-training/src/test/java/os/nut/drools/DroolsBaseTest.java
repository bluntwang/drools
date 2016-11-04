/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */
package os.nut.drools;

import com.dtdream.commons.test.SimpleTest;
import com.dtdream.commons.test.TestContainer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wzy on 2016/10/24.
 */
@SpringBootTest(classes = {DroolsBaseTest.class})
@ComponentScan(basePackages = {
		"os.nut",
		"os.nut.drools"
})
public class DroolsBaseTest extends TestContainer {
	@Override
	protected SimpleTest[] getTests() {
		return new SimpleTest[]{new OrderTest()};
	}

//	protected KieServices kieServices;
//	public KieContainer kieContainer;
//
//	@Before
//	public void setUp() {
//		kieServices = KieServices.Factory.get();
//		kieContainer = kieServices.getKieClasspathContainer();
//	}

}
