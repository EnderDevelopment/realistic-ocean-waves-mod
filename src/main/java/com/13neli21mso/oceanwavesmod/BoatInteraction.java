package com.13neli21mso.oceanwavesmod;

import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class BoatInteraction {
    public static void interactWithWaves(Boat boat, Level level, BlockPos pos) {
        // Check if the boat is in water
        if (level.getBlockState(pos).getBlock() == Blocks.WATER) {
            // Get the wave height at the boat's position
            float waveHeight = OceanWaves.getWaveHeight(level, pos);
            
            // Apply wave effects to the boat based on the wave height
            if (waveHeight > 0) {
                // Calculate the vertical movement based on the wave height
                double verticalMovement = waveHeight * 0.1;
                
                // Apply the vertical movement to the boat
                boat.setDeltaMovement(boat.getDeltaMovement().add(0, verticalMovement, 0));
            }
        }
    }

    public static boolean isWave(Level level, BlockPos pos) {
        // Check if the block is a wave
        // This is a simplified example; actual wave detection would be more complex
        return level.getBlockState(pos).getBlock() == Blocks.WATER;
    }
}