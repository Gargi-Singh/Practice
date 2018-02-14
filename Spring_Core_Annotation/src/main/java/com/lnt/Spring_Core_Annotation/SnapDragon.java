package com.lnt.Spring_Core_Annotation;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public String process() {
		return "SnapDragon";

	}

}
