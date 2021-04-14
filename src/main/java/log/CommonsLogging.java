package log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Author zh
 * @Date 2021/1/26 10:07
 * description :
 */
public class CommonsLogging {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(CommonsLogging.class);
        log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
    }
}
