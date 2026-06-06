package slimeygrandiose.consecutivechallenge;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import slimeygrandiose.consecutivechallenge.commands.MlgCommand;
import slimeygrandiose.consecutivechallenge.untils.Log;

public class ConsecutiveChallenge implements ModInitializer {
	public static final String MOD_ID = "consecutivechallenge";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Log.info("Initialising Consecutive Challenge Mod!");
		Log.info("Registering Commands");
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			MlgCommand.register(dispatcher);
		});
	}
}