package com.jxksfr.handfov.client;

import net.fabricmc.api.ClientModInitializer;

public class HandFOVClient implements ClientModInitializer {
    // Cambia este número: menor = mano más grande/cerca, mayor = más pequeña/lejos
    public static final float HAND_FOV = 129.0f;

    @Override
    public void onInitializeClient() {}
}
