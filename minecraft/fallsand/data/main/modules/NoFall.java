package fallsand.data.main.modules;
import net.minecraft.network.play.client.C03PacketPlayer;

import org.lwjgl.input.Keyboard;

import fallsand.data.main.module.Category;
import fallsand.data.main.module.Module;
import fallsand.data.main.utils.Wrapper;

public class NoFall  extends Module {

	
	public NoFall(){
		super("NoFall", Keyboard.KEY_N, Category.PLAYER);
	}
	
	public void onUpdate() {
		if(!this.getState()) return;
			if(Wrapper.mc.thePlayer.fallDistance > 2F){
				Wrapper.mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
			}
	}

	public void onDisable(){
		Wrapper.mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(false));
	}
}
