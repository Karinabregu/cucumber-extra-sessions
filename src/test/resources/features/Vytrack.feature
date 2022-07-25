Feature: Default

	User Story: As a user, when I am on the Vytrack application, and on the Vehicle page under Fleet module, I should be able to see Export Grid dropdown, Refresh, Rest, and Grid Settings Buttons
	@B26G23-47 @B26G23-40
	Scenario:User should be able to click refresh button

	Given user is on the Vytrack app

	When user enters valid username "user165" and password "UserUser123"

	And user clicks the login button

	And user hovers over fleet and selects vehicle

	Then user should see the refresh button


		