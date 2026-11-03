package com.example.beta173.events;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.world.InteractionResult;

public class ModEvents {
    public static void registerEvents() {
        ServerLifecycleEvents.SERVER_STARTING.register(server -> {
            // Handle server starting event
        });

        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            // Handle block break event
            return true;
        });

        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            // Handle block use event
            return InteractionResult.PASS;
        });
    }
}