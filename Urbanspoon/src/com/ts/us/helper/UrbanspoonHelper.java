package com.ts.us.helper;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;

import com.ts.us.dto.Branch;
import com.ts.us.dto.Cuisine;
import com.ts.us.dto.FeedbackType;
import com.ts.us.dto.Recipe;
import com.ts.us.dto.Restaurant;
import com.ts.us.exception.UrbanspoonException;

public class UrbanspoonHelper {
	private static final String IMAGESLOCATION = "D:\\Trainer Champion\\Urbanspoon\\Workspace\\Urbanspoon\\WebContent\\images";

	public static long getLoggedUserId(HttpServletRequest request) {
	
		return -1;
	}

	public static List<Restaurant> getRestaurants(boolean includeBranches) throws UrbanspoonException {
		return null;
		
	}

	public static List<Branch> getBranches(HttpServletRequest request, boolean includeCuisines)
			throws UrbanspoonException {
				return null;
	
	}

	public static List<Cuisine> getCuisine(boolean includeRecipe) throws UrbanspoonException {
		return null;
	
	}

	public static List<FeedbackType> getFeedbackTypesList() throws UrbanspoonException {
		return null;
		
	}

	public static Branch getBranch(int branchId, boolean includeCuisines) throws UrbanspoonException {
		return null;
		
	}

	public static Restaurant getRestaurant(int restaurantId, boolean includeBranches) throws UrbanspoonException {
		return null;
		
	}

	public static Recipe getRecipe(int recipeId) throws UrbanspoonException {
		return null;
		
	}

	public static List<FileItem> getFileItems(HttpServletRequest request) throws UrbanspoonException {
	
		return null;
	}

	public static boolean addRestaurant(List<FileItem> fileItemsList, HttpServletRequest request,
			HttpServletResponse response) throws UrbanspoonException {

		
		return false;
	}

	public static boolean addBranch(List<FileItem> fileItemsList, HttpServletRequest request,
			HttpServletResponse response) throws UrbanspoonException {
	
		return false;
	}

	public static boolean addRecipeToBranch(List<FileItem> fileItemsList, HttpServletRequest request,
			HttpServletResponse response) throws UrbanspoonException {
		
		return false;
	}

	public static boolean addUser(HttpServletRequest request, HttpServletResponse response) throws UrbanspoonException {
	
		return false;
	}

	public static boolean addBranchFeedback(HttpServletRequest request, HttpServletResponse response)
			throws UrbanspoonException {
	
		return false;
	}

	public static boolean addRecipeFeedback(HttpServletRequest request, HttpServletResponse response)
			throws UrbanspoonException {
		
		return false;
	}

	public static boolean addRecipe(HttpServletRequest request, HttpServletResponse response)
			throws UrbanspoonException {

		return false;
	}

	public static boolean addCuisine(HttpServletRequest request, HttpServletResponse response)
			throws UrbanspoonException {
		
		return false;
	}

	public static boolean storeImage(FileItem fileItem, String imageType, String fileName) throws UrbanspoonException {
		
		return false;
	}

	public static boolean loginAsUser(HttpServletRequest request, HttpServletResponse response)
			throws UrbanspoonException {
	
		return false;
	}

	public static boolean loginAsRestaurantOwner(HttpServletRequest request, HttpServletResponse response)
			throws UrbanspoonException {
		return false;
	}
}
