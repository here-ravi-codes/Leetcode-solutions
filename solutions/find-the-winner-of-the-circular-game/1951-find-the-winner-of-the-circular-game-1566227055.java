class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> people = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            people.add(i);
        }
        return solve(people, k - 1, 0);
    }

    private int solve(ArrayList<Integer> people, int k, int index){
        if(people.size() == 1){
            return people.get(0);
        }
        index = (index + k) % people.size();
        people.remove(index);
        return solve(people, k, index);
    }
}