@Search
Feature: Simple ReactJS AirBnB
	As a user I want to be able to 
	search for a location and select
	a date on a calendar

	Scenario Outline: User performs simple search on AirBnB
		Given I open the Open AirBnB Website
		And I type "<locationName>" and presses Enter
		And I click on the calendar button
		And I click on "<calendarDate>"
		And I click on apply		
		Then I close the application
		
		Examples:
       | locationName | calendarDate |
       | Texas | June 1, 2018 |
       | Arizona | June 12, 2018 |
       | California | June 20, 2018 |