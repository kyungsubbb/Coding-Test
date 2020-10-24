def dfs (graph, start) :
    visit, need_visit = list(), list()
    need_visit.append(start)
    
    while need_visit:
        node = need_visit.pop()
        if node not in visit :
            visit.append(node)
            need_visit.extend(graph[node])
            
    return visit

count_com=int(input())
link_num = int(input())
graph = dict()
for i in range(link_num) :
    n, m = list(map(int, input().split()))
    if n not in graph :
        graph[n] = [m]
    else :
        graph[n].append(m)
    
    if m not in graph :
        graph[m] = [n]
    else :
        graph[m].append(n)
        
print(len(dfs(graph, 1))-1)