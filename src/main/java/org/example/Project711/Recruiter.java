package org.example.Project711;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// String name: Name of the recruiter.
//List<JobPosition> jobPositionsManaged: List of job positions managed by the recruiter.
//Set<String> specializedIndustries: Set of industries that the recruiter can manage
//Set<String> specializedRoles: Set of roles that the recruiter can manage
//Methods:
//void assignJobPosition(JobPosition jobPosition): Assigns a job position to the recruiter.
//void reviewApplicant(Applicant applicant): Reviews an applicant's information and updates
// their status to "Reviewed".
//boolean isSpecializedFor(JobPosition jobPosition): Checks if the recruiter is specialized for
// a given job position. [Details need to be provided.]
public class Recruiter {
    String name;
    List<JobPosition> jobPositions;
    Set<String> specializedIndustries;
    Set<String> specializedRoles;

    public Recruiter(String name, List<JobPosition> jobPositions, Set<String> specializedIndustries, Set<String> specializedRoles) {
        this.name = name;
        this.jobPositions = jobPositions;
        this.specializedIndustries = specializedIndustries;
        this.specializedRoles = specializedRoles;
    }

    public String getName() {return name;
    }
    public void setName(String name) {this.name = name;
    }

    @Override
    public String toString() {
        return "Recruiter{" +
                "name='" + name + '\'' +
                ", jobPositions=" + jobPositions +
                ", specializedIndustries=" + specializedIndustries +
                ", specializedRoles=" + specializedRoles +
                '}';
    }

    public void assignJobPosition(JobPosition jobPosition){
     jobPositions.add(jobPosition);
        System.out.println("Recruter added new job in his worklist");
    }

    public static void reviewApplicant(Applicant applicant, boolean isRelocationPreferred, boolean isWithinBudget) {
        if (applicant.getStatus() == Status.PENDING) {
            applicant.setStatus(Status.REWIEWED);
        }else if(applicant.getStatus() == Status.REWIEWED) {
            if (applicant.isRelocationPreferred() && isWithinBudget) {
                applicant.setStatus(Status.APPROVED);
            }else{
                applicant.setStatus(Status.REJECTED);
            }
        } else if (applicant.getStatus() == Status.APPROVED) {
            System.out.println("Recruiter needs to reach out to the applicant");
        }
    }

    public boolean isSpecializedFor(JobPosition jobPosition){
        if(specializedIndustries.contains(jobPosition.getIndustry())){
            System.out.println("Recruiter work with "+ jobPosition.getIndustry());
            return true;
        } else{
            System.out.println("Recruiter doesn't work with this industry");
            return false;

        }
    }
}
