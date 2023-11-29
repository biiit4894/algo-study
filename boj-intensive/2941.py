str = input()
croatian = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

for i in croatian:
  str = str.replace(i, "*")

print(len(str))
