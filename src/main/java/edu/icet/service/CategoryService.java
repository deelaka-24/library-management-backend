package edu.icet.service;

import edu.icet.dto.Category;

import java.util.List;

public interface CategoryService {
    void saveCategory(Category category);
    List<Category> getAllCategories();
    Category getCategoryById(Integer id);
    Boolean deleteCategoryById(Integer id);
}
