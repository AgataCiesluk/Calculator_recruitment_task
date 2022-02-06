# Calculator_recruitment_task
Position of Java Developer

## Calculator
User picks the type of operation to perform: ADD, SUBTRACT, DIVIDE, MULTIPLY, provides values, units of inputs (m, NM, ft) and the unit of the result. All inputs should be added as parameters to the URL: http://localhost:8080/calculator.


Available units:
- m - Meters,
- NM - Nautical Miles,
- ft - Feet.

Available parameters:
val1, val1Unit, val2, val2Unit, resultUnit, operation.

Exemplary URL with parameters:
http://localhost:8080/calculator?val1=8000&val1Unit=m&val2=8000&val2Unit=ft&resultUnit=NM&operation=add
