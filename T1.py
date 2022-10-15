def fungsi_1():
    print('fungsi 1 ')
    for x in range(5):
        for y in range(x+1):
            print("*", end=" ")
        print("")
def fungsi_2():
    print('fungsi 2 ')
    for x in range(5, 0, -1):
        for y in range(0, x):
            print("*", end=" ")
        print("")
        
fungsi_1()
fungsi_2()
