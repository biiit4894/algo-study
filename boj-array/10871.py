N, X = map(int, input().split())
array = list(map(int, input().split()))
result = ""

for i in range(len(array)):
    if(array[i] < X):
        result = result + str(array[i]) + " "
print(result)