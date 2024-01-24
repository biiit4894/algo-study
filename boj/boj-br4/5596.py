min_info, min_math, min_science, min_english = map(int, input().split())
man_info, man_math, man_science, man_english = map(int, input().split())

S = min_info + min_math + min_science + min_english
T = man_info + man_math + man_science + man_english

if S >= T:
  print(S)
else:
  print(T)