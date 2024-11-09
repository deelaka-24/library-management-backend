package edu.icet.service;

import edu.icet.dto.Fine;

import java.util.List;

public interface FineService {
    void saveFine(Fine fine);
    void updateFine(Fine fine);
    List<Fine> getAllFines();
    Fine getFineById(Integer id);
    Boolean deleteFineById(Integer id);
}
