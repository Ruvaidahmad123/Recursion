class Solution {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public static void getAns(ArrayList<Integer> A, int idx, int target, ArrayList<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (idx >= A.size() || target < 0) {
            return;
        }

        // Include the current element
        list.add(A.get(idx));
        getAns(A, idx, target - A.get(idx), list); // Not incrementing idx to allow repeated use
        list.remove(list.size() - 1); // Backtrack

        // Exclude the current element and move to the next
        // Skip duplicates
        while (idx + 1 < A.size() && A.get(idx).equals(A.get(idx + 1))) {
            idx++;
        }
        getAns(A, idx + 1, target, list);
    }

    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int target) {
        ans.clear();
        Collections.sort(A); // Sort to handle duplicates
        ArrayList<Integer> list = new ArrayList<>();
        getAns(A, 0, target, list);
        return ans.isEmpty() ? new ArrayList<ArrayList<Integer>>() : ans; // Return empty list if no combinations found
    }
}
