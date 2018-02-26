package com.ts.us.dao;

import java.util.List;

import com.ts.us.dto.Restaurant;
import com.ts.us.exception.UrbanspoonException;

public class RestaurantDAO {

	public List<Restaurant> getRestaurants(boolean includeBranches) throws UrbanspoonException {
		return null;

	
	}

	public Restaurant getRestaurant(int restaurantId, boolean includeBranches) throws UrbanspoonException {
		return null;
		
	}

	public Restaurant insert(Restaurant restaurant) throws UrbanspoonException {
		return restaurant;
		
	}

	public Restaurant getRestaurant(String govtRegistrationId, boolean includeBranches) throws UrbanspoonException {
		return null;
		
		
	}

	public boolean updateLogoAddress(long restaurantId, String fileName) throws UrbanspoonException {
		
		return false;
	}

}
