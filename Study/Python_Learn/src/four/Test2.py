a = 2
for i in range(3,100):
    for b in range(2,i):
        if i%b == 0:
            break
    else:
        a += i
print(a)