package slimeygrandiose.consecutivechallenge.untils;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class ChatFeedback {
    public static void info(ServerPlayerEntity player, String msg) {
        player.sendMessage(Text.literal(msg));
    }

    public static void warn(ServerPlayerEntity player, String msg) {
        player.sendMessage(Text.literal(msg));
    }

    public static void error(ServerPlayerEntity player, String msg) {
        player.sendMessage(Text.literal(msg));
    }

    public static void debug(ServerPlayerEntity player, String msg) {
        player.sendMessage(Text.literal("[DEBUG] " +msg));
    }
}
