f= open('latex.log','r')
i= 0
chars = 0
for line in f.readlines():
    if not (len(line) == 1  and line[-1]=='\n') :
        i +=1
        chars += len(line)-1

avg = round(chars/i,0)
avg = int(avg)
print(avg)