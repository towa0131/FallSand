package fallsand.data.main.modules;

import org.lwjgl.input.Keyboard;

import fallsand.data.main.module.Category;
import fallsand.data.main.module.Module;
import fallsand.data.main.utils.Wrapper;

public class FastPlace extends Module{
		public FastPlace() {
			super("FastPlace", Keyboard.KEY_P, Category.PLAYER);
		}

		public void onUpdate() {
			if (this.getState()) {
				Wrapper.mc.rightClickDelayTimer = 0;
			}
		}

		public void onDisable() {
			Wrapper.mc.rightClickDelayTimer = 6;
		}
	}
