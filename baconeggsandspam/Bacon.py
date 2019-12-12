# Success in 0.03s
n = int(input())
while n != 0:
    fooditems = dict()

    for i in range(n):
        line = input().split(' ')
        name = line[0]
        items = line[1:]

        for item in items:
            if item in fooditems:
                fooditems[item].append(name)
            else:
                fooditems[item] = [name]

    keys = list(fooditems.keys())
    keys.sort()
    for key in keys:
        output = str(key)
        items = fooditems[key]
        items.sort()
        for item in items:
            output += " {}".format(item)
        print(output)

    print('')

    n = int(input())
