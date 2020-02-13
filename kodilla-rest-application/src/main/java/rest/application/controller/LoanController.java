package rest.application.controller;


import org.springframework.web.bind.annotation.*;
import rest.application.service.LoanService;
import rest.application.source.ApplicationDto;

import java.util.Set;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/applications/submitted")
    public Set<ApplicationDto> getSubmittedApplications() {
        return loanService.getSubmittedApplications();
    }

    @GetMapping("/applications/accepted")
    public Set<ApplicationDto> getAcceptedApplications() {
        return loanService.getAcceptedApplications();
    }

    @GetMapping("/applications/rejected")
    public Set<ApplicationDto> getRejectedApplications() {
        return loanService.getRejectedRequests();
    }

    @PostMapping("/apply")
    public void apply(@RequestBody ApplicationDto applicationDto) {
        loanService.applyForALoan(applicationDto);
    }

    @PostMapping("/verify")
    public void verify(@RequestBody ApplicationDto applicationDto) {
        loanService.verifyApplication(applicationDto);

    }

    @PostMapping("/accept")
    public void accept(@RequestBody ApplicationDto applicationDto) {
        loanService.acceptApplication(applicationDto);

    }

    @GetMapping("/cost")
    public double getCost() {
        return loanService.calculateCost();

    }

    @PutMapping("/extend")
    public void extend(@RequestBody ApplicationDto applicationDto) {
        loanService.extendLoan(applicationDto);
    }

}
