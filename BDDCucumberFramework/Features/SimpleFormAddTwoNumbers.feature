Feature: Simple Form Add Two Numbers
	
Scenario Outline: Add two numbers
	Given Launch selenium easy Application
	Then click on No thanks Button
	Then Expand Input Forms from All Examples
	And select Simple from Demo
	When Enter two Input Fields "<a>" and "<b>"
	Then click on Get total
	And verify the Total
	Then close browser
	
	Examples:
    |a|b|
    |1|2|
    |3|4|