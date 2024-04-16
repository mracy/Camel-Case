CamelCase Converter
This Java program is a CamelCase converter that processes input lines to either split CamelCase strings into words or combine words into a CamelCase string. The program reads input lines in a specific format and outputs the results based on the specified operation and type.

Table of Contents
Usage
Input Format
Output Format
Examples
Error Handling
License
Usage
To run the program, provide input lines according to the specified format either from a file or directly in the console. The program reads the input and prints the processed results to the console.

shell
Copy code
java Solution
Input Format
The program expects each line of input to be in the format:

php
Copy code
<operation>;<type>;<words>
<operation>: Specifies the operation to perform. It can be either:
"S": Split CamelCase string into words separated by spaces.
"C": Combine words into a single CamelCase string.
<type>: Specifies the type of conversion. It can be:
"M": Method format, producing a CamelCase string with "()" at the end if combining.
"C": Class format, producing a CamelCase string with the first letter capitalized.
"V": Variable format, producing a camel case string.
<words>: The CamelCase string to split or words to combine.
Output Format
The program prints the processed results directly to the console for each input line.

Examples
Here are some example input lines and their expected outputs:

Input: "S;M;camelCaseString()"
Output: "camel case string"

Input: "C;V;hello world"
Output: "helloWorld"

Error Handling
The program handles invalid input lines and prints an appropriate error message:

If the input line does not follow the expected format, the program prints an error message: "Invalid input format: <input line>".
If the operation or type is invalid, the program prints an error message: "Invalid operation: <operation>" or "Invalid type: <type>".
License
This project is licensed under the HIT License.

