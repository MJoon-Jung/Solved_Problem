# 모험가 N명
# 공포도가 X인 모험가는 반드시 X명 이상
# 최대 몇 개의 모험가 그룹을 만들 수 있는가
# N명의 모험가에 대한 정보 주어짐
# 여행을 떠날 수 있는 그룹 수의 최댓값
# ex) N = 5 / input 2 3 1 2 2 
# 1 2 3 , 2 2 / 2그룹 
# 모든 모험가를 특정한 그룹에 넣을 필요x 

li = list(map(int, input()))
# li = [2,3,1,2,2]
li.sort()

group = 0
member = 0

for i in li:
    member += 1
    if member >= i:
        group += 1
        member = 0
print(group)
