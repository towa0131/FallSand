package fallsand.data.main.modules;

import org.lwjgl.input.Keyboard;

import fallsand.data.main.module.Category;
import fallsand.data.main.module.Module;

public class SpeedFly  extends Module {

	public SpeedFly(){
		super("SpeedFly", Keyboard.KEY_L, Category.PLAYER);
	}
	
	public void onUpdate() {
		if(!this.getState()) return;
		mc.thePlayer.capabilities.isFlying = true;
		mc.thePlayer.capabilities.setFlySpeed(0.3F);
	}

	public void onDisable(){
		mc.thePlayer.capabilities.isFlying = false;
		mc.thePlayer.capabilities.setFlySpeed(0.05F);
	}
}
