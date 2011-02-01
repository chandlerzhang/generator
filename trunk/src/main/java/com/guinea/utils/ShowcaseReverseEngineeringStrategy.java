package com.guinea.utils;

import org.hibernate.cfg.reveng.ReverseEngineeringStrategy;

public class ShowcaseReverseEngineeringStrategy extends IgnorePrefixReverseEngineeringStrategy {

	public ShowcaseReverseEngineeringStrategy(ReverseEngineeringStrategy delegate) {
		super(delegate);
	}

	protected int getPrefixLength() {
		return 1;
	}
	protected String getClassPrefix() {
		return "";
	}
}
