package com.lnt.Spring_Core_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mySamsung")
public class Samsung {

	@Autowired
	@Qualifier("snapDragon")
	MobileProcessor processor;
	@Override
	public String toString() {
		return "Samsung uses "+  processor.process() +" to process data ";
	}

	
}
