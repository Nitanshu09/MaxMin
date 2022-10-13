
public class MaxMin {
	public static int findSum(int A[], int N) {
		int min = A[0];
		int max = A[0];
		for (int i = 1; i < N; i++) {
			if (A[i] > max) {
				max = A[i];
			} else if (A[i] < min) {
				min = A[i];
			}
		}
		return min + max;
	}

	public static void main(String[] args) {
		int N = 5;
		int A[] = { -2, 1, -4, 5, 3 };
		System.out.println(findSum(A, N));
	}

}
