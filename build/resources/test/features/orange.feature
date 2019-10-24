
Feature: Web Automation OrangeHRM Demo
  As a web user
  wants to access menu PIM
  To register a employee and visualize the new employee

  Scenario: to register a new employee
    Given that Juan needs to create an employee at the OrageHR
    When he makes the registration entry in the application
      |first_name|middle_name|last_name|location|id|other_id|date_of_birth|marital_status|gender|nationality|drives_license_number|license_expiry_date|nick_name|military_service|smoker|blood_group|hobbies|effective_from|region|fte|temporary_department|
      |Maria|Alejandra|Dominguez|Australian Regional HQ|1234|1111|1993-10-10|Single|Female|Albanian|123456789|2020-25-05|Maleja|987654321|Yes|A|Play guitar, Read books|2019-11-09|Region-1|0.5|Sub unit-1|
    Then he visualizes the 1234 of a new employee in the application



