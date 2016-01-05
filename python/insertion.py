#!/usr/bin/python

def insertion(arr):
    for i in range(1,len(arr)):
        key = arr[i]
        j = i
        while j > 0 and key < arr[j-1]:
            arr[j] = arr[j-1]
            j = j-1

        arr[j] = key


arr = [99,78,34,67,22,12]
insertion(arr)
print arr
