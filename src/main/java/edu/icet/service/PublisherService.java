package edu.icet.service;

import edu.icet.dto.Publisher;

import java.util.List;

public interface PublisherService {
    void savePublisher(Publisher publisher);
    List<Publisher> getAllPublishers();
    Publisher getPublisherById(Integer id);
    Boolean deletePublisherById(Integer id);
}
