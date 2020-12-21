t1 = [["W","B","W","B","W","B","W","B"],["B","W","B","W","B","W","B", "W"],
     ["W","B","W","B","W","B","W","B"],["B","W","B","W","B","W","B", "W"],
     ["W","B","W","B","W","B","W","B"],["B","W","B","W","B","W","B", "W"],
     ["W","B","W","B","W","B","W","B"],["B","W","B","W","B","W","B", "W"]]
t2 = [ ["B","W","B","W","B","W","B", "W"],["W","B","W","B","W","B","W","B"],
      ["B","W","B","W","B","W","B", "W"],["W","B","W","B","W","B","W","B"],
      ["B","W","B","W","B","W","B", "W"],["W","B","W","B","W","B","W","B"],
      ["B","W","B","W","B","W","B", "W"],["W","B","W","B","W","B","W","B"]]
a, b = map(int, input().split())
arr = list()
c_arr = list()
for i in range(a):
    arr.append(list(input()))
for p in range(a-7):
    for q in range(b-7): 
        c = [row[q:q+8] for row in arr[p:p+8]]
        
        cnt1 = 0
        cnt2 = 0
        for i in range(8):
            for j in range(8):
                if t1[i][j] != c[i][j] :
                    cnt1 += 1
                if t2[i][j] != c[i][j] :
                    cnt2 += 1
        c_arr.append(min(cnt1, cnt2))
print(min(c_arr))