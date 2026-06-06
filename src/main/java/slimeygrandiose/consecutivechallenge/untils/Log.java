package slimeygrandiose.consecutivechallenge.untils;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import slimeygrandiose.consecutivechallenge.ConsecutiveChallenge;

public class Log {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(ConsecutiveChallenge.MOD_ID);

    public static void info(String msg) {
        LOGGER.info(msg);
    }

    public static void warn(String msg) {
        LOGGER.warn(msg);
    }

    public static void error(String msg) {
        LOGGER.error(msg);
    }

    public static void debug(String msg) {
        LOGGER.info("[DEBUG] " + msg);
    }
}
