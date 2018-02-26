package com.ts.us.dao;

import java.util.List;

import com.ts.us.dto.Branch;
import com.ts.us.exception.UrbanspoonException;

public class BranchDAO {

	public boolean addImage(long branchId, String fileName) throws UrbanspoonException {

	
		return false;
	}

	public Branch insert(long restaurantId, Branch branch) throws UrbanspoonException {

		
		return branch;
	}

	public List<Branch> getBranches(long restaurantId, boolean includeCuisines,boolean includeFeedbacks) throws UrbanspoonException {

	
		return null;
	}

	public Branch getBranch(int branchId, boolean includeCuisines) throws UrbanspoonException {
	
		return null;
	}

	public List<String> getBranchImages(int branchId) throws UrbanspoonException {
		return null;
	
		
	}

}
