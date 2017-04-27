$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature of EMS Merchant Portal",
  "description": "",
  "id": "login-feature-of-ems-merchant-portal",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To Validate whether the User able to Login Successfully",
  "description": "",
  "id": "login-feature-of-ems-merchant-portal;to-validate-whether-the-user-able-to-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the \"EMSMerchant\" Application Launch in \"Testing\" Env",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter \"UserName\" and \"Password\" from \"TestData:Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on \"Log in to My EMS\" button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "default Dashboard Page is Displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Verify Dashboard Date displayed is \"TODAY\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verify \"Payment\" Dashboard is available",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify \"Sales\" Dashboard is available",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify \"Transfers\" Dashboard is available",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "EMSMerchant",
      "offset": 5
    },
    {
      "val": "Testing",
      "offset": 41
    }
  ],
  "location": "EMS.the_Application_Launch_in_Env(String,String)"
});
formatter.result({
  "duration": 26099092469,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UserName",
      "offset": 7
    },
    {
      "val": "Password",
      "offset": 22
    },
    {
      "val": "TestData:Login",
      "offset": 38
    }
  ],
  "location": "EMS.enter_and_from(String,String,String)"
});
formatter.result({
  "duration": 2862703926,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log in to My EMS",
      "offset": 15
    }
  ],
  "location": "EMS.user_click_on_button(String)"
});
formatter.result({
  "duration": 3717386658,
  "status": "passed"
});
formatter.match({
  "location": "EMS.default_Dashboard_Page_is_Displayed()"
});
formatter.result({
  "duration": 3238850868,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TODAY",
      "offset": 36
    }
  ],
  "location": "EMS.verify_Dashboard_Date_displayed_is(String)"
});
formatter.result({
  "duration": 2383806197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Payment",
      "offset": 8
    }
  ],
  "location": "EMS.verify_Dashboard_is_available(String)"
});
formatter.result({
  "duration": 309227391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sales",
      "offset": 8
    }
  ],
  "location": "EMS.verify_Dashboard_is_available(String)"
});
formatter.result({
  "duration": 289604567,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transfers",
      "offset": 8
    }
  ],
  "location": "EMS.verify_Dashboard_is_available(String)"
});
formatter.result({
  "duration": 254892953,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "To Validate User Not able to Login Successfully with Invalid Credentials",
  "description": "",
  "id": "login-feature-of-ems-merchant-portal;to-validate-user-not-able-to-login-successfully-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "the \"EMSMerchant\" Application Launch in \"nTesting\" Env",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "enter \"UserName\" and \"Password\" from \"TestData:Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click on \"Log in to My EMS\" button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Login Should Fail",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "should display Message \"This combination of username and password is invalid. Please try again or request a new password.\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "EMSMerchant",
      "offset": 5
    },
    {
      "val": "nTesting",
      "offset": 41
    }
  ],
  "location": "EMS.the_Application_Launch_in_Env(String,String)"
});
formatter.result({
  "duration": 4324732456,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UserName",
      "offset": 7
    },
    {
      "val": "Password",
      "offset": 22
    },
    {
      "val": "TestData:Login",
      "offset": 38
    }
  ],
  "location": "EMS.enter_and_from(String,String,String)"
});
formatter.result({
  "duration": 2903592331,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log in to My EMS",
      "offset": 15
    }
  ],
  "location": "EMS.user_click_on_button(String)"
});
formatter.result({
  "duration": 3590548443,
  "status": "passed"
});
formatter.match({
  "location": "EMS.login_Should_Fail()"
});
formatter.result({
  "duration": 3452653767,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This combination of username and password is invalid. Please try again or request a new password.",
      "offset": 24
    }
  ],
  "location": "EMS.should_display_Message(String)"
});
formatter.result({
  "duration": 3486081545,
  "status": "passed"
});
});