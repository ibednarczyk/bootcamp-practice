package rest.application.service;

public class LoanRequirements {

private double minPrincipal = 500.00;
private double maxPrincipal = 20000.00;
private int minTerm = 90;
private int maxTerm =720;
private int extensionDays=30;

    public double getMinPrincipal() {
        return minPrincipal;
    }

    public double getMaxPrincipal() {
        return maxPrincipal;
    }

    public int getMinTerm() {
        return minTerm;
    }

    public int getMaxTerm() {
        return maxTerm;
    }

    public int getExtensionDays() {
        return extensionDays;
    }
}
