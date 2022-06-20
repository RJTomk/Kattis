# Success in 0.06s

n = int(input())
first = int(input())

while n > 1:
    v = int(input())

    if v >= first and v % first == 0:
        print(v)
        n -= 1
        first = int(input()) if n >= 0 else 0
        
    
    n -= 1