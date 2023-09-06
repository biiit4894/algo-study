# n = 1260
# count = 0
#
# # 큰 단위의 화폐부터 차례대로 확인
# coin_types = [500, 100, 50, 10]
#
# for coin in coin_types:
#     count += n // coin  # 해당 화폐로 거슬러 줄 수 있는 동전의 개수 세기
#     n %= coin
#
# print(count)

# 배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 동빈이의 큰 수의 법칙에 따른 결과를 출력하시오.

# 입력 조건
# 첫째 줄에 N(2<= N <= 1000), M(1 <= M <= 10,000), K(1 <= K <= 10,000)의 자연수가 주어지며,
# 각 자연수는 공백으로 구분한다.

# 둘째 줄에 N 개의 자연수가 주어진다. 각 자연수는 공백으로 구분한다.
# 단, 각각의 자연수는 1 이상 10,000 이하의 수로 주어진다.
# 입력으로 주어지는 K는 항상 M보다 작거나 같다.

# 출력 조건
# 첫째 줄에 동빈이의 큰 수의 법칙에 따라 더해진 답을 출력한다.
# for item in numbers:
#     for j in range(0, k):
#         add += item
#         print(item, add)
#         count += 1
#         print(count)
#         if count > m:
#             break

# print(add)

# # N, M, K를 공백으로 구분하여 입력받기
# n, m, k = map(int, input().split())
# # N개의 수를 공백으로 구분하여 입력받기
# data = list(map(int, input().split()))
#
# data.sort() # 입력받은 수를 정렬하기
# first = data[n - 1] # 가장 큰 수
# second = data[n - 2] # 두 번째로 큰 수
#
# result = 0
#
# while True:
#     for i in range(k): # 가장 큰 수를 K번 더하기
#         if m == 0: # m이 0이라면 반복문 탈출
#             break
#         result += first
#         m -= 1 # 더할 때마다 1씩 빼기
#     if m == 0: # m이 0이라면 반복문 탈출
#         break
#     result += second # 두 번째로 큰 수를 한 번 더하기
#     m -= 1 # 더할 때마다 1씩 빼기
#
# print(result) # 최종 답안 출력

# # N, M, K를 공백으로 구분하여 입력받기
# n, m, k = map(int, input().split())
# # N개의 수를 공백으로 구분하여 입력받기
# data = list(map(int, input().split()))
#
# data.sort() # 입력받은 수 정렬
# first = data[n - 1] # 가장 큰 수
# second = data[n - 2] # 두 번째로 큰 수
#
# # 가장 큰 수가 더해지는 횟수 계산
# count = int(m / (k + 1)) * k
# count += m % (k + 1)
#
# result = 0
# result += (count) * first # 가장 큰 수 더하기
# result += (m - count) * second # 두 번째로 큰 수 더하기
#
# print(result) # 최종 답안 출력

# 3 숫자 카드 게임
n, m = map(int, input().split())

result = 0
for i in range(n):
    data = list(map(int, input().split()))
    for j in range(m):
        if data[j] <= data[j - 1]:
            result = data[j]
print(result)