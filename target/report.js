$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature of EMS Merchant Portal",
  "description": "",
  "id": "login-feature-of-ems-merchant-portal",
  "keyword": "Feature"
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
  "duration": 6990714892,
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
  "duration": 1782917623,
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
  "duration": 3525508615,
  "status": "passed"
});
formatter.match({
  "location": "EMS.login_Should_Fail()"
});
formatter.result({
  "duration": 3447064108,
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
  "duration": 3479893284,
  "status": "passed"
});
});