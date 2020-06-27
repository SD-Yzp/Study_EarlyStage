string = input()
op_num = 0
op = ['+', '-', '*', '/']
for i, s in enumerate(string):
    if s in op and i!=0:
        op_num = i
        if string[0] == '-':
            num1 = -float((string[1:i]).strip())
        elif string[0:2] == '0x':
            num1 = int(eval((string[:i]).strip()))
        else:
            num1 = float((string[0:i]).strip())
        num2 = float((string[i+1:]).strip())

        
        if s == op[0]:
            print('{:.2f}'.format(num1 + num2))
        elif s == op[1]:
            print('{:.2f}'.format(num1 - num2))
        elif s == op[2]:
            print('{:.2f}'.format(num1 * num2))
        else:
            print('{:.2f}'.format(num1 / num2))