N = 5
array = []
row_lengths = []
result_str = ""

for row in range(N):
  row = input()
  array.append(row)
  row_lengths.append(len(row))

for col in range(max(row_lengths)):
  for row in range(N):
    if col < row_lengths[row]:
      result_str += array[row][col]

print(result_str)
