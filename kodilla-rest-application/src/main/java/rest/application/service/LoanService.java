package rest.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.application.source.ApplicationDto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Service
public class LoanService {

    @Autowired
    private LoanRequirements requirements;

    private Set<ApplicationDto> submittedApplications;
    private Set<ApplicationDto> rejectedApplications;
    private Set<ApplicationDto> acceptedApplications;

    public void applyForALoan(ApplicationDto application){
        submittedApplications.add(application);
        for (ApplicationDto applicationDto : submittedApplications){
            applicationDto.setStatus("new");
        }
    }
    public void verifyApplication(ApplicationDto application){
        if (application.getSubmissionTime().isAfter(LocalTime.of(0, 0))
                & application.getSubmissionTime().isBefore(LocalTime.of(6,0))
                & application.getPrincipal() == requirements.getMaxPrincipal()) {
           for (ApplicationDto applicationDto: submittedApplications){
               applicationDto.setStatus("rejected");
           }
            rejectedApplications.add(application);
        }
    }
    public void acceptApplication(ApplicationDto application){
        verifyApplication(application);
        if ((!application.getStatus().equals("rejected")) & application.getPrincipal() >= requirements.getMinPrincipal()
                & application.getPrincipal() <= requirements.getMaxPrincipal()
                & application.getTerm() >= requirements.getMinTerm()
                & application.getTerm() <= requirements.getMaxTerm()){

            for (ApplicationDto applicationDto : submittedApplications){
                applicationDto.setStatus("accepted");
            }
            acceptedApplications.add(application);

        } else {

            for (ApplicationDto applicationDto : submittedApplications){
                applicationDto.setStatus("rejected");
            }
            rejectedApplications.add(application);
        }
    }

    public double calculateCost(){
        double loanCost = 0;
        for (ApplicationDto applicationDto : acceptedApplications) {
            loanCost = applicationDto.getPrincipal()*1.1;
        }
        return loanCost;

    }

    public void extendLoan(ApplicationDto application){
        LocalDate extendedDueDate;
        if (acceptedApplications.contains(application)){
            extendedDueDate = application.getSubmissionDate().plusDays(application.getTerm())
                    .plusDays(requirements.getExtensionDays());
            application.setDueDate(extendedDueDate);
        }

    }

    public Set<ApplicationDto> getSubmittedApplications() {
        return submittedApplications;
    }

    public Set<ApplicationDto> getRejectedRequests() {
        return rejectedApplications;
    }

    public Set<ApplicationDto> getAcceptedApplications() {
        return acceptedApplications;
    }

}
