def get_duplicates(numbers):
    new = []
    duplicate = []
    for number in numbers:
        if number in new:
            if number not in duplicate:
                duplicate.append(number)
        else:
            new.append(number)

    return duplicate
    
def move_zeros_to_end(numbers):
    result = []
    for number in numbers:
        if number != 0:
            result.append(number)
            
    for number in numbers:
        if number == 0:
            result.append(number)
            
    return result
