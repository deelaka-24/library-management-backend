package edu.icet.controller;

import edu.icet.dto.Fine;
import edu.icet.service.FineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fine")
@RequiredArgsConstructor
@CrossOrigin
public class FineController {

    final FineService fineService;

    @PostMapping("/save-fine")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveFine(@RequestBody Fine fine) {
        fineService.saveFine(fine);
    }

    @PutMapping("/update-fine")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateFine(@RequestBody Fine fine) {
        fineService.updateFine(fine);
    }

    @GetMapping("/view-all-fines")
    @ResponseStatus(HttpStatus.OK)
    public List<Fine> getAllFines() {
        return fineService.getAllFines();
    }

    @GetMapping("/get-fine-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Fine getFineById(@PathVariable Integer id) {
        return fineService.getFineById(id);
    }

    @DeleteMapping("/delete-fine-by-id/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean deleteFineById(@PathVariable Integer id) {
        return fineService.deleteFineById(id);
    }
}
