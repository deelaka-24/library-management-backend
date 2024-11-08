package edu.icet.contoller;

import edu.icet.dto.Author;
import edu.icet.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
@CrossOrigin
public class AuthorController {

    final AuthorService authorService;

    @PostMapping("/save-author")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAuthor(@RequestBody Author author){
        authorService.saveAuthor(author);
    }

    @PutMapping("/update-author")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAuthor(@RequestBody Author author){
        authorService.saveAuthor(author);
    }

    @GetMapping("/view-all-authors")
    @ResponseStatus(HttpStatus.OK)
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @DeleteMapping("/delete-author-by-id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteAuthor(@PathVariable Integer id) {
        return authorService.deleteAuthorById(id);
    }

    @GetMapping("/get-author-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Author getAuthorById(@PathVariable Integer id) {
        return authorService.getAuthorById(id);
    }
}
