alphabet = "abcdefghijklmnopqrstuvwxyz"
word = input()

for i in range(len(alphabet)):
  print(word.count(alphabet[i]), end=" ")