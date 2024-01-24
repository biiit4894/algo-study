# def factorial(n):
#   result = 1
#   if n >= 1:
#     result = n * factorial(n-1)
#     return result
#   elif n == 0:
#     return 1

# n = int(input())
# print(factorial(n))



# # def factorial(n):
# #   print("n in factorial: ", n)
# #   result = 1
# #   if n >= 1:
# #     result = n * factorial(n-1)
# #     print("here:", result)
# #     return result
# #   elif n == 0:
# #     print("n: ", n)
# #     result = 1
# #     print("here2:", result)
# #     return result

# short = ["M", "W", "C", "A", "$"]
# full = ["MatKor", "WiCys", "CyKor", "AlKor", "$clear"]

# print(full[short.index(input())])

n = int(input())

print(n * 0.78)
print(n * (1 - 0.2 * 0.22))
print("{:.0f}".format(n * 0.78), "{:.0f}".format(n * (1 - 0.2 * 0.22)))