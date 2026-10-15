package com.13neli21mso.oceanwavesmod;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class MultiplayerSupport {
    public static void syncWaves(ServerPlayer player, Level level, BlockPos pos) {
        // Sync wave data with the player
        // This is a simplified example; actual synchronization would be more complex
        if (OceanWaves.isWave(level, pos)) {
            // Send wave data to the player
            // This would involve creating and sending a custom packet
        }
    }

    public static void syncBoatInteraction(ServerPlayer player, Boat boat) {
        // Sync boat interaction data with the player
        // This is a simplified example; actual synchronization would be more complex
        // Send boat interaction data to the player
        // This would involve creating and sending a custom packet
    }
}