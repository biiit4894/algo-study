import math

def solution(price):
    answer = 0
    if 100000 <= price < 300000:
        answer = math.trunc(price * 0.95)
    elif 300000 <= price < 500000:
        answer = math.trunc(price * 0.9)
    elif 500000 <= price:
        answer = math.trunc(price * 0.8)
    return answer

price = int(input())
print(solution(price))
