for a in range(10):
    for b in range(10):
        for c in range(10):
            for d in range(10):
                re = pow(a,4)+pow(b,4)+pow(c,4)+pow(d,4)
                s = a * 1000 + b * 100 + c * 10 + d
                if re==s and len(str(re)) == 4:
                    print(re)