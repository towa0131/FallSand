package fallsand.data.main;

import org.lwjgl.opengl.Display;

import fallsand.data.main.module.ModuleManager;

public class FallSand {

	public static String Client_Name = "FallSand";
	public static double Client_Version = 1.1;

	public static final FallSand getFallSand = new FallSand();

	public static ModuleManager modulemanager;

	public static void StartClient() {
		modulemanager = new ModuleManager();
		Display.setTitle(Client_Name + "-rel-" + Client_Version);
	}

	public static String getClient_Name() {
		return Client_Name;
	}

	public static void setClient_Name(String client_Name) {
		Client_Name = client_Name;
	}

	public static double getClient_Version() {
		return Client_Version;
	}

	public static void setClient_Version(double client_Version) {
		Client_Version = client_Version;
	}

}
