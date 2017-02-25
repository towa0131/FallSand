package fallsand.data.main.module;

import java.util.ArrayList;

import fallsand.data.main.modules.FastPlace;
import fallsand.data.main.modules.Fly;
import fallsand.data.main.modules.FullBright;
import fallsand.data.main.modules.KillAura;
import fallsand.data.main.modules.NoFall;
import fallsand.data.main.modules.Speed;
import fallsand.data.main.modules.SpeedFly;
import fallsand.data.main.modules.Sprint;

public class ModuleManager {

public static ArrayList<Module> activeModules = new ArrayList<Module>();

public ModuleManager(){
	this.activeModules.add(new Sprint());
	this.activeModules.add(new Fly());
	this.activeModules.add(new FullBright());
	this.activeModules.add(new FastPlace());
	this.activeModules.add(new SpeedFly());
	this.activeModules.add(new NoFall());
	this.activeModules.add(new Speed());
	this.activeModules.add(new KillAura());
}


}
