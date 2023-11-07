package org.example.Project711;
// Attributes:
//List<String> previousCompanies: List of companies the applicant has previously worked for.
//String currentCity: Current city of residence of the applicant.
//String preferredLocation: Location where the applicant prefers to work.
//double expectedSalary: Expected salary of the applicant.
//String status: Status of the application (e.g., "Pending", "Reviewed", etc.).
//Methods:
//boolean isRelocationPreferred(): Checks if the applicant prefers to relocate based on the preferredLocation and currentCity.


import java.util.List;
public class Applicant {
    List<String> previousCompanies;
    String currentCity;
    String preferredLocation;
    double expectedSalary;
    Status status;

    public Applicant(List<String> previousCompanies, String currentCity, String preferredLocation, double expectedSalary, Status status) {
        this.previousCompanies = previousCompanies;
        this.currentCity = currentCity;
        this.preferredLocation = preferredLocation;
        this.expectedSalary = expectedSalary;
        this.status = status;
    }

    public List<String> getPreviousCompanies() {return previousCompanies;
    }

    public void setPreviousCompanies(List<String> previousCompanies) {this.previousCompanies = previousCompanies;
    }

    public String getCurrentCity() {return currentCity;
    }

    public void setCurrentCity(String currentCity) {this.currentCity = currentCity;
    }

    public String getPreferredLocation() {return preferredLocation;
    }

    public void setPreferredLocation(String preferredLocation) {this.preferredLocation = preferredLocation;
    }

    public double getExpectedSalary() {return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {this.expectedSalary = expectedSalary;
    }

    public Status getStatus() {return status;
    }

    public void setStatus(Status status) {this.status = status;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "previousCompanies=" + previousCompanies +
                ", currentCity='" + currentCity + '\'' +
                ", preferredLocation='" + preferredLocation + '\'' +
                ", expectedSalary=" + expectedSalary +
                ", status=" + status +
                '}';
    }
    public boolean isRelocationPreferred(){
        if(!currentCity.equalsIgnoreCase(preferredLocation)){
            System.out.println("Apllicant preferred relocation");
            return true;
        } else{
            System.out.println("Apllicant would like to stay in current city");
            return false;
        }
    }
}

