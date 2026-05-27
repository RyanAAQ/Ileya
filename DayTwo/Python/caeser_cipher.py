def cipher(word, shift):
    letters = "abcdefghijklmnopqrstuvwxyz"
    result = ""
    
    for char in word.lower():
        if char in letters:
            index = (letters.index(char) + shift) % 26
            result += letters[index]
        else:
            result += char
            
    return result
    


