word = input()
new_word = ""

for c in word:
  if c.islower():
    c = c.upper()
  else:
    c = c.lower()
  new_word += c
  

print(new_word)