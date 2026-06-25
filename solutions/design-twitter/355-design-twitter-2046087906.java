class Twitter {
    private int time;
    private Map<Integer, Set<Integer>> followMap;
    private Map<Integer, List<Tweet>> tweetMap;

    static class Tweet {
        int id;
        int time;
        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    public Twitter() {
        time = 0;
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        tweetMap
            .computeIfAbsent(userId,
                k -> new ArrayList<>())
            .add(new Tweet(tweetId, time++));
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Tweet> all = new ArrayList<>();
        followMap
            .computeIfAbsent(userId,
                k -> new HashSet<>())
            .add(userId);
        for (int followee :
                followMap.get(userId)) {
            if (tweetMap.containsKey(followee)) {
                all.addAll(tweetMap.get(followee));
            }
        }

        all.sort((a, b) -> b.time - a.time);

        List<Integer> feed = new ArrayList<>();

        for (int i = 0;
             i < Math.min(10, all.size());
             i++) {
            feed.add(all.get(i).id);
        }

        return feed;
    }

    public void follow(int followerId,
                       int followeeId) {
        followMap
            .computeIfAbsent(followerId,
                k -> new HashSet<>())
            .add(followeeId);
    }

    public void unfollow(int followerId,
                         int followeeId) {
        if (followMap.containsKey(followerId)
            && followeeId != followerId) {
            followMap
                .get(followerId)
                .remove(followeeId);
        }
    }
}