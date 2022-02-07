# Calculator_recruitment_task
Position of Java Developer

## Calculator
User picks the type of operation to perform: ADD, SUBTRACT, DIVIDE, MULTIPLY, provides values, units of inputs (m, NM, ft) and the unit of the result. All inputs should be added as parameters to the URL: http://localhost:8080/calculator.


Available units:
- m - Meters,
- NM - Nautical Miles,
- ft - Feet.

Available parameters:
- val1 (double),
- val1Unit (m, ft, NM),
- val2 (double),
- val2Unit (m, ft, NM),
- resultUnit (m, ft, NM),
- operation (add, subtract, multiply, divide).

Exemplary URL with parameters and the response:
```
http://localhost:8080/calculator?val1=8000&val1Unit=m&val2=8000&val2Unit=ft&resultUnit=NM&operation=add
Sum = 5,64 NM
```
## How to start using app?
Firstly, connect to the server (I use Tomcat Server and InteliiJ IDE). Secondly, open calculator.html in your browser and click on hyperlink. It will take you to the exemplary URL with parameters and you will see the server response. Modify parameters as you wish and enjoy seeing the calculated result.
