# Does not work

def partition(arr, low, high):
    i = (low-1)
    pivot = arr[high]

    for j in range(low, high):
        if arr[j] <= pivot:
            i = i + 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return (i + 1)

def quicksort(arr, low, high):
    if low < high:
        pi = partition(arr, low, high)

        quicksort(arr, low, pi - 1)
        quicksort(arr, pi + 1, high)

def opt1(N, A):
    for x in A:
        for y in A:
            if x == y:
                continue
            if x + y == 7777:
                print("Yes")
                return
    print("No")

def opt2(N, A):
    print("Unique" if len(set(A)) == len(A) else "Contains duplicate")

def opt3(N, A):
    count = 0
    for i in range(N):
        for j in range(i, N):
            if A[i] == A[j]:
                count += 1
        if count > (N / 2) :
            print(A[i])
            return
    print(-1)

def opt4(N, A):
    quicksort(A, 0, N - 1)
    if N % 2 == 1:  # Odd
        print(A[(N / 2) - 0.5])
    else:
        print("{} {}".format(A[int((N / 2) - 1)], A[int(N / 2)]))

def opt5(N, A):
    quicksort(A, 0, N - 1)
    s = ''
    for i in A:
        if i >= 100 and i <= 999:
            s = '{} {}'.format(s, str(i))
    print(s.strip())

A = [int(i) for i in input().split(' ')]
N, t = A[0], A[1]
A = [int(i) for i in input().split(' ')]

if t == 1:
    opt1(N, A)
elif t == 2:
    opt2(N, A)
elif t == 3:
    opt3(N, A)
elif t == 4:
    opt4(N, A)
elif t == 5:
    opt5(N, A)
else:
    print('FAIL')
