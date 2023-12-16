N, M = 9, 9
array = []
row_num = 0
col_num = 0
max = 0

for row in range(N):
  row = list(map(int, input().split()))
  array.append(row)

for row in range(N):
  for col in range(M):
    if array[row][col] >= max:
      max = array[row][col]
      row_num = row + 1
      col_num = col + 1

print(max)
print(row_num, col_num)