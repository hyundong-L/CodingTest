class Solution {
    public int[][] merge(int[][] intervals) {
        //Array sort
        intervals = mergeSort(intervals, 0, intervals.length - 1);

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (!result.isEmpty()
                    && result.get(result.size() - 1)[1] >= interval[0]
            ) {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            } else {
                result.add(interval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    private int[][] mergeSort(int[][] intervals, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            intervals = mergeSort(intervals, start, mid);
            intervals = mergeSort(intervals, mid + 1, end);

            return mergeForMergeSort(intervals, start, mid, end);
        } else {
            return intervals;
        }
    }

    private int[][] mergeForMergeSort(int[][] intervals, int start, int mid, int end) {
        int left = start, right = mid + 1;
        int[][] result = new int[end - start + 1][2];
        int index = 0;

        while (left <= mid && right <= end) {
            if (intervals[left][0] <= intervals[right][0]) {
                result[index][0] = intervals[left][0];
                result[index][1] = intervals[left][1];

                index++;
                left++;
            } else {
                result[index][0] = intervals[right][0];
                result[index][1] = intervals[right][1];

                index++;
                right++;
            }
        }

        while (left <= mid) {
            result[index][0] = intervals[left][0];
            result[index][1] = intervals[left][1];

            index++;
            left++;
        }
        while (right <= mid) {
            result[index][0] = intervals[right][0];
            result[index][1] = intervals[right][1];

            index++;
            right++;
        }

        for (int i = 0; i < index; i++) {
            intervals[start + i][0] = result[i][0];
            intervals[start + i][1] = result[i][1];
        }

        return intervals;
    }
}