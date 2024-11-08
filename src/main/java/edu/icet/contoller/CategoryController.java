package edu.icet.contoller;

import edu.icet.dto.Category;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@CrossOrigin
public class CategoryController {

    final CategoryService categoryService;

    @PostMapping("/save-category")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
    }

    @PutMapping("/update-category")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
    }

    @GetMapping("/view-all-categories")
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @DeleteMapping("/delete-category-by-id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteCategory(@PathVariable Integer id) {
        return categoryService.deleteCategoryById(id);
    }

    @GetMapping("/get-category-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category getCategoryById(@PathVariable Integer id) {
        return categoryService.getCategoryById(id);
    }
}
