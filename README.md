# ppkwu_lab3
## Documentation API

### Description
API to display string statistics like number of digits, uppercase, lowercase, special chars in JSON, XML or CSV format.

|type|endpoint|parameter|
|---|---|---|
|GET|/api/json/string|str|
|GET|/api/xml/string|str|
|GET|/api/csv/string|str|

### API call, JSON format
Example call for str parameter:<br>
al4/A3zSa9ot_tyOx-ek*
```
http://localhost:8081/api/json/string?str=al4/A3zSa9ot_tyOx-ek*
```
### Output Result
Example JSON response
```json
{
  "str": "al4/A3zSa9ot_tyOx-ek*",
  "numberOfDigits": 3,
  "numberOfSpecialChars": 4,
  "numberOfLowercase": 11,
  "numberOfUppercase": 3
}
```

### API call, XML format
Example call for str parameter:<br>
al4/A3zSa9ot_tyOx-ek*
```
http://localhost:8081/api/xml/string?str=al4/A3zSa9ot_tyOx-ek*
```
### Output Result
Example XML response
```xml
<data>
    <str>al4/A3zSa9ot_tyOx-ek*</str>
    <numberOfUppercase>3</numberOfUppercase>
    <numberOfSpecialChars>4</numberOfSpecialChars>
    <numberOfLowercase>11</numberOfLowercase>
    <numberOfDigits>3</numberOfDigits>
</data>
```

### API call, CSV format
Example call for str parameter:<br>
al4/A3zSa9ot_tyOx-ek*
```
http://localhost:8081/api/csv/string?str=al4/A3zSa9ot_tyOx-ek*
```
### Output Result
Example CSV response
```
str,numberOfUppercase,numberOfSpecialChars,numberOfLowercase,numberOfDigits
al4/A3zSa9ot_tyOx-ek*,3,4,11,3
```

### API call, TXT format
Example call for str parameter:<br>
al4/A3zSa9ot_tyOx-ek*
```
http://localhost:8081/api/txt/string?str=al4/A3zSa9ot_tyOx-ek*
```
### Output Result
Example TXT response
```
str: al4/A3zSa9ot_tyOx-ek*
numberOfUppercase: 3
numberOfSpecialChars: 4
numberOfLowercase: 11
numberOfDigits: 3
```