package org.example.Project711;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecruiterTest {
    @Test
    void isRecruterWorkWithITIndustry() {
        Recruiter recruiter= new Recruiter("Moana", new ArrayList<>(), Set.of("IT"),Set.of("testrole"));
        JobPosition jobPosition= new JobPosition("test","test",1000,2000,
                null,"test location", "IT", "test role");
        assertTrue(recruiter.isSpecializedFor(jobPosition));
    }

    @Test
    void isRecruterDoesntWorkWithITIndustry() {
        Recruiter recruiter= new Recruiter("Moana", new ArrayList<>(), Set.of("Test"),Set.of("testrole"));
        JobPosition jobPosition= new JobPosition("test","test",1000,2000,
                null,"test location", "IT", "test role");
        assertFalse(recruiter.isSpecializedFor(jobPosition));
    }
}