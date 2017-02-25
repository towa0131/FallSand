package fallsand.data.main.modules;



import org.lwjgl.input.Keyboard;

import fallsand.data.main.module.Category;
import fallsand.data.main.module.Module;

public class Speed  extends Module {

	public Speed(){
		super("Speed", Keyboard.KEY_COMMA, Category.PLAYER);
	}
	
	public void onUpdate() {
		if(!this.getState()) return;
		if(mc.thePlayer.onGround){
		mc.thePlayer.motionX *= 1.8;
		mc.thePlayer.motionZ *= 1.8;
		double currentSpeed = Math.sqrt(Math.pow(mc.thePlayer.motionX, 2)
			+ Math.pow(mc.thePlayer.motionZ, 2));
		double maxSpeed = 0.66F;
		if(currentSpeed > maxSpeed)
		{
			mc.thePlayer.motionX = mc.thePlayer.motionX / currentSpeed * maxSpeed;
			mc.thePlayer.motionZ = mc.thePlayer.motionZ / currentSpeed * maxSpeed;
			}
		}
	}

	public void onDisable(){
	}
}
