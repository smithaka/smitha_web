package com.main;

import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filecopy {
	 public static void main(String args[]) {
	        FileReader fr = null;
	        FileWriter fw = null;
	        try {
	            fr = new FileReader("C:/Users/surekha/javatest/test.txt");
	            fw = new FileWriter("C:/Users/surekha/javatest/test2.txt");
	            int c = fr.read();
	            while(c!=-1) {
	                fw.write(c);
	                c = fr.read();
	            }
	        } catch(IOException e) {
	            e.printStackTrace();
	        } finally {
	            close(fr);
	            close(fw);
	        }
	    }
	    public static void close(Closeable stream) {
	        try {
	            if (stream != null) {
	                stream.close();
	            }
	        } catch(IOException e) {
	            	        }
	    }
	}

