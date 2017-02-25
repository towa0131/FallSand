package fallsand.data.main.modules;

import org.lwjgl.input.Keyboard;

import fallsand.data.main.module.Category;
import fallsand.data.main.module.Module;

public class Fly  extends Module {

	public Fly(){
		super("Fly", Keyboard.KEY_F, Category.PLAYER);
	}
	
	public void onUpdate() {
		if(!this.getState()) return;
		mc.thePlayer.capabilities.isFlying = true;
	}

	public void onDisable(){
		mc.thePlayer.capabilities.isFlying = false;
	}
}
