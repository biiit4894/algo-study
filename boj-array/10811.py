list = []
N, M = map(int, input().split())

for i in range(N):
  list.append(i + 1);

for i in range(M):
  i, j = map(int, input().split())
  # if i > j:
  #   tmp = i
  #   i = j
  #   j = tmp
  # if(j - i <= 1):
  #   tmp = list[i-1]
  #   list[i-1] = list[j-1]
  #   list[j-1] = tmp
  # else:
  new_list = list[i-1:j]
  new_list.reverse()
  # del list[i-1:j]
  # for k in range(i-1, j):
  #   list.insert(k, new_list[k])
  list[i-1:j] = new_list
  print(list)

res = ""
for i in range(N):
  # res = res + str(list[i]) + " "
  print(list[i], end=" ")
# 이건 print(*list) 또는 print(list[i], end=' ')도 가능

print(res)

  
