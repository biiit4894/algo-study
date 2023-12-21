n = 5
burger_min = 10000
drink_min = 10000

for i in range(n):
  price = int(input())
  if i < 3:
    if price <= burger_min:
      burger_min = price
    else:
      continue
  else:
    if price <= drink_min:
      drink_min = price
    else:
      continue

print(burger_min + drink_min - 50)

