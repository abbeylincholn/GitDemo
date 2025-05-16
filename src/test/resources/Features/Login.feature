Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And User enters username"Admin" and password"Admin123"
    And Click on Login
    Then Page Title should be "OrangeHRM"
    When user click on Logout link
    Then Page Title should be "OrangeHRM"
    And close browser
