package edu.icet.controller;

import edu.icet.dto.SubCategory;
import edu.icet.service.SubCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subcategory")
@RequiredArgsConstructor
@CrossOrigin
public class SubCategoryController {

    final SubCategoryService subCategoryService;

    @PostMapping("/save-subcategory")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSubCategory(@RequestBody SubCategory subCategory) {
        subCategoryService.saveSubCategory(subCategory);
    }

    @PutMapping("/update-subcategory")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateSubCategory(@RequestBody SubCategory subCategory) {
        subCategoryService.updateSubCategory(subCategory);
    }

    @GetMapping("/view-all-subcategories")
    @ResponseStatus(HttpStatus.OK)
    public List<SubCategory> getAllSubCategories() {
        return subCategoryService.getAllSubCategories();
    }

    @GetMapping("/get-subcategory-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public SubCategory getSubCategoryById(@PathVariable Integer id) {
        return subCategoryService.getSubCategoryById(id);
    }

    @DeleteMapping("/delete-subcategory/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteSubCategory(@PathVariable Integer id) {
        return subCategoryService.deleteSubCategoryById(id);
    }
}
