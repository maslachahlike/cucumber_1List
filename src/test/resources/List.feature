#Author: maslachahawwaliyah@gmail.com
Feature: Create new data list in List

  Scenario: Create new agenda list
    Given User berada pada halaman Main Menu
    When User click button create new agenda
    And User input list name "Pagi"
    And User click button check list to create new agenda
    And User click button Add to create todo list1 "Mencuci"
    And user click button check to create new list
    And User click button Add to create todo list2 "jemur"
    And user click button check to create new list
    And User click button Add to create todo list3 "Mandi"
    And user click button check to create new list
    And User click button Add to create todo list4 "Makann"
    And user click button check to create new list
    And User click button Add to create todo list5 "Belajar"
    And user click button check to create new list
    And User click list1
    And User click list2
    And User swipe right list3 to edit it
    And User swipe left list4 to remove it
    And User click list5
    Then Data saved
     
