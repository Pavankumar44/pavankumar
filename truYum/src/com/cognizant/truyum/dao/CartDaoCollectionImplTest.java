package com.cognizant.truyum.dao;

import com.cognizant.truyum.model.MenuItem;
import java.util.*;
import com.cognizant.truyum.dao.CartEmptyException;


public class CartDaoCollectionImplTest {
	public static void main(String[] args) 
	{
		testAddCartItem();
		testGetAllCartItems();
		testRemoveCartItem();
		
	}
	
	public static void testAddCartItem() {
		
		CartDao cartDao = new CartDaoCollectionImpl();
		cartDao.addCartItem((long) 1,(long) 3);
		
		try {
			ArrayList<MenuItem> cartList = cartDao.getAllCartItems((long) 1);
			System.out.println("Items added successfuly");
			System.out.println(String.format("Name","Price","Active","Date Of Launch","Category","Free Delivery"));
	        
			for(MenuItem item : cartList) {
				System.out.println(String.format(item.getName(),item.getPrice(),item.isActive(),item.getDateOfLaunch(),item.getCategory(),item.isFreeDelivery()));
			}
			
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public static void testGetAllCartItems() {
		 
		 CartDao cartDao = new CartDaoCollectionImpl();
		 
		 try {
			ArrayList<MenuItem> cartItems = cartDao.getAllCartItems((long) 1);
			System.out.println(String.format("Name","Price","Active","Date Of Launch","Category","Free Delivery"));
			 for(MenuItem item:cartItems)
			 {
				 System.out.println(String.format(item.getName(),item.getPrice(),item.isActive(),item.getDateOfLaunch(),item.getCategory(),item.isFreeDelivery()));
			 }
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	 
	 public static void testRemoveCartItem() {
		 
		 CartDao cartDao =new CartDaoCollectionImpl();
		 cartDao.removeCartItem((long) 1,(long) 3);
		  
		 try {
			ArrayList<MenuItem> cartLefts = cartDao.getAllCartItems((long) 1);
			if(cartLefts.isEmpty()) {
				
				throw new CartEmptyException();
				
			}
			else {
				
				   for(MenuItem item:cartLefts) {
					   
					   System.out.println((String.format(item.getName(),item.getPrice(),item.isActive(),item.getDateOfLaunch(),item.getCategory(),item.isFreeDelivery())));
					   
				   }
			}
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
}
