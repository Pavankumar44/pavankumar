package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImplTest {
	
	public static void main(String[] args) throws CartEmptyException
	{
		testGetMenuItemListAdmin();
		testGetMenuTtemListCustomer();
        testModifyMenuItem();
	}
	
	public static void testGetMenuItemListAdmin() {
		
		MenuItemDao menuItemDao;
		try {
		menuItemDao = new MenuItemDaoCollectionImpl();
		ArrayList<MenuItem>menuItemList=new ArrayList<MenuItem>();
		menuItemList= menuItemDao.getMenuItemListAdmin();
		System.out.println("Menu item list for admin");
		System.out.println(String.format("Name","Price","Active","Date Of Launch","Category","Free Delivery"));
		for(MenuItem items: menuItemList) {
			
			System.out.println(String.format(items.getName(),items.getPrice(),items.isActive(),items.getDateOfLaunch(),items.getCategory(),items.isFreeDelivery()));
        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void testGetMenuTtemListCustomer() {
		
		MenuItemDao menuItemDao;
		try {

			menuItemDao  = new MenuItemDaoCollectionImpl();

			ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

			menuItems = menuItemDao.getMenuItemListCustomer();

			System.out.println("Menu item list for customer"); 

			System.out.println(String.format("Name","Price","Active","Date Of Launch","Category","Free Delivery"));

			for (MenuItem items : menuItems) {

				System.out.println(String.format(items.getName(),items.getPrice(),items.isActive(),items.getDateOfLaunch(),items.getCategory(),items.isFreeDelivery()));


			}

		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}
	
	public static void testModifyMenuItem() {
		
		
		try {
		MenuItem menuItem = new MenuItem((long) 04, "French Fries", "Starters", (float) 57.0, false, true,
		DateUtil.convertToDate("02/07/2017"));
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		menuItemDao.modifyMenuItem(menuItem);
		if(menuItemDao.getMenuItem(menuItem.getId())==menuItem) {
			
			System.out.println(String.format("Name","Price","Active","Date Of Launch","Category","Free Delivery"));
			
			System.out.println((String.format(menuItem.getName(),menuItem.getPrice(),menuItem.isActive(),menuItem.getDateOfLaunch(),menuItem.getCategory(),menuItem.isFreeDelivery())));
			
			System.out.println("Modification Done");
		}
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}	
	}
	
	

}
