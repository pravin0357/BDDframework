$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EmployeeReportsCRUD.feature");
formatter.feature({
  "line": 1,
  "name": "Employee Reports CRUDS and Search Operations",
  "description": "",
  "id": "employee-reports-cruds-and-search-operations",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "I am able to add edit search generate and delete  the employee report",
  "description": "",
  "id": "employee-reports-cruds-and-search-operations;i-am-able-to-add-edit-search-generate-and-delete--the-employee-report",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@DryRun1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to PIM after log in with Admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add Custom Report with below ReportName as \u003c\"ReportName\"\u003e and below Display field group and field names",
  "rows": [
    {
      "cells": [
        "Displayfieldgroup",
        "Personal"
      ],
      "line": 7
    },
    {
      "cells": [
        "Field1Title",
        "Employee Id"
      ],
      "line": 8
    },
    {
      "cells": [
        "Field2Title",
        "Employee First Name"
      ],
      "line": 9
    },
    {
      "cells": [
        "Field3Title",
        "Employee Last Name"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I  verify Report is searched in the Report with ReportName as \u003c\"ReportName\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I verify the Report is generated with below fields",
  "rows": [
    {
      "cells": [
        "Field1Title",
        "Employee Id",
        ""
      ],
      "line": 13
    },
    {
      "cells": [
        "Field2Title",
        "Employee First Name",
        ""
      ],
      "line": 14
    },
    {
      "cells": [
        "Field3Title",
        "Employee First Name",
        "Employee Last Name"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "employee-reports-cruds-and-search-operations;i-am-able-to-add-edit-search-generate-and-delete--the-employee-report;",
  "rows": [
    {
      "cells": [
        "ReportName"
      ],
      "line": 18,
      "id": "employee-reports-cruds-and-search-operations;i-am-able-to-add-edit-search-generate-and-delete--the-employee-report;;1"
    },
    {
      "cells": [
        "SampleReport2"
      ],
      "line": 19,
      "id": "employee-reports-cruds-and-search-operations;i-am-able-to-add-edit-search-generate-and-delete--the-employee-report;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 152600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "I am able to add edit search generate and delete  the employee report",
  "description": "",
  "id": "employee-reports-cruds-and-search-operations;i-am-able-to-add-edit-search-generate-and-delete--the-employee-report;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@DryRun1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to PIM after log in with Admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add Custom Report with below ReportName as \u003c\"ReportName\"\u003e and below Display field group and field names",
  "rows": [
    {
      "cells": [
        "Displayfieldgroup",
        "Personal"
      ],
      "line": 7
    },
    {
      "cells": [
        "Field1Title",
        "Employee Id"
      ],
      "line": 8
    },
    {
      "cells": [
        "Field2Title",
        "Employee First Name"
      ],
      "line": 9
    },
    {
      "cells": [
        "Field3Title",
        "Employee Last Name"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I  verify Report is searched in the Report with ReportName as \u003c\"ReportName\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I verify the Report is generated with below fields",
  "rows": [
    {
      "cells": [
        "Field1Title",
        "Employee Id",
        ""
      ],
      "line": 13
    },
    {
      "cells": [
        "Field2Title",
        "Employee First Name",
        ""
      ],
      "line": 14
    },
    {
      "cells": [
        "Field3Title",
        "Employee First Name",
        "Employee Last Name"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeCRUD.navigate_to_PIM_after_log_in_with_Admin_user()"
});
formatter.write("Starting orange HRM log in page ");
formatter.embedding("image/png", "embedded0.png");
formatter.write("Logging in to the OrangeHRM Applciation ");
formatter.write(" Error while waiting for clicking on Emmenet ");
formatter.write(" Error while waiting for clicking on Emmenet ");
formatter.write(" Error while waiting for clicking on Emmenet ");
formatter.write(" Error while waiting for clicking on Emmenet ");
formatter.embedding("image/png", "embedded1.png");
formatter.write("Navigating to PIM Page ");
formatter.write(" Error while waiting for clicking on Emmenet ");
formatter.write(" Error while waiting for clicking on Emmenet ");
formatter.write(" Error on fetching  the text in element after wating !");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 16732746400,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.write("Closing the application");
formatter.after({
  "duration": 168500,
  "status": "passed"
});
});