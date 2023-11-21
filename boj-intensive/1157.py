S = list(input().lower())

counter = {}

for char in S:
  if char in counter:
    counter[char] += 1
  else:
    counter[char] = 1

tmp = [k for k,v in counter.items() if max(counter.values()) == v]


if(len(tmp) >= 2):
  print("?")
else:
  print(tmp[0].upper())


