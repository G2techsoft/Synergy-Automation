Feature: Login to OrangeHRM
@login
  Scenario: Login with String as input
    Given Loginto Orangehrm with username as "Admin"
    Then password as "admin123"
    And click on loginbutton


  Scenario:Verify the totle of the page
    Given Verify the title of the page is "Oran1geHRM"

#  Scenario: Login with String as input
#    Given Loginto Orangehrm with username as "Admin"
#    Then password as "admin123"
#    And click on loginbutton
#
#
#  Scenario:Verify the totle of the page
#    Given Verify the title of the page is "OrangeHRM"
#  Scenario: Login with String as input
#    Given Loginto Orangehrm with username as "Admin"
#    Then password as "admin123"
#    And click on loginbutton
#
#
#  Scenario:Verify the totle of the page
#    Given Verify the title of the page is "OrangeHRM"
#  Scenario: Login with String as input
#    Given Loginto Orangehrm with username as "Admin"
#    Then password as "admin123"
#    And click on loginbutton
#
#
#  Scenario:Verify the totle of the page
#    Given Verify the title of the page is "OrangeHRM"
#  Scenario: Login with String as input
#    Given Loginto Orangehrm with username as "Admin"
#    Then password as "admin123"
#    And click on loginbutton
#
#
#  Scenario:Verify the totle of the page
#    Given Verify the title of the page is "OrangeHRM"
#  Scenario: Login with String as input
#    Given Loginto Orangehrm with username as "Admin"
#    Then password as "admin123"
#    And click on loginbutton
#
#
#  Scenario:Verify the totle of the page
#    Given Verify the title of the page is "OrangeHRM"
