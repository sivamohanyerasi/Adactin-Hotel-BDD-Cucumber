Feature: To validate registration functionality

@wip3009
Scenario:
To validate registration with valid data 

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks link using xpath "//a[text()='New User Register Here']"
Then user validates title to be "Adactin.com - New User Registration"
When user enters text "santosh3009" in textbox using xpath "//input[@name='username']"
And user enters text "santosh123" in textbox using xpath "//input[@name='password']"
And user enters text "santosh123" in textbox using xpath "//input[@name='re_password']"
And user enters text "santosh s" in textbox using xpath "//input[@name='full_name']"
And user enters text "abacd@gmail.com" in textbox using xpath "//input[@name='email_add']"
And user enters text "india" in textbox using xpath "//input[@name='captcha']"
