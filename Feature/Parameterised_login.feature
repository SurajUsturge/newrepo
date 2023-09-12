Feature: login orangehrm

  Scenario: Login to homepage
    Given url of page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user enter username "Admin"
    And user enter password "admin123"
    Then user login successfully
