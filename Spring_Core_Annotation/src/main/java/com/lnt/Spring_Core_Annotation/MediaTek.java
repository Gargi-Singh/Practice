package com.lnt.Spring_Core_Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class MediaTek implements MobileProcessor {

	public String process() {
		return "MediaTek";
	}

}
