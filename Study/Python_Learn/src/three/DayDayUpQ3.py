dayfactor = 0.01
num = 1
for i in range(365):
    if i%7 in [6,0]:
        num *= 1-dayfactor
    else:
        num *= 1+dayfactor
print("{:.2f}".format(num))