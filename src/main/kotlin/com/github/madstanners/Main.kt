package com.github.madstanners

fun main(args: Array<String>) {
    println("Heat Signatures")

    val state   = GameState();
    val drawer  = GameDrawer();

    state.init();
    drawer.init();

    try {
        while (!state.update()) {
            drawer.draw(state);
        }
        println("GameState:update returned false. Quitting.")
    } catch (e: Exception) {
        e.printStackTrace();
    } finally {
        state.cleanup();
        drawer.cleanup();

        println("Exiting...")
    }

}
