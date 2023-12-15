N = 20
total_gpa = 0
sum = 0

gpa_per_grade = {
  "A+": 4.5, 
  "A0": 4.0,
  "B+": 3.5,
  "B0": 3.0,
  "C+": 2.5,
  "C0": 2.0,
  "D+": 1.5,
  "D0": 1.0,
  "F": 0.0
}

for i in range(N):
  subject, gpa, grade = input().split()
  gpa = float(gpa)
  if(grade == "P"):
    continue
  else:
    total_gpa += gpa
    sum += gpa * gpa_per_grade[grade]

print("{:.6f}".format(sum/total_gpa))