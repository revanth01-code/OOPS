class DisjointSet:
    def __init__(self, n):
        self.parent = list(range(n))
        self.rank = [0] * n
    
    def find(self, u):
        if self.parent[u] != u:
            self.parent[u] = self.find(self.parent[u])
        return self.parent[u]
    
    def union(self, u, v):
        root_u, root_v = self.find(u), self.find(v)
        if root_u != root_v:
            if self.rank[root_u] > self.rank[root_v]:
                self.parent[root_v] = root_u
            else:
                self.parent[root_u] = root_v
                if self.rank[root_u] == self.rank[root_v]:
                    self.rank[root_v] += 1

def kruskal(n, edges):
    edges.sort(key=lambda edge: edge[2])
    ds, mst = DisjointSet(n), []
    for u, v, weight in edges:
        if ds.find(u) != ds.find(v):
            ds.union(u, v)
            mst.append((u, v, weight))
    return mst

# Example input: 4 vertices, edges with weights
n = int(input("Enter number of vertices: "))
e = int(input("Enter number of edges: "))
edges = [tuple(map(int, input("Enter edge (u, v, weight): ").split())) for _ in range(e)]

mst = kruskal(n, edges)
print("Edges in MST:")
for u, v, w in mst:
    print(f"{u} - {v}: {w}")
