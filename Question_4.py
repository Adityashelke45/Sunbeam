marks = []
for i in range(5):
    marks.append(int(input("Enter the marks: ")))

grade = []
for i in range(5):
    if(marks[i] >= 90):
        grade.append("Excellent")
    elif(marks[i] < 90 and marks[i] >= 80):
        grade.append("A")
    elif(marks[i] < 80 and marks[i] >= 70):
        grade.append("B")
    elif(marks[i] < 70 and marks[i] >= 60):
        grade.append("C")
    elif(marks[i] < 60 and marks[i] >= 50):
        grade.append("D")
    else:
        grade.append("Fail")
for i in range(5):
    print(marks[i],"=",grade[i])

sum = sum(marks)
average = sum/5
print("Average",average)
if(average >= 90):
    grade = "Excellent"
elif(average < 90 and average >= 80):
    grade = "A"
elif(average < 80 and average >= 70):
    grade = "B"
elif(average < 70 and average >= 60):
    grade = "C"
else:
    grade = "Fail"

print("Marks are",marks)
print("Grade are: ",grade)