$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/AddNumbersUsingTables.feature");
formatter.feature({
  "line": 1,
  "name": "Addition of integers using Data tables",
  "description": "",
  "id": "addition-of-integers-using-data-tables",
  "keyword": "Feature"
});
formatter.before({
  "duration": 224921,
  "status": "passed"
});
formatter.before({
  "duration": 60751,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Perform addition of integers using data tables",
  "description": "",
  "id": "addition-of-integers-using-data-tables;perform-addition-of-integers-using-data-tables",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Performing Addition of integers",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "The dataset integers to be added are",
  "rows": [
    {
      "cells": [
        "123",
        "456"
      ],
      "line": 5
    },
    {
      "cells": [
        "321",
        "543"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The sum of the dataset integers",
  "rows": [
    {
      "cells": [
        "123",
        "456"
      ],
      "line": 8
    },
    {
      "cells": [
        "321",
        "543"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.There_are_two_integers()"
});
formatter.result({
  "duration": 205367316,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.performIntegerAdditionFromDataTable(DataTable)"
});
formatter.result({
  "duration": 5902765,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.addAndPrintDataSetIntegers(DataTable)"
});
formatter.result({
  "duration": 234304,
  "status": "passed"
});
formatter.after({
  "duration": 162024,
  "status": "passed"
});
formatter.after({
  "duration": 105529,
  "status": "passed"
});
});