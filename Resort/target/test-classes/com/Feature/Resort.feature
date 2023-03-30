Feature: Testing adactinhotelapp 

Scenario Outline: Giving correct Username and password in login page
Given User navigate into URL
Then max the window
Then User enter his username "<Username>"
Then User enter his password "<Password>"
And User click login button

Examples: 

   |Username|Password|
   |THG|123|
   |Thasifd|123456|
   |ThasifAhamed|12345678900| 

 
