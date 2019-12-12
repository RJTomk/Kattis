# Success in 0.02s

costs = [int(i) for i in input().split(' ')]

trucks = [[int(i) for i in input().split(' ')] for j in range(3)]

first_truck = 101
last_truck = -1

for truck in trucks:
    first_truck = min(first_truck, truck[0])
    last_truck = max(last_truck, truck[1])

i = first_truck
cost = 0
while i <= last_truck:
    num_trucks = 0  # len(['y' for truck in trucks if truck[0] <= i < truck[1]])
    for truck in trucks:
        if truck[0] <= i < truck[1]:
            num_trucks += 1
        else:
            continue

    if num_trucks > 0:
        cost += costs[num_trucks - 1] * num_trucks
    i += 1

print(cost)
