// class adj:
//     li=[]
//     mat_size=0
//     dic={}
//     def _init_(self,n):
//         self.mat_size=n
//         for i in range(n):
//             self.dic[i]=[]
//             l=[]
//             for j in range(n):
//                 l.append(0)
//             self.li.append(l)
//     def adj_list(self):
//         for i in range(self.mat_size):
//             for j in range(self.mat_size):
//                 if(self.li[i][j]==1):
//                     self.dic[i].append(j)
//         print(self.dic)         
//     def insert_edge(self,n,m):
//         self.li[n][m]=1
//         self.li[m][n]=1
//     def delete_edge(self,n,m):
//         self.li[m][n]=0
//         self.li[n][n]=0
//     def adj_mat(self):
//         ind=0
//         for i in self.li:
//             print(ind , i)
//             ind+=1
// graph=adj(4)
// graph.insert_edge(1,2)
// graph.insert_edge(2,3)
// graph.adj_mat()
graph.adj_list()