def cipher(word, shift):
    letters = "abcdefghijklmnopqrstuvwxyz"
    result = ""

    for index in range(len(word)):
        letter = word[index]
        position = alphabet.index(letter)
        
        new_position = position + shift
        result += letters[new_position]
        
    return result

word = "nigger"
shift = 3
print(cipher(word, shift))
