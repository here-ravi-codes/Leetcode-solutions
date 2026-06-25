class Solution {
    public int leastInterval(char[] tasks, int n) {
        //a freq array to count the freq
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task - 'A']++;
        }

        //a max heap to store the ready tasks
        PriorityQueue<Integer> ready = new PriorityQueue<>(Collections.reverseOrder());
        for(int count : freq){
            if(count > 0) {
                ready.offer(count);
            }
        }

        //a queue to store the cooldown tasks
        Queue<int[]> cooldown = new LinkedList<>();

        int time = 0;

        //run a loop until ready or cooldown queues are non-empty, increment the time, take out from the ready queue, decrement its freq, if it is still greater than 0 put into cooldown queue with its cooldown time (time + n), if cooldown time is equal to time put back to ready queue.
        while(!ready.isEmpty() || !cooldown.isEmpty()){
            time++;
            if(!ready.isEmpty()){
                int count = ready.poll();
                count--;
                if(count > 0){
                    cooldown.offer(new int[]{count, time + n});
                }
            }
            if(!cooldown.isEmpty() && cooldown.peek()[1] == time){
                ready.offer(cooldown.poll()[0]);
            }
        }

        return time;
    }
}