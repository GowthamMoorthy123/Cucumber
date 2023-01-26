#Author: gowtham.moorthy

Feature: Login Page 
 
  @Regression
  Scenario Outline: Login With valid credentials
    Given Launch the chrome browser
    When Pass the URL "https://www.staplesadvantage.com/idm"
    And Enter the username "<name>"
    And click the next button
    And enter the Account number "<AccountNumber>" 
    And click the next button
    And send the Password "<Password>"
    And click signIn button
    Then verify Shipping Location page
    And close the driver

    Examples: 
      | name  | AccountNumber | Password  |
      | rvadmin | 1844335 | Staples@123 |
      | rvsuper | 1844335 | Staples@123 |
