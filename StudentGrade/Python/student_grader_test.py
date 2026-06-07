from unittest import TestCase
from student_grader_function import *

class TestAllFunctions(TestCase):

    def test_that_the_total_score_is_accurate(self):
        score = [[23, 56]]
        student_index = 0
        actual = total_score(score, student_index)
        expected = 79
        self.assertEqual(actual, expected)

    def test_that_the_average_is_accurate(self):
        score = [[23, 56]]
        student_index = 0
        actual = total_average(score, student_index)
        expected = 79 / 2
        self.assertEqual(actual, expected)

    def test_that_the_psoition_of_each_student_is_calculated_and_is_accurate(self):
        score = [[23, 56], [45, 70]]
        student_index = 0
        actual = student_position(score, student_index)
        expected = 2
        self.assertEqual(actual, expected)

    def test_that_the_psoition_of_each_student_is_calculated_and_is_accurate_again(self):
        score = [[23, 56], [45, 70], [80, 20]]
        student_index = 2
        actual = student_position(score, student_index)
        expected = 2
        self.assertEqual(actual, expected)
