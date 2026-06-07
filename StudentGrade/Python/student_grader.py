from student_grader_function import *

students = int(input("Enter the number of students enrolled: "))
subjects = int(input("enter the number of subjects done: "))

scores = []

count = 0

while count < students:
    print(f"\nStudent {count + 1}")

    student_score = []

    index = 0
    while index < subjects:
        current_score = int(input(f"Enter the score for SUB {index + 1}:  "))

        if current_score < 0 or current_score > 100:
            print("Invalid Score, Try Again")

        else:
            student_score.append(current_score)
            index = index + 1

    scores.append(student_score)

    print("Saving....................")
    print("Saved successfully")
    count = count + 1

print("\n=========================================")
print("STUDENT\t\t", end="")
index = 0

for index in range(subjects):
    print(f"SUB{index + 1}\t", end="")

print("TOT\tAVG\tPOS")

for index in range(len(scores)):
    print(f"Student {index + 1}:\t", end="")

    for counter in range(len(scores[index])):
        print(f"{scores[index][counter]}\t", end="")

    total = total_score(scores, index)
    average = total_average(scores, index)
    position = student_position(scores, index)

    print(f"{total}\t{average:.2f}\t{position}")
print("=========================================")
