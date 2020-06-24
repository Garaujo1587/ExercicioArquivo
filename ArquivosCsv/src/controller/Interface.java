package controller;

import java.io.IOException;

public interface Interface {
 
	public void creatFile(String path, String nome) throws IOException;
	public void creatCsv(String text) throws IOException;
	public String readFile(String path, String nome) throws IOException;
	public void openFile(String path, String nome) throws IOException;
	
}