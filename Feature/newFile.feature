Feature: logout orangehrm

  Scenario: logout to homepage
    Given url of site "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user enter username as "Admin"
    And user enter password as "admin123"
    Then then select profile option
    Then click on logout submenu 
