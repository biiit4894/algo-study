vowel = "AaEeIiOoUu"
while True:
  vowel_count = 0
  sentence = input()
  if(sentence == "#"):
    break
  for i in range(len(vowel)):
    vowel_count += sentence.count(vowel[i])
  print(vowel_count)

