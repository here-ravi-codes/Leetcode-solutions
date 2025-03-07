class Solution {
    public int findTheWinner(int n, int k) {

        int winner = 1; // Start with 1 person, trivially the winner.
        for (int i = 2; i <= n; i++) {
            winner = (winner + k - 1) % i + 1;
        }
        return winner;

        // ArrayList<Integer> people = new ArrayList<>();
        // for(int i = 1; i <= n; i++){
        //     people.add(i);
        // }
        // return solve(people, k - 1, 0);
    }

    // private int solve(ArrayList<Integer> people, int k, int index){
    //     if(people.size() == 1){
    //         return people.get(0);
    //     }
    //     index = (index + k) % people.size();
    //     people.remove(index);
    //     return solve(people, k, index);
    // }
}