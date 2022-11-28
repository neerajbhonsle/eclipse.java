package com.xworkz.Runners;

import com.xworkz.bridge.rules.Cricket;
import com.xworkz.connect.Players;

public class CricketRunner {

	public static void main(String[] args) {
		Cricket bat = new Players();
		bat.noOfPlayers();
		bat.umpire();
		bat.over();
		bat.overThrow();
		bat.time();
		System.out.println("-------------------------------------------------------------------------------------");
		Players ball = new Players();
		ball.noOfPlayers();
		ball.umpire();
		ball.over();
		ball.overThrow();
		ball.time();

	}

}
