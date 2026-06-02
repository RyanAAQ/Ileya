function cipher(word, shift){

    let letters = "abcdefghijklmnopqrstuvwxyz";
    let result = "";
    word = word.toLowerCase()

    for (let index = 0; index < word.length; index++){
    let letter = word.charAt(index);
            
    let position = letters.indexOf(letter);
            
    if (position == -1){
        result += letter;
        }
    else{
    let newPosition = (position + shift) % 26;
    result += letters.charAt(newPosition);
            }
        }
        return result;
    }

console.log(cipher("hello", 3))

