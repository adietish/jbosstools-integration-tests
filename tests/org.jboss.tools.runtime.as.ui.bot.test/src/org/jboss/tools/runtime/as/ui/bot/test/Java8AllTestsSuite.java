package org.jboss.tools.runtime.as.ui.bot.test;

import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap63.DetectEAP63;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap63.OperateEAP63;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Tests with Java SE 1.8 requirement
 * 
 * @author Radoslav Rabara
 */
@RunWith(JBTSuite.class)
@Suite.SuiteClasses({
		DetectEAP63.class,
		OperateEAP63.class
})
public class Java8AllTestsSuite {

}
