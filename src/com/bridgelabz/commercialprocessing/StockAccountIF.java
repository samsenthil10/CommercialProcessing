package com.bridgelabz.commercialprocessing;

public interface StockAccountIF {
	
	double valueOf();
	void buy(int amount, String symbol);
	void sell(int amount, String symbol);
	void printReport();
}
