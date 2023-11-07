package org.example.Project711;
//Class HRSystem
//Attributes:
//List<JobPosition> jobPositions: List of job positions in the system.
//List<Recruiter> recruiters: List of recruiters in the system.
//List<Applicant> applicants: List of applicants in the system.
//Methods:
//void addJobPosition(JobPosition jobPosition): Adds a job position to the system. Validates that jobPosition is not null
// and that offeredSalaryRangeStart is less than or equal to offeredSalaryRangeEnd.
//void addRecruiter(Recruiter recruiter): Adds a recruiter to the system. Validates that recruiter is not null.
//void addApplicant(Applicant applicant): Adds an applicant to the system. Validates that applicant is not null.
//void generateReports(): Generates reports on the recruitment process, including the number of applicants per
// status and per job position.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HRSystem {
    List<JobPosition> jobPositions;
    List<Recruiter> recruiters;
    List<Applicant> applicants;

    public HRSystem() {
        jobPositions = new ArrayList<>();
        recruiters = new ArrayList<>();
        applicants = new ArrayList<>();
    }

    public void addJobPosition(JobPosition jobPosition) {
        if (jobPosition != null && jobPosition.getOfferedSalaryRangeStart() <= jobPosition.getOfferedSalaryRangeEnd()) {
            jobPositions.add(jobPosition);
            System.out.println("New job position is added");
        } else {
            System.out.println("Something wrong with job position. It was not added to system");
        }
    }

    public void addRecruiter(Recruiter recruiter) {
        if (recruiter != null) {
            recruiters.add(recruiter);
            System.out.println("New Recruiter is added");
        } else {
            System.out.println("Something wrong with recruiter. It was not added to system");
        }
    }

    public void addApplicant(Applicant applicant) {
        if (applicant != null) {
            applicants.add(applicant);
            System.out.println("New Applicant is added");
        } else {
            System.out.println("Something wrong with applicant. It was not added to system");
        }
    }

    public void generateReports() {  //Generates reports on the recruitment process, including the number of applicants per status and per job position.

        Collections.sort(applicants, Comparator.comparing(Applicant::getStatus));
        Collections.sort(jobPositions, Comparator.comparing(JobPosition::getTitle));

        System.out.println("Applicants by Status:");
        Status currentStatus = null;
        int count = 0;

        for (int i = 0; i < applicants.size(); i++) {
            Applicant applicant = applicants.get(i);
            if (currentStatus == null) {
                currentStatus = applicant.getStatus();
                count = 1;
            } else if (currentStatus == applicant.getStatus()) {
                count++;
            } else {
                System.out.println(currentStatus + ": " + count);
                currentStatus = applicant.getStatus();
                count = 1;
            }
            if (i == applicants.size() - 1) {
                System.out.println(currentStatus + ": " + count);
            }
        }


        System.out.println("Job by job title:");
        String currentTitle = null;
        int countjob = 0;

        for (int j = 0; j < jobPositions.size(); j++) {
            JobPosition jobPosition = jobPositions.get(j);
            if(currentTitle == null) {
                currentTitle = jobPosition.getTitle();
                countjob = 1;
            }else if(currentTitle.equals(jobPosition.getTitle())) {
                countjob++;
            }else {
                System.out.println(currentTitle + ": " + countjob);
                currentTitle = jobPosition.getTitle();
                countjob = 1;
            }
        }
        System.out.println(currentTitle + ": " + countjob);
    }
}



