@mvctest
Feature: To Do MVC page functionality

  Scenario Outline: 1. To test whether user able to enter anything in the To Do MVC page
    Given I am in to do mvc page
    When I enter a <keyword>
    Then I see <keyword> in the mvc list
    
    Examples:
    | keyword   |
    | Test      |
    | 1234      |
    | Test_123  |
    | Test 123  |
    | Te.!@#    |
   
   Scenario Outline: 2. To test whether user able to enter multiple todos and view total number of todos
    Given I am in to do mvc page
    When I enter <to_do_1> , <to_do_2> , <to_do_3> , <to_do_4>
    Then I see <total_count> in the mvc page
    
    Examples:
    | to_do_1   | to_do_2   | to_do_3   | to_do_4   | total_count |
    | Test1     | Test2     | Test3     | Test4     | 4           |
   
   Scenario Outline: 3. To test whether user able to view active list
    Given I am in to do mvc page
    And I enter <to_do_1> , <to_do_2> , <to_do_3> , <to_do_4>
    When I tap on active button
    Then I see <to_do_1> , <to_do_2> , <to_do_3> , <to_do_4> in the active list
    
    Examples:
    | to_do_1   | to_do_2   | to_do_3   | to_do_4   |
    | Test1     | Test2     | Test3     | Test4     |
   
   Scenario Outline: 4. To test whether user able to view completed list
    Given I am in to do mvc page
    And I enter <to_do_1> , <to_do_2> , <to_do_3> , <to_do_4>
    When I complete <to_do_1>
    And I tap on completed button
    Then I see <to_do_1> in the completed list
    
    Examples:
    | to_do_1   | to_do_2   | to_do_3   | to_do_4   |
    | Test1     | Test2     | Test3     | Test4     |
   
   Scenario Outline: 5. To test whether user able to view all, active and completed list
    Given I am in to do mvc page
    And I enter <to_do_1> , <to_do_2> , <to_do_3> , <to_do_4>
    When I complete <to_do_1>
    And I tap on completed button
    Then I see <to_do_1> in the completed list
    When I tap on active button
    Then I see <to_do_2> , <to_do_3> , <to_do_4> in the remaining active list
    When I tap on all button
    Then I see <to_do_1> , <to_do_2>, <to_do_3> , <to_do_4> in the all list
    
    Examples:
    | to_do_1   | to_do_2   | to_do_3   | to_do_4   |
    | Test1     | Test2     | Test3     | Test4     |
   
   Scenario Outline: 6. To test whether user able to clear completed list
    Given I am in to do mvc page
    And I enter <to_do_1> , <to_do_2> , <to_do_3> , <to_do_4>
    When I complete <to_do_1>
    And I tap on clear completed button
    And I tap on all button
    Then I dont see <to_do_1> in the all list
    
    Examples:
    | to_do_1   | to_do_2   | to_do_3   | to_do_4   |
    | Test1     | Test2     | Test3     | Test4     |