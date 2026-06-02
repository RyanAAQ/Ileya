def cipher(word, shift):
    letters = "abcdefghijklmnopqrstuvwxyz"
    result = ""
    word = word.lower()

    for index in range(len(word)):
        letter = word[index]
        position = letters.index(letter)
        
        if position == -1:
            result += letter
        
        new_position = position + shift
        result += letters[new_position]
        
    return result

word = "hello"
shift = 3
print(cipher(word, shift))
