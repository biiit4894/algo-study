a, b, c = map(int, input().split())

list = [a, b, c]
# print(list)
# new_list = list.sort()
# print(new_list)
list.sort()

for i in range(3):
  print(list[i], end=" ")