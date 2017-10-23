package solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MinimumSpanningTree {

	static final int INF = 100000000;

	public static void main(String[] args) throws IOException {

		int V; // V �׷� ������ ����
		int E; // ������ ����
		int[][] w; // ������ ����
		int sumOfWeight = 0; // MST ����ġ�� ��
		List<Integer> sumOfWeight2 = new ArrayList<>();
		boolean[] visited;
		int numOfMST = 0; // MST �׷� ������ ����
		int[] d; // MST �׷쿡�� V�׷��� vertex������ �Ÿ�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());

		visited = new boolean[V + 1];
		w = new int[V + 1][V + 1];
		d = new int[V + 1];

		for (int i = 0; i < V + 1; i++) {

			d[i] = INF;
			visited[i] = false;
			for (int j = 0; j < V + 1; j++) {

				w[i][j] = INF;
			}
		}

		// ���� ���� �Է�
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());

			if (w[A][B] > C) {

				// ������ �׷���
				w[A][B] = C;
				w[B][A] = C;
			}
		}

		// Prim �˰���

		// �ʱⰪ
		numOfMST = 0;
		// MST[0] = 1;
		d[1] = 0;

		while (numOfMST < V) {

			int min = INF;
			int u = -1;

			// v �׷쿡�� ���� ����� node�� �̴´�.
			for (int i = 1; i < V + 1; i++) {

				if (!visited[i] && d[i] < min) {

					min = d[i];
					u = i;
					
					//System.out.println(min);
				}
			}

			// d �Ÿ� ����
			for (int i = 1; i < V + 1; i++) {

				if (!visited[i] && w[u][i] != INF) {

					if (w[u][i] < d[i]) {

						d[i] = w[u][i];
					}
				}
			}

			numOfMST++;
			sumOfWeight += min;
			sumOfWeight2.add(sumOfWeight);

			visited[u] = true;

		}

		// ��� ���
		//bw.write(String.valueOf(sumOfWeight));
		//bw.write(String.valueOf(sumOfWeight2.size()/2));
			
		//System.out.println(sumOfWeight);
		for(int i=0; i<sumOfWeight2.size(); i++)
			System.out.println(sumOfWeight2.get(i));
		
		bw.flush();

		bw.close();
		br.close();

	}

}
