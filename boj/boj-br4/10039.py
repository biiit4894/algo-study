n = 5
score_sum = 0

for i in range(n):
  score = int(input())
  if score < 40:
    score = 40
  score_sum += score
print(score_sum // n)