def total_score(score, student_index):
    return sum(score[student_index])

def total_average(score, student_index):
    num_subjects = len(score[student_index])
    if num_subjects == 0:
        return 0.0
    return total_score(score, student_index) / num_subjects

def student_position(score, student_index):
    target = total_score(score, student_index)
    rank = 1
    for current_student_score in score:
        if sum(current_student_score) > target:
            rank += 1

    return rank
