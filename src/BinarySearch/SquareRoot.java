package BinarySearch;

//Rule to remember

//Use high = mid - 1 when:
//
//You have already tested mid and know it cannot be the answer.
//Typical loop: while (low <= high).

//Use high = mid when:
//
//mid might still be the answer, so you must keep it.
//You're searching for a boundary (first/last valid position).
//Typical loop: while (low < high).

public class SquareRoot {
    public static int sqrtN(long N) {

        // Handle corner cases
        if (N == 0 || N == 1) {
            return (int) N;
        }

        // Initialize lower and upper bounds
        long low = 2;
        long high = N;
        long mid;

        // Binary Search
        while (low <= high) {

            // Calculate mid safely
            mid = low + (high - low) / 2;

            /*
             * If square of mid is less than or equal to N,
             * move low forward.
             *
             * We use (mid <= N / mid) instead of (mid * mid <= N)
             * to avoid overflow.
             */
            if (mid <= (N / mid)) {
                low = mid + 1;
            } else {
                high = mid-1;
            }
        }

        // Return floor value of square root
        return (int) low - 1;
    }
}
