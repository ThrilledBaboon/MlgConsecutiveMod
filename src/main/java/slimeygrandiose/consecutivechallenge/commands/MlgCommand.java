package slimeygrandiose.consecutivechallenge.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import slimeygrandiose.consecutivechallenge.untils.ChatFeedback;
import slimeygrandiose.consecutivechallenge.untils.Log;

public class MlgCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher){
        dispatcher.register(
                CommandManager.literal("mlg")
                        .executes(MlgCommand::attempt)
        );
    }

    private static int attempt(CommandContext<ServerCommandSource> context) {
        // this just checks that doing the /mlg will start an attempt
        ServerPlayerEntity player;
        ServerWorld world;

        try {
            player = context.getSource().getPlayer();
            world = context.getSource().getWorld();

        } catch (Exception e) {
            Log.error("Failed to retrieve player or world: " + e.getMessage());
            return 0;
        }
        assert player != null;
        java.lang.String msg = "MLG attempt requested by "
                + player.getName().getString();
        ChatFeedback.info(player, msg);
        Log.info(msg);
        return 0;
    }
}
