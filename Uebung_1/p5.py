#i = 0

def Hanoi(n, s = ['A', 'B', 'C']): 
    #global i
    if n == 1:
        print(s[0] + '->' + s[2])
        #i = 1 + i
        #print('i =', i)
    else:
        Hanoi(n-1, [s[0],  s[2], s[1]]) 
        Hanoi(1, s)
        Hanoi(n-1, [s[1], s[0], s[2]])

Hanoi(n=3)

 