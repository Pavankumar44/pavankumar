package com.cognizant.truyum.dao;

import java.util.HashMap;

import com.cognizant.truyum.model.Cart;

public class CartDaoCollectionImpl implements CartDao {
	
	private static HashMap<Long, Cart> userCarts;
	
	 CartDaoCollectionImpl(){
		 super();
		 
	 }
    
	 public void addCartItem(long userId,long menuItemId);
}
