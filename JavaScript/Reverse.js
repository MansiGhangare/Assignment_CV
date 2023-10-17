// Take a sentence as an input and reverse every word in that sentence. 
// Example - This is a sunny day > shiT si a ynnus yad.

const readline = require('readline');

const rl = readline.createInterface
(
    {
        input: process.stdin,
        output: process.stdout
    }
);

function reverseWords(sentence)
{
    const words = sentence.split(" ");
    const reverseWords = words.map(word => word.split("").reverse().join(""));
    const reversedSentence = reverseWords.join(" ");
    return reversedSentence;

}

rl.question("enter a sentence: ", (inputSentence) => 
{
const reversedSentence = reverseWords(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);
rl.close();
});