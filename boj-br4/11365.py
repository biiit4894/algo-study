while True:
  password = input()
  reverse_password = ""
  if password == "END":
    break
  for i in range(len(password)):
    reverse_password = password[i] + reverse_password
  print(reverse_password)

