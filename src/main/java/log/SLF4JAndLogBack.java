package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author zh
 * @Date 2021/1/26 14:13
 * description :
 */
public class SLF4JAndLogBack {
    static final Logger logger = LoggerFactory.getLogger(SLF4JAndLogBack.class);

    public static void main(String[] args) {
        logger.info("1 + {} = 3", 2);
    }

}
