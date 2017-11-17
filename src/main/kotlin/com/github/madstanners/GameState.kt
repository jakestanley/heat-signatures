package com.github.madstanners

class GameState {

    private var exit: Boolean = false;

    fun init() {

        println("GameState:init called")
    }

    fun update(): Boolean {

        println("GameState:update called")

        // for testing purposes this method should get called at least once
        var ret = this.exit;
        this.exit = true;

        return ret;
    }

    fun cleanup() {

        println("GameState:cleanup called")
    }

}