import heapq

def prims_algorithm(n, graph):
    mst = []
    visited = [False] * n
    min_heap = [(0, 0)]  # (weight, node), start from node 0

    while min_heap:
        weight, u = heapq.heappop(min_heap)
        
        if visited[u]:
            continue
        
        visited[u] = True
        if weight != 0:
            mst.append((u, weight))  # Add edge to MST
        
        for v, edge_weight in graph[u]:
            if not visited[v]:
                heapq.heappush(min_heap, (edge_weight, v))
    
    return mst

# User Input
n = int(input("Enter number of vertices: "))
graph = {i: [] for i in range(n)}

e = int(input("Enter number of edges: "))
for _ in range(e):
    u, v, w = map(int, input("Enter edge (u, v, weight): ").split())
    graph[u].append((v, w))
    graph[v].append((u, w))

mst = prims_algorithm(n, graph)
print("Edges in MST:")
for node, weight in mst:
    print(f"Node {node} with edge weight {weight}")
