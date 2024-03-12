package com.learning.core.day04;

class NotEligibleException extends Exception {
	public NotEligibleException(String message) {
		super(message);
	}
}

class CricketRating {
	private String playerName;
	private float critic1;
	private float critic2;
	private float critic3;
	private float avgRating;
	private String coins;

	public CricketRating(String playerName, float critic1, float critic2) {
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.calculateAverageRating(critic1, critic2);
	}

	public CricketRating(String playerName, float critic1, float critic2, float critic3) {
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.critic3 = critic3;
		this.calculateAverageRating(critic1, critic2, critic3);
	}

	private void calculateAverageRating(float critic1, float critic2) {
		this.avgRating = (critic1 + critic2) / 2;
		this.calculateCoins1();
	}

	private void calculateAverageRating(float critic1, float critic2, float critic3) {
		this.avgRating = (critic1 + critic2 + critic3) / 3;
		this.calculateCoins1();
	}

	private void calculateCoins1() {
		if (avgRating >= 7) {
			coins = "Gold";
		} else if (avgRating >= 5 && avgRating < 7) {
			coins = "Silver";
		} else if (avgRating >= 2 && avgRating < 5) {
			coins = "Copper";
		} else {
			try {
				throw new NotEligibleException("NotEligible");
			} catch (NotEligibleException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}
	}

	public String calculateCoins() {
		return coins;
	}

	public void display() {
		System.out.println(playerName + " " + avgRating + " " + coins);
	}
}

public class D04P02 {
	public static void main(String[] args) {
		CricketRating player1 = new CricketRating("John", 9.3f, 9.67f, 8.7f);
		player1.display();
		System.out.println("*");
		CricketRating player2 = new CricketRating("Henry", 1.5f, 0f);
		player2.display();
	}
}
