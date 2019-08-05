package or.kr.connect;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slf4Logger {

	Logger log = LoggerFactory.getLogger(slf4Logger.class);

	@Test
	public void someMethod() {
		log.info("Hello world");
	}
}
