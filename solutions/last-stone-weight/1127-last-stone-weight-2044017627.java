class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.offer(stone);
        }
        while(pq.size() > 1){
            int top1 = pq.poll();
            int top2 = pq.poll();
            if(top1 != top2){
                pq.offer(top1- top2);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll(); 
    }
}