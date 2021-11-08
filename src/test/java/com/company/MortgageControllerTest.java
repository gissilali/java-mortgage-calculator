package com.company;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MortgageControllerTest {
    MortgageController mortgageController;

    @BeforeEach
    public void setUp() {
        mortgageController = new MortgageController();
        mortgageController.costOfHome = 400000;
        mortgageController.lengthOfLoan = 30;
        mortgageController.downPayment = 100000;
    }

    @BeforeAll
    public static void beforeAll() {
    }

    @Test
    @DisplayName("Should calculate monthly payments correctly")
    void shouldCalculateMonthlyPaymentsCorrectly() {
        Assertions.assertEquals(1610.46, mortgageController.calculate().getMonthlyPayments());
    }

    @Test
    @DisplayName("Should calculate principal correctly")
    void shouldCalculatePrincipalCorrectly() {
        Assertions.assertEquals(300000, mortgageController.getPrincipal());
    }

    @Test
    @DisplayName("Should calculate length of loan in months")
    void shouldCalculateLengthOfLoanInMonths() {
        Assertions.assertEquals(360, mortgageController.getLengthOfLoanInMonths());
    }
}