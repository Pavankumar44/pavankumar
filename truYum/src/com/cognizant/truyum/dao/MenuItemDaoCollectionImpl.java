package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoCollectionImpl implements MenuItemDao {
	
	
	private static ArrayList<MenuItem> menuItemList;
	
	MenuItemDaoCollectionImpl() {
		super();
		
	
	}

	
	public ArrayList<MenuItem> getMenuItemListAdmin(){
		
		return menuItemList;

      }
	
	public List<MenuItem> getMenuItemListCustomer();
	
	public void modifyMenuItem(MenuItem menuitem);

}
