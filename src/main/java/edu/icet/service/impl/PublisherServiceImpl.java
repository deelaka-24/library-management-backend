package edu.icet.service.impl;

import edu.icet.dto.Publisher;
import edu.icet.entity.PublisherEntity;
import edu.icet.repository.PublisherRepository;
import edu.icet.service.PublisherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class PublisherServiceImpl implements PublisherService {

    final PublisherRepository repository;
    final ModelMapper mapper;

    @Override
    public void savePublisher(Publisher publisher) {
        repository.save(mapper.map(publisher, PublisherEntity.class));
    }

    @Override
    public List<Publisher> getAllPublishers() {
        List<Publisher> publisherList = new ArrayList<>();
        repository.findAll().forEach(entity -> publisherList.add(mapper.map(entity, Publisher.class)));
        return publisherList;
    }

    @Override
    public Publisher getPublisherById(Integer id) {
        return repository.findById(id).map(entity -> mapper.map(entity, Publisher.class)).orElse(null);
    }

    @Override
    public Boolean deletePublisherById(Integer id) {
        repository.deleteById(id);  // Delete publisher by ID
        return true;
    }
}
