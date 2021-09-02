n = list(map(int, input()))

result = 0

def isZeroOrOne(a):
    return a <= 1

def solution(result, a,b):
    if isZeroOrOne(a) or isZeroOrOne(b):
        result = a + b
    else: 
        result = a * b
    return result

result = solution(result, n[0], n[1])

for i in range(2, len(n)):
    print(result)
    result = solution(result, result, n[i])

print(result)
