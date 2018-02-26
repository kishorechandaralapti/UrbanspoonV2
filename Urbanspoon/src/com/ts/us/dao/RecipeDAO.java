package com.ts.us.dao;

import java.util.List;

import com.ts.us.dto.Recipe;
import com.ts.us.exception.UrbanspoonException;

public class RecipeDAO {

	public Recipe insert(int cuisineId, Recipe recipe) throws UrbanspoonException {
		return recipe;

	}

	public List<Recipe> getRecipes() throws UrbanspoonException {
		return null;

	
	}

	public List<Recipe> getRecipes(int cuisineId) throws UrbanspoonException {
		return null;

	
	}

	public Recipe getRecipe(int recipeId) throws UrbanspoonException {
		return null;

	
	}

	public List<Recipe> getRecipes(int cuisineId, int branchId) throws UrbanspoonException {
		return null;

		
	}

	public boolean addRecipeToBranch(long recipeId, long branchId, float price, String imagePath) {
		return false;
	}

}
