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
  "duration": 9867219243,
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
