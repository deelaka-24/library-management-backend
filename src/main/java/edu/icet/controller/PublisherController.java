package edu.icet.controller;

import edu.icet.dto.Publisher;
import edu.icet.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publisher")
@RequiredArgsConstructor
@CrossOrigin
public class PublisherController {
    final PublisherService publisherService;

    @PostMapping("/save-publisher")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePublisher(@RequestBody Publisher publisher){
        publisherService.savePublisher(publisher);
    }

    @PutMapping("/update-publisher")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePublisher(@RequestBody Publisher publisher){
        publisherService.savePublisher(publisher);
    }

    @GetMapping("/view-all-publishers")
    @ResponseStatus(HttpStatus.OK)
    public List<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    @DeleteMapping("/delete-publisher-by-id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deletePublisher(@PathVariable Integer id) {
        return publisherService.deletePublisherById(id);
    }

    @GetMapping("/get-publisher-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Publisher getPublisherById(@PathVariable Integer id) {
        return publisherService.getPublisherById(id);
    }
}

