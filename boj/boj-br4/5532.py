vacation = int(input()) # 방학 일수
kor_total_page = int(input()) # 국어 총 페이지
math_total_page = int(input()) # 수학 총 페이지
kor_max_page = int(input()) # 하루에 국어 최대 c 페이지
math_max_page = int(input()) # 하루에 수학 최대 d 페이지

kor_study_day = 0
math_study_day = 0

if kor_total_page % kor_max_page != 0:
  kor_study_day = kor_total_page // kor_max_page + 1
else:
  kor_study_day = kor_total_page // kor_max_page

if math_total_page % math_max_page != 0:
  math_study_day = math_total_page // math_max_page + 1
else:
  math_study_day = math_total_page // math_max_page

if kor_study_day >= math_study_day:
  print(vacation - kor_study_day)
else:
  print(vacation - math_study_day)


