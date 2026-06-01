function cipher(word, shift){

    let alphabet = "abcdefghijklmnopqrstuvwxyz";
    let result = "";

    for (let index = 0; index < word.length; index++){
    let letter = word[index];
        
    let position = alphabet.indexOf(letter);
        
    let newPosition = position + shift;
        
    result += alphabet[newPosition];
    }
    return result;
}

let word = "nigger"
let shift = 3

console.log(cipher(word, shift))

