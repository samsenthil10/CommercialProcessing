package com.bridgelabz.commercialprocessing;

import com.bridgelabz.stockaccountmanagement.StockPortfolio;

public class StockAccount {

	private String name;     
	private double balance;          
	private StockPortfolio list;
	
	
	public StockAccount(String name,double balance) {
		this.name=name;
		this.balance=balance;
	}
	
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public StockPortfolio getList() {
		return list;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setList(StockPortfolio list) {
		this.list = list;
	}
}
