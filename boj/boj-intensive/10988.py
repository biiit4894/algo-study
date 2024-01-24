S = input()
num = 1

for i in range(len(S)):
  if S[i] != S[len(S) - i - 1]:
    num = 0

print(num)