def prime(m):
    for i in range(2,m):
        if m%i==0:
            return False
    return True

n=eval(input())
k=int(n)
k=k+1 if k<n else k
count=5
while count>0:
    if prime(k):
        if count>1:
            print(k,end=",")
        else:
            print(k,end="")
        count=count-1
    k+=1