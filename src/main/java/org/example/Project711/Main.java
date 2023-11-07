package org.example.Project711;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Applicant applicant1 = new Applicant(List.of("Company1", "CompanyA"),"Berlin","Berlin",1000,Status.PENDING);
        Applicant applicant2 = new Applicant(List.of("Company2", "CompanyB"),"Berlin","New York",1500,Status.PENDING);
        Applicant applicant3 = new Applicant(List.of("Company3"),"Humburg","Berlin",1200,Status.PENDING);
        Applicant applicant4 = new Applicant(List.of("Company4", "CompanyD"),"Berlin","Berlin",1300,Status.REWIEWED);

        List<Applicant> applicants = new ArrayList<>();
        applicants.add(applicant1);
        applicants.add(applicant2);
        applicants.add(applicant3);
        applicants.add(applicant4);
        for (Applicant applicant : applicants) {
            System.out.println(applicant);
        }

        System.out.println("--------------");
        applicant1.isRelocationPreferred();
        applicant2.isRelocationPreferred();
        System.out.println("--------------");

        HRSystem hrSystem = new HRSystem();
        hrSystem.addApplicant(applicant1);
        hrSystem.addApplicant(applicant2);
        hrSystem.addApplicant(applicant3);
        hrSystem.addApplicant(applicant4);


        JobPosition jobPosition1 = new JobPosition("java Developer","it", 900,1500,
                List.of("tecnical skill","teamworking"),"Berlin", "IT", "Developer");
        JobPosition jobPosition2 = new JobPosition("Marketing Manager", "Marketing", 2000, 2500,
                List.of("Marketing strategy", "leadership"), "New York", "Marketing", "Manager");
        JobPosition jobPosition3 = new JobPosition("Accountant", "Finance", 1500, 2000,
                List.of("Accounting principles", "financial analysis"), "London", "Finance", "Accountant");
        JobPosition jobPosition4 = new JobPosition("Data Scientist", "Data Science", 2500, 3000,
                List.of("Data analysis", "machine learning"), "San Francisco", "Data Science", "Data Scientist");

        List<JobPosition> jobPositions = new ArrayList<>();
        jobPositions.add(jobPosition1);
        jobPositions.add(jobPosition2);
        jobPositions.add(jobPosition3);
        jobPositions.add(jobPosition4);
        for (JobPosition jobPosition : jobPositions) {
            System.out.println(jobPosition);
        }
        System.out.println("--------------");
        jobPosition1.isWithinBudget(applicant1.getExpectedSalary());
        jobPosition3.isWithinBudget(applicant4.getExpectedSalary());
        System.out.println("--------------");

        hrSystem.addJobPosition(jobPosition1);
        hrSystem.addJobPosition(jobPosition2);
        hrSystem.addJobPosition(jobPosition3);
        hrSystem.addJobPosition(jobPosition4);

        System.out.println("--------------");

        hrSystem.generateReports();


        System.out.println("--------------");

        Recruiter recruiter1 = new Recruiter("Olaf",jobPositions, Set.of("Data Science"), Set.of("Software Engineer", "Marketing Manager", "Accountant"));
        Recruiter recruiter2 = new Recruiter("Anna",jobPositions, Set.of("Data Science","Finance"), Set.of("Software Engineer"));
        Recruiter recruiter3 = new Recruiter("Elsa",jobPositions, Set.of("Finance"), Set.of("Marketing Manager", "Accountant"));
        Recruiter recruiter4 = new Recruiter("Kristof",jobPositions, Set.of("Finance"), Set.of("Marketing Manager", "Accountant"));

        List<Recruiter> recruiters = new ArrayList<>(); // create a list of recruiters
        recruiters.add(recruiter1);
        recruiters.add(recruiter2);
        recruiters.add(recruiter3);
        recruiters.add(recruiter4);
        for (Recruiter recruiter: recruiters){
            System.out.println(recruiter);
        }
        System.out.println("--------------");

        recruiter1.assignJobPosition(jobPosition1);// call assighn method, add job position to recruiter
        System.out.println("--------------");

        recruiter1.isSpecializedFor(jobPosition4);// call method and ask is recruiter work with this industry?
        System.out.println("--------------");







    }
}
