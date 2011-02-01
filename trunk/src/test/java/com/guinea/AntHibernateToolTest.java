/*
 * Created on 13-Feb-2005
 *
 */
package com.guinea;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author max
 *
 */
public class AntHibernateToolTest extends BuildFileTestCase {

	private String property;
	
	public AntHibernateToolTest(String name) {
		super(name);
	}
	
	protected void tearDown() throws Exception {
		System.out.println(getLog());
		super.tearDown();
	}
	protected void setUp() throws Exception {
		super.setUp();
		configureProject("bin/hibernate/build.xml");
	}
	
	public void testHbm2DDLLogic() {
		executeTarget("ddl");
	}

	public static Test suite() {
		return new TestSuite(AntHibernateToolTest.class);
	}

	
}
