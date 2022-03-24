Feature: CyberRiskAssesment for IT Users and Corporations

  Scenario: Consultant SignUp
  Given Consultant can enter on web "https://sa.selfassess.cl/SignUp"
  When  Consultant completes the formulary system should show the "Registered!" message
  Then Consultant is redirected to "https://sa.selfassess.cl/Login"

  Scenario Outline: Validate Answer
    Given Consultant can enter on web "https://sa.selfassess.cl/Survey"
    When  Consultant completes the Survey and enters it's "<answers>"
    Then  System return "<validation>"
    Examples:

      | answers | validation |
      | It does apply | Your answer is Valid |
      | 1 | Please check your answer |
      | 123 | Please check your answer |
      | Doesn't apply | Your answer is Valid |