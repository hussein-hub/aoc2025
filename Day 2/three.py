with open('Day 2/input.txt') as file:
    data = [[int(j) for j in i.split('-')] for i in file.read().split()]
    ans = 0
    for pair in data:
        for i in range(pair[0], pair[1]+1, 1):
            if len(str(i)) % 2 == 0:
                if str(i)[:int(len(str(i))/2)] == str(i)[int(len(str(i))/2):]:
                    ans += i
    print(ans)