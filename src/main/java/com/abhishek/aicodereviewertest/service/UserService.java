package com.abhishek.aicodereviewertest.controller;

public class UserService {


	public BaseResponse updateBusinessSubCategory(UpdateBusinessSubCategoryRequest req) {
		BaseResponse response = new BaseResponse();

		Optional<BusinessSubCategory> optionalBusinessSubCategory =
				businessSubCategoryRepo.findById(req.getId());

		if (optionalBusinessSubCategory.isPresent()) {
			BusinessSubCategory businessSubCategory = optionalBusinessSubCategory.get();

			businessSubCategory.setTitle(req.getTitle());
			businessSubCategory.setDescription(req.getDescription());
			businessSubCategory.setCategoryId(req.getCategoryId());
			businessSubCategory.setUpdatedAt(System.currentTimeMillis());

			response.setData(businessSubCategoryRepo.save(businessSubCategory));
			response.setSuccess(true);
		} else {
			response.setNotFoundResponse();
		}
		return response;
	}
}
