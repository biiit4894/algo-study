N, M = map(int, input().split())
list = []
for i in range(0, N):
    globals()["basket{}".format(i + 1)] = i + 1

for _ in range(M):
    i, j = map(int, input().split())
    tmp = globals()["basket" + str(i)]
    globals()["basket" + str(i)] = globals()["basket" + str(j)]
    globals()["basket" + str(j)] = tmp


for i in range(0, N):
    list.append(globals()["basket" + str(i + 1)])

print(*list)
