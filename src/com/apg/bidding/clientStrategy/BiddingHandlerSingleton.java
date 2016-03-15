package com.apg.bidding.clientStrategy;

import com.apg.bidding.BiddingHandler;

public class BiddingHandlerSingleton {
	
	private static BiddingHandler singleInstance = null;
	
	private BiddingHandlerSingleton(){}
	
	public static BiddingHandler getInstance(){
		if(singleInstance == null){
			singleInstance = new BiddingHandler();
		}
		return singleInstance;
	}

}
