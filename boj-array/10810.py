N, M = map(int, input().split())
list = []
result = ""

for _ in range(N):
    list.append(0)

for _ in range(M):
    i, j, k = map(int, input().split())
    for l in range(i - 1, j):
        list.remove(list[l])
        list.insert(l, k)

for i in range(len(list)):
    result = result + str(list[i]) + " "
print("result: " + result + "입니다")

# print(list)
# 바구니 1 2 3 4 5
#    공 3 3
#           4 4
#       1 1 1 1
#         2
#   결과 1 2 1 1 0

# 5 4
# 1 3 3
# 2 5 1
# 3 3 2
# 3 4 4

# 1 2 3 4 5
# 3 3 3
#   1 1 1 1
#     2
#     4 4
# 3 1 4 4 1
