package edu.rpi.cs.csci4963.u22.cheny63.project.drawAndGuess.model;

import java.util.*;
public class Room {
	private LinkedList<User> users;
	private String secret;
	private WordDictionary dictionary;
	public GameStatus gameStatus;
	public Timer timer;
	//grid
	public Room(String filename) {
		users = new LinkedList<User>();
		// grid
		gameStatus = GameStatus.INIT;
		timer = new Timer();
		dictionary = new WordDictionary(filename);
		
		
	}
	public void addNewUser(String n) {
		users.addFirst(new User(n));
	}

	
	
}
