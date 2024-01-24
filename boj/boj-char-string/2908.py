A, B = input().split()

A = list(A)
B = list(B)

A.reverse()
B.reverse()

sangsu_a = ""
sangsu_b = ""

for i in range(len(A)):
  sangsu_a += A[i]

for i in range(len(B)):
  sangsu_b += B[i]

if(int(sangsu_a) > int(sangsu_b)):
  print(sangsu_a)
else:
  print(sangsu_b)