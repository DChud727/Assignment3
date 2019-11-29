The problem you’re solving/solved:

Using an input, and counting each instance of every unique word used.

______________________________________________________________________________
The solution briefly described:

Converted the input into a data structure and removed any common stop words
from the final output.

______________________________________________________________________________
What you used in the solution

Using a hashmap to convert the input, giving each word a key and having its
value increase for each count. Added another map for the stop words and used
to compare the lists removing all elements from the initial map.

______________________________________________________________________________
Any instructions on installation and building the code

input.txt, stopword.txt, WordFrerquency.java must be in same folder.

______________________________________________________________________________
Example of input and output, and example of running code

  %  input.txt
 Frog Frog Frog...
 dog dog dog...

 % wordFrequency < input.txt

100: frog
 94: dog