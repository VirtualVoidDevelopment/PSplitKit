package com.soulsplit.core;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

/**
 * 
 * @author Yannick
 *
 */
public class Data {
	
	public static boolean DOWNLOAD_FILES = false;
	//Misc
	public static File ROOT = FileSystemView.getFileSystemView().getRoots()[0]; //desktop
	
	//Version
	public static String APP_NAME = "SplitKit";
	public static String CODENAME = "Alpha";
	public static int MAJOR_VERSION = 1;
	public static int MINOR_VERSION = 14;
	
	//Files
	public static File dir = new File("C:/" + APP_NAME); //Creates at root of computer at all OS.
	public static File res = new File("C:/" + APP_NAME + "/resources");
	public static String VERSION_URL = "https://dl.dropbox.com/s/fnalrn16h651drj/version.txt";
	public static File ini = new File("C:/" + APP_NAME + "/settings.ini");
	
}
