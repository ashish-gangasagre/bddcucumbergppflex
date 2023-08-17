
Feature: Testing ICICI PruLife Return of Premium Term Plan Page
  As a user
  I want to test various functionalities on the ICICI PruLife Return of Premium Term Plan page
  So that I can ensure the page works as expected

 

  Scenario: Verifying Page Title
  Given User Lanch Chrome Browser
    When  User open url "https://www.iciciprulife.com/retirement-pension-plans/guaranteed-pension-plan-flexi-calculator.html?UID=1309&khk"
    When I enter dateofb as "03101982"
    When i ckick on "Annual income"
    When I click on "5L - 7.4L"
    And I enter mobilnumber as "9999999999"
    And I enter emailid as "ash@gmail.com"
    And I click on "Calculate pension"
  

  