List=list(map(int,input().split()))
def radix(List,maxSize):
    for i in range( maxSize):
        BucketList=count(List,i)
        List=[]
        for i in BucketList:
            for j in i :
                List.append(j)
    return List
def count():
    BucketList=[[],[],[],[],[],[]]
    for num in List:
        BucketList[(num//(10**i))%10].append(num)

    return BucketList


print(radix(List,len(str(max(List)))))