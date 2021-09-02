def solution(n, k, count):
    if n == 1:
        return count
    elif n % k == 0:
        return solution(n / k, k, count + 1)
    return solution(n - 1, k, count + 1)

print(solution(25, 3, 0))

