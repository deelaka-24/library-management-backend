package edu.icet.service.impl;

import edu.icet.dto.Fine;
import edu.icet.entity.FineEntity;
import edu.icet.repository.FineRepository;
import edu.icet.service.FineService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FineServiceImpl implements FineService {

    final FineRepository fineRepository;
    final ModelMapper modelMapper;

    @Override
    public void saveFine(Fine fine) {
        fineRepository.save(modelMapper.map(fine, FineEntity.class));
    }

    @Override
    public void updateFine(Fine fine) {
        fineRepository.save(modelMapper.map(fine, FineEntity.class));
    }

    @Override
    public List<Fine> getAllFines() {
        List<Fine> fineList = new ArrayList<>();
        fineRepository.findAll().forEach(entity -> fineList.add(modelMapper.map(entity, Fine.class)));
        return fineList;
    }

    @Override
    public Fine getFineById(Integer id) {
        return modelMapper.map(fineRepository.findById(id).orElse(null), Fine.class);
    }

    @Override
    public Boolean deleteFineById(Integer id) {
        fineRepository.deleteById(id);
        return true;
    }
}
