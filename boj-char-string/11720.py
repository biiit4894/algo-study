num = int(input())
char = list(map(int, input()))

sum = 0
for i in range(len(char)):
  sum += char[i]

print(sum)