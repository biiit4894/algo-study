# 4 - 1이 될 때까지
n, k = map(int, input().split())

count = 0
while n >= k :
    while n % k != 0:
        n -= 1
        count += 1
    n = n // k
    count += 1

# 다 나누고 더 나눌 수 없는 수를 1을 뺌
while n > 1:
    n -= 1
    count += 1
    # 앞의 while문 내부로 이동시킬 경우, 가령 25 5를 입력하면
    # 25 -> 5 -> 4 -> 3 -> 2 -> 1 결과는 5가 나옴.

print(count)

