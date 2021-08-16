Feature: adactin hotel normal booking

  Scenario Outline: Adactin Booking
    Given User on the login page
    When User should login the page by entering "<Username>","<password>" and click login button
    Then User fill the fields on Search Hotel page "<checkindate>","<checkoutdate>" and click the search button
    Then User should click  conform and continue button on Select Hotel
    Then User fill the Book A Hotel page "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<CVVNumber>" , "CreditCardType" , "SelectMonth" , "SelectYear" and click the booknow button
      | Credit Card Type | Select Month | Select Year |
      | American Express | January      |        2012 |
      | Master Card      | March        |        2013 |
      | Other            | April        |        2011 |
      | VISA             | February     |        2014 |
      |                  | May          |        2015 |
      |                  | June         |        2016 |
      |                  | July         |        2017 |
      |                  | August       |        2018 |
      |                  | September    |        2019 |
      |                  | October      |        2020 |
      |                  | November     |        2021 |
      |                  | December     |        2022 |
      |                  |              |        2023 |
    Then User should get the booking id and click myltinerary button
    Then User cancel the booking on Booked Itinerary
    Examples: 
    |Username    |password |checkindate|checkoutdate|FirstName|LastName|BillingAddress|CreditCardNo    |CVVNumber|
    |Suganesh    |Sugan@123|10/08/2021 |11/08/2021  |kavi     |Raj     |Chennai       |1234567890123456|1234     |
    
    
    
    
    
