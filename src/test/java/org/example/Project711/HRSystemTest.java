package org.example.Project711;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HRSystemTest {

    @Test
    void addJobPositionWithValidData() {
        HRSystem hrSystem= new HRSystem();
        hrSystem.addJobPosition(new JobPosition("Developer", "full-time", 1000,
                2000, List.of("tecnical skill"), "Berlin", "indusry", "some role"));
        assertEquals(1,hrSystem.jobPositions.size());
    }
    @Test
    void addJobPositionWithInvalidData() {
        HRSystem hrSystem= new HRSystem();
        JobPosition jobPosition = null;
        hrSystem.addJobPosition(jobPosition);
        assertEquals(0, hrSystem.jobPositions.size());
    }

    @Test
    void addValidRecruiter() {
        HRSystem hrSystem= new HRSystem();
        Recruiter recruiter= new Recruiter("Polina",null, Set.of("industies"),Set.of("roles"));
        hrSystem.addRecruiter(recruiter);
        assertEquals(1,hrSystem.recruiters.size());
    }
    @Test
    void addInvalidRecruiter() {
        HRSystem hrSystem= new HRSystem();
        Recruiter recruiter= null;
        hrSystem.addRecruiter(recruiter);
        assertEquals(0,hrSystem.recruiters.size());
    }
    @Test
    void addValidApplicant() {
        HRSystem hrSystem= new HRSystem();
        Applicant applicant= new Applicant(List.of("test company"),"Berlin",
                "Potsdam",1200, Status.PENDING);
        hrSystem.addApplicant(applicant);
        assertEquals(1, hrSystem.applicants.size());
    }
    @Test
    void addInvalidApplicant() {
        HRSystem hrSystem= new HRSystem();
        Applicant applicant= null;
        hrSystem.addApplicant(applicant);
        assertEquals(0, hrSystem.applicants.size());
    }

    @Test
    void generateReports() {
    }
}