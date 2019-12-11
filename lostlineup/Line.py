num = int(input())
line = input()
people = [int(x) for x in line.split(' ')]

if num == 2:
    print('1 2')
elif num == 1:
    print('1')
else:
    order = list(range(2, num + 1))

    for i in range(len(people) - 1):
        for j in range(i + 1, len(people)):
            if people[i] > people[j]:
                temp = people[j]
                people[j] = people[i]
                people[i] = temp

                temp = order[j]
                order[j] = order[i]
                order[i] = temp

    ret = '1'
    for o in order:
        ret += ' ' + str(o)
    print(ret)
