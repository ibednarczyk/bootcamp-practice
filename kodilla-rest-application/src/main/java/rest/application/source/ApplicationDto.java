package rest.application.source;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class ApplicationDto {
    private String firstName;
    private String lastName;
    private String email;
    private double principal;
    private int term;
    private String status;
    private LocalDate submissionDate;
    private LocalTime submissionTime;
    private LocalDate dueDate;

    public ApplicationDto(){

    }

    public ApplicationDto (String firstName, String lastName, String email, int principal, int term, LocalDate submissionDate,
                           LocalTime submissionTime, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.principal = principal;
        this.term = term;
        this.submissionTime = submissionTime;
        this.submissionDate = submissionDate;
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getPrincipal() {
        return principal;
    }

    public int getTerm() {
        return term;
    }

    public LocalTime getSubmissionTime() {
        return submissionTime;
    }

    public String getStatus() { return status;
    }
    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationDto that = (ApplicationDto) o;
        return Double.compare(that.principal, principal) == 0 &&
                term == that.term &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(email, that.email) &&
                Objects.equals(status, that.status) &&
                Objects.equals(submissionDate, that.submissionDate) &&
                Objects.equals(submissionTime, that.submissionTime) &&
                Objects.equals(dueDate, that.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, principal, term, status, submissionDate, submissionTime, dueDate);
    }
}
