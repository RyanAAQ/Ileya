students = int(input("Enter number of students enrolled: "))
quiz = int(input("Enter number of quizzes taken: "))
score = [[0 for _ in range(students)], [0 for _ in range(quiz)]]

count = 0

while count < students:
    print("\nStudent " + str(count + 1))
    for index in range(quiz):
        current_score = int(input("Enter the score for Qz" + str(index + 1) + ": "))
        
        if current_score < 0 or current_score > 100:
            print("\nInvalid score, Try again")
            index -= 1
            
        else:
            score[count][index] = current_score
        
    count += 1
    
print("\n ===== Quiz Grade Report =====")
for index in range(0, len(score)):
    sums = 0
    print("Student " + str(index) + ":   ")
    
    for counter in range(0, len(score[index])):
        quiz_score = score[index][counter]
        print(str(quiz_score) + "\t")
        sums += quiz_score
        
    average = float(sums) / quiz
    print(f"{average:.2f}")
    
print("Quiz Average:  ")
for counts in range(0, quiz):
    quiz_sum = 0
    for counter in range(0, students):
        quiz_sum += score[counts][counter]
        
    quiz_average = float(quiz_sum) / students
    print(f"{quiz_average:.2f}")
    
print()
