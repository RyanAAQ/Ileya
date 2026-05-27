from unittest import TestCase
from level_one import *

class TestAllTheWorkingFunctions(TestCase):
    
    def test_the_result_return_two_arrays_with_even_and_odd_seperated(self):
        numbers = [1, 2, 3, 4, 5 ,6, 7, 8, 9, 10]
        actual = even_and_odd(numbers)
        expected = [[2, 4, 6, 8, 10], [1, 3, 5, 7, 9]]
        self.assertEqual(actual, expected)
        
    def test_that_the_palindrome_returnst_correct_result(self):
        numbers = [1, 2, 3, 2, 1]
        actual = is_palindrome(numbers)
        expected = True
        self.assertEqual(actual, expected)
        
    def test_that_the_result_is_only_the_perfect_square(self):
        numbers = [1, 2, 3, 4, 5 ,6, 7, 8, 9, 10]
        actual = get_perfect_squares(numbers)
        expected = [1, 4, 9]
        self.assertEqual(actual, expected)
        
    def test_that_the_result_is_negative_for_the_non_perfect_square(self):
        numbers = [1, 2, 3, 4, 5 ,6, 7, 8, 9, 10]
        actual = get_perfect_squares_to_negative(numbers)
        expected = [1, -1, -1, 4, -1, -1, -1, -1, 9, -1]
        self.assertEqual(actual, expected)
