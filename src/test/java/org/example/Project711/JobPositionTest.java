package org.example.Project711;

import org.junit.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class JobPositionTest {
    @org.junit.jupiter.api.Test
    void isWithinBudgetLowerBoundary () {
        JobPosition jobtest = new JobPosition("test","test", 1000.00,2000.00,List.of("skill1","skill2"),"location","test","test");
        assertFalse(jobtest.isWithinBudget(900));
    }

    @org.junit.jupiter.api.Test
    void isWithinBudgetUpperBoundary() {
        JobPosition jobtest = new JobPosition("test","test", 1000.00,2000.00,List.of("skill1","skill2"),"location","test","test");
        assertFalse(jobtest.isWithinBudget(2500));
    }
}