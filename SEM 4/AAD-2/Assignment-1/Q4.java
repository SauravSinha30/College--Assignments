import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        int n = 4;
        LinkedList<Integer>[] a = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            a[i] = new LinkedList<Integer>();
        }
        a[0].add(1);
        a[0].add(2);
        a[1].add(2);
        a[2].add(3);

        System.out.println("Depth-First Search starting from vertex 0:");
        DFS(0, a);
    }

    static void DFS(int start, LinkedList<Integer>[] a) {
        boolean visited[] = new boolean[a.length];
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                System.out.print(node + " ");
                visited[node] = true;
            }
            for (int neighbor : a[node]) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }
}
