def factorial(n):
  result = 1
  if n >= 1:
    result = n * factorial(n-1)
    return result
  elif n == 0:
    return result

n = int(input())

print(factorial(n))