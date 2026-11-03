package com.example.beta173.gui;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ModGui extends Screen {
    protected ModGui() {
        super(Component.literal("Beta 1.7.3 Mod"));
    }

    @Override
    protected void init() {
        super.init();
        // Initialize GUI components here
    }

    @Override
    public void render(net.minecraft.client.gui.GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        super.render(guiGraphics, mouseX, mouseY, delta);
        // Render GUI components here
    }
}