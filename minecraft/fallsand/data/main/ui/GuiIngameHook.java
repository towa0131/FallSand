package fallsand.data.main.ui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import fallsand.data.main.FallSand;
import fallsand.data.main.module.Module;
import fallsand.data.main.utils.Wrapper;

public class GuiIngameHook extends GuiIngame{

	public GuiIngameHook(Minecraft mcIn){
		super(mcIn);
	}

	public void func_175180_a(float p_175180_1_){
		super.func_175180_a(p_175180_1_);

		Wrapper.fr.drawString("§e§l" + FallSand.Client_Name + "§c§lClient §b§lVersion: " + FallSand.Client_Version, 1, 1, 0xffffffff);
		Wrapper.fr.drawString("§a§lMineCraftVersion: 1.8", 1, 10, 0xffffffff);
		renderArrayList();
	}

	private void renderArrayList(){
		int YCount = 10;
		for(Module m : FallSand.getFallSand.modulemanager.activeModules){
			m.onRender();
			if(m.getState()){
				YCount = YCount + 10;
				Wrapper.fr.drawString(m.getName(), 1, YCount, 0xffffffff);
			}
		}

	}

}
