class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //store in frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //iterate the map and put the value in a list
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }

        //sort the list
        list.sort(Collections.reverseOrder());;

        //take out first k elements in the array
        list = list.subList(0, k);

        //iterate the map and add the key to set corresponding to those k values
        Set<Integer> resSet = new HashSet<>();

        for (int l : list) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == l) {
                    resSet.add(entry.getKey());
                    if (resSet.size() == k) break;
                }
            }
            if (resSet.size() == k) break;
        }

        //convert back to list and then to array and return
        List<Integer> resList = new ArrayList<>(resSet);
        int[] res = resList.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}