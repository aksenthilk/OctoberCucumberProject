$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login",
  "description": "",
  "id": "free-crm-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11799628803,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the Free CRM HP",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.user_is_on_the_Free_CRM_HP()"
});
formatter.result({
  "duration": 339715493,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Features page validation",
  "description": "",
  "id": "free-crm-login;features-page-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User clicks on Features link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User navigates to Features page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks on the Free CRM Logo",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User lands on the HP",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Closes the HP",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.user_clicks_on_Features_link()"
});
formatter.result({
  "duration": 29699468620,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.user_navigates_to_Features_page()"
});
formatter.result({
  "duration": 23049643,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.user_clicks_on_the_Free_CRM_Logo()"
});
formatter.result({
  "duration": 3890324867,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.user_lands_on_the_HP()"
});
formatter.result({
  "duration": 18144343,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.closes_the_HP()"
});
formatter.result({
  "duration": 148758,
  "status": "passed"
});
formatter.after({
  "duration": 102964678,
  "status": "passed"
});
formatter.before({
  "duration": 8347382853,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the Free CRM HP",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefs.user_is_on_the_Free_CRM_HP()"
});
formatter.result({
  "duration": 62092925,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Sign Up page validations",
  "description": "",
  "id": "free-crm-login;sign-up-page-validations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "User clicks on Pricing link",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User navigates to Pricing page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User clicks HomePage link",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User lands on the HP",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Closes the HP",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.user_clicks_on_Pricing_link()"
});
formatter.result({
  "duration": 7998744179,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.user_navigates_to_Pricing_page()"
});
formatter.result({
  "duration": 13180751,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.user_clicks_HomePage_link()"
});
formatter.result({
  "duration": 3660965345,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.user_lands_on_the_HP()"
});
formatter.result({
  "duration": 15106218,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.closes_the_HP()"
});
formatter.result({
  "duration": 50363,
  "status": "passed"
});
formatter.after({
  "duration": 109398134,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM User Login",
  "description": "",
  "id": "free-crm-user-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8523040083,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid user credentials",
  "description": "",
  "id": "free-crm-user-login;login-with-valid-user-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on the Free CRM HP",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User submits valid user name and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User navigates to Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Closes the HP",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefs.user_is_on_the_Free_CRM_HP()"
});
formatter.result({
  "duration": 57654885,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.user_submits_valid_user_name_and_password()"
});
formatter.result({
  "duration": 9819842707,
  "status": "passed"
});
formatter.match({
  "location": "stepDefs.user_navigates_to_Dashboard_page()"
});
formatter.result({
  "duration": 22174812,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cCRMPRO[0o]\u003e but was:\u003cCRMPRO[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.sen.stepDefinition.stepDefs.user_navigates_to_Dashboard_page(stepDefs.java:115)\r\n\tat ✽.Then User navigates to Dashboard page(Login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefs.closes_the_HP()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 912595743,
  "status": "passed"
});
});