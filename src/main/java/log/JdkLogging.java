package log;

import java.util.logging.Logger;

/**
 * @Author zh
 * @Date 2021/1/26 10:03
 * description :
 */
public class JdkLogging {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
    }
}
