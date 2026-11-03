package com.example.beta173.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

public class ModCommands {
    public static void registerCommands(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("beta173")
            .then(Commands.literal("config")
                .executes(context -> {
                    // Handle config command
                    return 1;
                }))
            .then(Commands.literal("help")
                .executes(context -> {
                    // Handle help command
                    return 1;
                })));
    }
}