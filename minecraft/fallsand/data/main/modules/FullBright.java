package fallsand.data.main.modules;

import org.lwjgl.input.Keyboard;

import fallsand.data.main.module.Category;
import fallsand.data.main.module.Module;
import fallsand.data.main.utils.Wrapper;

public class FullBright extends Module{

	public FullBright(){
		super("FullBright", Keyboard.KEY_V, Category.WORLD);
	}

	public void onUpdate() {
		if(this.getState()){
			Wrapper.mc.gameSettings.gammaSetting = 10f;
		}else{
			Wrapper.mc.gameSettings.gammaSetting = 1f;
		}
	}
}
