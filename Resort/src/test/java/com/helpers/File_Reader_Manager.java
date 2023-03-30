package com.helpers;

public class File_Reader_Manager {
    private File_Reader_Manager() {
		
	}
    public static File_Reader_Manager getInstance () {
		File_Reader_Manager f = new File_Reader_Manager();
		return f;
	}
    public static Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader c = new Configuration_Reader();
        return c;
	}
}
