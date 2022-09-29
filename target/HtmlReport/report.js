$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Feature to test login functionlity",
  "description": "",
  "id": "feature-to-test-login-functionlity",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "postive test validating login page",
  "description": "",
  "id": "feature-to-test-login-functionlity;postive-test-validating-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Intialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"https://rahulshettyacademy.com\" site",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on Login link in home page to land on Sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \"yonasshumet@gmail.com\" and \"Udemyplace.32\" and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify that user is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.intialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 5136183400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://rahulshettyacademy.com",
      "offset": 13
    }
  ],
  "location": "LoginSteps.navigate_to_site(String)"
});
formatter.result({
  "duration": 10318044100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_Login_link_in_home_page_to_land_on_Sign_in_page()"
});
formatter.result({
  "duration": 3565649200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yonasshumet@gmail.com",
      "offset": 13
    },
    {
      "val": "Udemyplace.32",
      "offset": 41
    }
  ],
  "location": "LoginSteps.user_enters_and_and_logs_in(String,String)"
});
formatter.result({
  "duration": 460106600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verify_that_user_is_successfully_logged_in()"
});
formatter.result({
  "duration": 5154051500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#search\\-courses\"}\n  (Session info: chrome\u003d93.0.4577.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SHUMET\u0027, ip: \u0027192.168.0.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 93.0.4577.63 (ff5c0da2ec0ad..., userDataDir: C:\\Users\\yonas\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62806}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: cdd7af11387d5165739ff2085bd6900c\n*** Element info: {Using\u003did, value\u003dsearch-courses}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageObjects.PortalHomePage.getSearchBox(PortalHomePage.java:22)\r\n\tat stepsDefinitions.LoginSteps.verify_that_user_is_successfully_logged_in(LoginSteps.java:48)\r\n\tat ✽.Then Verify that user is successfully logged in(Login.feature:8)\r\n",
  "status": "failed"
});
});