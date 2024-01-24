alphabet = ['', 'ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
S = list(input())
time = 0

for i in S:
  for j in alphabet:
    if i in j:
      time = time + alphabet.index(j) + 2

print(time)
