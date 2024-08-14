package com.tistory.beingb.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
	}

	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}

	@Override
	public void onLoad() {
		getLogger().info("onLoad has been invoked!");
	}
}
