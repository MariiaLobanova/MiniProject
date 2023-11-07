package org.example.Project711;

import java.util.List;

// Class JobPosition
//Attributes:
//String title: Title of the job position.
//String description: Description of the job position.
//double offeredSalaryRangeStart: Starting range of the salary offered for the job position.
//double offeredSalaryRangeEnd: Ending range of the salary offered for the job position.
//List<String> requiredSkills: List of skills required for the job position.
//String location: Location of the job position.
//String industry: Industry to which this job positions belongs to
//       String role: Role of the job

//Methods:
//boolean isWithinBudget(Applicant applicant): Checks if an applicant's expected salary is within the job position's budget.
public class JobPosition {
    String title;
    String description;
    double offeredSalaryRangeStart;
    double offeredSalaryRangeEnd;
    List<String> requiredSkills;
    String location;
    String industry;
    String role;


    public JobPosition(String title, String description, double offeredSalaryRangeStart, double offeredSalaryRangeEnd,
                       List<String> requiredSkills, String location, String industry, String role) {
        this.title = title;
        this.description = description;
        this.offeredSalaryRangeStart = offeredSalaryRangeStart;
        this.offeredSalaryRangeEnd = offeredSalaryRangeEnd;
        this.requiredSkills = requiredSkills;
        this.location = location;
        this.industry = industry;
        this.role= role;
    }

    public String getTitle() {return title;
    }
    public void setTitle(String title) {this.title = title;
    }

    public String getDescription() {return description;
    }

    public void setDescription(String description) {this.description = description;
    }

    public double getOfferedSalaryRangeStart() {return offeredSalaryRangeStart;
    }

    public void setOfferedSalaryRangeStart(double offeredSalaryRangeStart) {
        this.offeredSalaryRangeStart = offeredSalaryRangeStart;
    }

    public double getOfferedSalaryRangeEnd() {return offeredSalaryRangeEnd;
    }

    public void setOfferedSalaryRangeEnd(double offeredSalaryRangeEnd) {
        this.offeredSalaryRangeEnd = offeredSalaryRangeEnd;
    }

    public List<String> getRequiredSkills() {return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {this.requiredSkills = requiredSkills;
    }

    public String getLocation() {return location;
    }

    public void setLocation(String location) {this.location = location;
    }

    public String getIndustry() {return industry;
    }

    public void setIndustry(String industry) {this.industry = industry;
    }

    public String getRole() {return role;
    }

    public void setRole(String role) {this.role = role;
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", offeredSalaryRangeStart=" + offeredSalaryRangeStart +
                ", offeredSalaryRangeEnd=" + offeredSalaryRangeEnd +
                ", requiredSkills=" + requiredSkills +
                ", location='" + location + '\'' +
                ", industry='" + industry + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public boolean isWithinBudget(double expectedSalary){ // checking salaryRange
        if(expectedSalary>=offeredSalaryRangeStart&&expectedSalary<=offeredSalaryRangeEnd) {
            System.out.println("Applicant is satified with salary!");
            return true;
        }else {
            System.out.println("salary doesn't meet with the applicant's expectations");
            return false;
        }
    }
}
