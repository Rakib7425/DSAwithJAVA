function correctMistake(line, incorrectWord, toBeReplacedWithChar) {
    // write code here
    // return the output , do not use console.log here
    
    return line.replaceAll(incorrectWord, toBeReplacedWithChar);
}

/*
JS String - 2
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Implement the function correctMistake, which should take a string which will be the string we want to change the mistake in, and another string which is the wrong word or character, and third string which is the correct version and return its result as a string with mistakes (Use JS In built functions)
Input
Function will take 3 args,
1) line arg which is the string with mistakes
2) incorrectWord(or char) which is the char/word which needs to be replaced
3) toBeReplacedWithChar which is a string
Output
Function will return string with corrected mistakes
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
console. log(correctMistake("Hi World world", "world", "of coding")) // prints "Hi World of coding" since world is replaced by empty char

console. log(correctMistake("hi hi hi", "hi", "hello")) // prints "hello hello hello"
*/