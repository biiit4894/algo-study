# 3 숫자 카드 게임
n, m = map(int, input().split())

result = 0
for i in range(n):
    data = list(map(int, input().split()))
    min_value = 0
    for j in range(m):
        if data[j] <= data[j - 1]:
            min_value = data[j]
    if(min_value >= result):
        result = min_value
print(result)