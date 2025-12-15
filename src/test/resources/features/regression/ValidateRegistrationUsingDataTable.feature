Feature: To validate registration functionality

@wip3009a
Scenario:
To validate registration with valid data 

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks link using xpath "//a[text()='New User Register Here']"
Then user validates title to be "Adactin.com - New User Registration"
When user enters details in Registration form
| santosh3009 | pass1234 | pass1234 | santosh s| abcd@gmail.com | india|
