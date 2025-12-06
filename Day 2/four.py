def factors(n):
    '''Generate factors of n'''
    result = set()
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            result.add(i)
            result.add(n // i)
    return sorted(result)

with open('Day 2/input.txt') as file:
    data = [[int(j) for j in i.split('-')] for i in file.read().split()]
    ans = 0
    for pair in data:
        for i in range(pair[0], pair[1]+1, 1):
            f = factors(len(str(i)))
            n = len(str(i))
            j = 0
            while (f[j] < n):
                if str(i).count(str(i)[:f[j]]) * f[j] == len(str(i)):
                    ans += i
                    break
                j += 1
    print(ans)
