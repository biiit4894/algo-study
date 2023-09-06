# 3 숫자 카드 게임
n, m = map(int, input().split())

result = 0
for i in range(n):
    data = list(map(int, input().split()))
    for j in range(m):
        if data[j] <= data[j - 1]:
            result = data[j]
print(result)