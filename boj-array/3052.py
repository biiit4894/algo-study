list = []
bin = []
count = 0

for i in range(10):
  N = int(input())
  list.append(N % 42)

for i in list:
  if i not in bin:
    bin.append(i)

print(len(bin))