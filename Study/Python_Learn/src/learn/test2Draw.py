import turtle as t
t.setup(650,350,200,200)
t.pu()
t.fd(-250)
t.pd()
t.seth(-40)
t.pensize(25)
t.pencolor("purple")
for i in range(4):
    t.circle(40,80)
    t.circle(-40,80)
t.circle(40,40)
t.fd(16)
t.circle(25,180)
t.fd(50)
t.done()