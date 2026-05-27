import math

def even_and_odd(numbers):
    even = []
    odd = []
    for number in numbers:
        if number % 2 == 0:
            even.append(number)
        else:
            odd.append(number)
            
    return [even, odd]

def is_palindrome(numbers):
    if numbers == numbers[::-1]:
        return True
        
    return False


def get_perfect_squares(numbers):
    result = []
    for number in numbers:
        if number >= 0:
            square_root = math.sqrt(number)
            if square_root * square_root == number:
                result.append(number)
    return result
    
def get_perfect_squares_to_negative(numbers):
    result = []
    for number in numbers:
        if number >= 0:
            square_root = math.sqrt(number)
            if square_root * square_root != number:
                result.append(-1)
            else:
                result.append(number)    
            
    return result
