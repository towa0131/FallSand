package fallsand.data.main.module;

import net.minecraft.client.Minecraft;

public class Module {

	private String name;
	private int bind;
	private Category category;
	private boolean isEnable;
	public static Minecraft mc = Minecraft.getMinecraft();

	public Module(String name,int bind,Category category){
		this.name = name;
		this.bind = bind;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public int getBind() {
		return bind;
	}

	public Category getCategory() {
		return category;
	}

	public boolean getState(){
	return isEnable;
	}

	public void setState(boolean state){
		this.onToggle();
		if(state){
			this.onEnable();
			this.isEnable = true;
		}else{
			this.onDisable();
			this.isEnable = false;
		}
	}

	public void toggleModule(){
		this.setState(!this.getState());
	}

	public void onToggle(){}
	public void onEnable(){}
	public void onDisable(){}
	public void onUpdate(){}
	public void onRender(){}


}
