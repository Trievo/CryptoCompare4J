package me.joshmcfarlin.cryptocompareapi.models.market;

import com.google.gson.annotations.SerializedName;
import me.joshmcfarlin.cryptocompareapi.Market;

/**
 * Represents a cryptocurrency
 */
public class Coin {
	/**
	 * The symbol of the coin
	 */
	@SerializedName("SYMBOL")
	private String symbol;

	/**
	 * Total supply of the coin
	 */
	@SerializedName("SUPPLY")
	private double supply;

	/**
	 * The full name of the coin
	 */
	@SerializedName("FULLNAME")
	private String fullName;

	/**
	 * The name of the coin
	 */
	@SerializedName("NAME")
	private String name;

	/**
	 * The ID of the coin on CryptoCompare's website
	 */
	@SerializedName("ID")
	private int id;

	/**
	 * The 24 hour volume to
	 */
	@SerializedName("VOLUME24HOURTO")
	private double volume24HourTo;

	@Override
	public String toString() {
		return String.format("%s - %f", fullName, volume24HourTo);
	}

	/**
	 * {@link Market.Coin#symbol}
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * {@link Market.Coin#supply}
	 */
	public double getSupply() {
		return supply;
	}

	/**
	 * {@link Market.Coin#fullName}
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * {@link Market.Coin#name}
	 */
	public String getName() {
		return name;
	}

	/**
	 * {@link Market.Coin#id}
	 */
	public int getId() {
		return id;
	}

	/**
	 * {@link Market.Coin#volume24HourTo}
	 */
	public double getVolume24HourTo() {
		return volume24HourTo;
	}
}
