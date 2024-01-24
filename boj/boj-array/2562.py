# 막 풀기
num1 = int(input())
num2 = int(input())
num3 = int(input())
num4 = int(input())
num5 = int(input())
num6 = int(input())
num7 = int(input())
num8 = int(input())
num9 = int(input())
list = [num1, num2, num3, num4, num5, num6, num7, num8, num9]
max = max(list)

print(max)
print(list.index(max) + 1)

# 이건 아니다...싶어서 다른 풀이
list = [int(input()) for i in range(9)]
print(max(list))
print(list.index(max(list)) + 1)