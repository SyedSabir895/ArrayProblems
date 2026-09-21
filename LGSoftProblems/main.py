def Sum(arr):
    n = len(arr)
    min1 = float('inf')
    min2 = float('inf')
    # min1 = float('-inf')
    for i in range(n):
        if(arr[i]<min1):
            min2 = min1
            min1 = arr[i]
        elif(arr[i]<min2 and arr[i]!=min1):
            min2 = arr[i]
    sum=0
    for i in range(n):
        
        if(arr[i]!=min1 and arr[i]!=min2):
            sum +=arr[i]
    
    max = float('-inf')
    for i in range(n):
          if(arr[i]!=min1 and arr[i]!=min2):
              if(arr[i]>max):
                max = arr[i]
    
    result = sum-max      
    return result
        
  
    
            
n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))
result = Sum(arr)
print(result)