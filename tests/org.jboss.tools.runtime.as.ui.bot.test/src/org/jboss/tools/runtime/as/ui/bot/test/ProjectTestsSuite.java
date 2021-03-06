package org.jboss.tools.runtime.as.ui.bot.test;

import org.jboss.reddeer.junit.runner.RedDeerSuite;
import org.jboss.tools.runtime.as.ui.bot.test.detector.cdk2.DetectCDK2;
import org.jboss.tools.runtime.as.ui.bot.test.detector.seam.seam22.CheckSeam22;
import org.jboss.tools.runtime.as.ui.bot.test.detector.seam.seam22.DetectSeam22;
import org.jboss.tools.runtime.as.ui.bot.test.detector.seam.seam23.CheckSeam23;
import org.jboss.tools.runtime.as.ui.bot.test.detector.seam.seam23.DetectSeam23;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.jboss7.DetectJBoss7;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.jboss7.OperateJBoss7;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly10.DetectWildFly10;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly10.OperateWildFly10;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly10web.DetectWildFly10Web;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly10web.OperateWildFly10Web;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly8.DetectWildFly8;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly8.OperateWildFly8;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly81.DetectWildFly81;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly81.OperateWildFly81;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly90.DetectWildFly90;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly90.OperateWildFly90;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly90web.DetectWildFly90Web;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly90web.OperateWildFly90Web;
import org.jboss.tools.runtime.as.ui.bot.test.download.ProjectRuntimeDownload;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Projects tests suite<br/>
 * 
 * Testing Projects runtimes.
 * 
 * @author Petr Suchy
 * @author Radoslav Rabara
 */
@RunWith(RedDeerSuite.class)
@SuiteClasses({
		ProjectRuntimeDownload.class,
		
		DetectCDK2.class,
		
		DetectWildFly10.class,
		OperateWildFly10.class,
		
		DetectWildFly10Web.class,
		OperateWildFly10Web.class,
		
		DetectWildFly90.class,
		OperateWildFly90.class,
		
		DetectWildFly90Web.class,
		OperateWildFly90Web.class,
		
		DetectWildFly81.class,
		OperateWildFly81.class,
		
		DetectWildFly8.class,
		OperateWildFly8.class,
		
		DetectJBoss7.class,
		OperateJBoss7.class,
		
		DetectSeam23.class,
		CheckSeam23.class,
		
		DetectSeam22.class,
		CheckSeam22.class
})
public class ProjectTestsSuite {

}
