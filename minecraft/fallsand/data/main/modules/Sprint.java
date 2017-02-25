package fallsand.data.main.modules;

import org.lwjgl.input.Keyboard;

import fallsand.data.main.module.Category;
import fallsand.data.main.module.Module;
import fallsand.data.main.utils.Wrapper;

public class Sprint extends Module {

	public Sprint() {
		super("Sprint", Keyboard.KEY_R, Category.PLAYER);
	}

	public void onUpdate() {
		if(!this.getState()) return;
		if (!(Wrapper.mc.thePlayer.isCollidedHorizontally) && Wrapper.mc.thePlayer.moveForward > 0.0f) {
			Wrapper.mc.thePlayer.setSprinting(true);
		}else{
			Wrapper.mc.thePlayer.setSprinting(false);
		}
	}
}
