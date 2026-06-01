questions_a = ["expend energy, enjoy groups", "Interpret literally", "logical, thinking, questioning", "organized, orderly", "more outgoing, think out loud", "practical, realistic, experiential", "candid, straight forward, frank", "plan, schedule", "seek many tasks, interact with others", "standard, usual, conventional", "firm, tend to criticize", "regulated, structured", "external, communicative", "focus on here-and-now", "tough-minded, just", "preparation, plan ahead", "active, initiate", "facts, things, what is", "matter of fact, issue-oriented", "control, govern"]

questions_b = ["conserve energy, enjoy one-on-one", "look for meaning and possibilities", "empathetic, feeling, accommodating", "flexible, adaptable", "more reserved, think to yourself", "imaginative, innovative, theoretical", "tactful, kind, encouraging", "unplanned, spontaneous", "seek private, solitary activities", "different, novel, unique", "gentle, tend to appreciate", "easy-going, live and let live", "internal, reticent, keep to yourself", "look to the future, big picture", "tender-hearted, merciful", "go with the flow, adapt as you go", "reflective, deliberate", "ideas, dreams, what could be", "sensitive, people-oriented", "latitude, freedom"]

answers = []

name = input("What is your name? ")
print("Hello " + name + " Answer the questions with either A or B.\n")

for index in range(20):
    print("Q" + str(index + 1) + ":")
    print("A. " + questions_a[index])
    print("B. " + questions_b[index])

    while True:
        ans = input("  Your answer: ").upper()
        if ans == "A" or ans == "B":
            answers.append(ans)
            break
        else:
            print("  Expected A or B as Response")
            print("  I know this is an error, Please retry again")
    print()


ei = 0
if answers[0]  == "A":
    ei = ei + 1
if answers[4]  == "A":
    ei = ei + 1
if answers[8]  == "A":
    ei = ei + 1
if answers[12] == "A":
    ei = ei + 1
if answers[16] == "A":
    ei = ei + 1

sn = 0
if answers[1]  == "A":
    sn = sn + 1
if answers[5]  == "A":
    sn = sn + 1
if answers[9]  == "A":
    sn = sn + 1
if answers[13] == "A":
    sn = sn + 1
if answers[17] == "A":
    sn = sn + 1

tf = 0
if answers[2]  == "A":
    tf = tf + 1
if answers[6]  == "A":
    tf = tf + 1
if answers[10] == "A":
    tf = tf + 1
if answers[14] == "A":
    tf = tf + 1
if answers[18] == "A":
    tf = tf + 1

jp = 0
if answers[3]  == "A":
    jp = jp + 1
if answers[7]  == "A":
    jp = jp + 1
if answers[11] == "A":
    jp = jp + 1
if answers[15] == "A":
    jp = jp + 1
if answers[19] == "A":
    jp = jp + 1

if ei >= 3:
    letter1 = "E"
else:
    letter1 = "I"

if sn >= 3:
    letter2 = "S"
else:
    letter2 = "N"

if tf >= 3:
    letter3 = "T"
else:
    letter3 = "F"

if jp >= 3:
    letter4 = "J"
else:
    letter4 = "P"

result = letter1 + letter2 + letter3 + letter4

print("========== YOUR RESPONSES ==========")
for index in range(20):
    if answers[index] == "A":
        print(f"Qustion{index + 1}: A ->  + questions_a[index]")
    else:
        print(f"Qustion{index + 1}: B ->  {questions_b[index]}")

print("\n" + name + ", your MBTI type is: " + result)
