import math

n = [1000, 60000, 3600000, 108000000, 1314000000, 131400000000]

#for num in n:
#    i = 1
#    while i*i < num:
#        i += 1
#    print(i-1)

#for num in n:
#    i = 1
#    while i * math.log(i, 2) < num:
#        i += 1
#    print(i-1)

temp = 131400000000
i = 4114224721
while i * math.log(i, 2) < temp:
    i += 1
print(i-1)
k = i -1
print(k * math.log(k, 2))
print((k+1) * math.log(k+1, 2))