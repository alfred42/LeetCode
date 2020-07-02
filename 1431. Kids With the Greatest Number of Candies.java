class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCount = 0;
        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            maxCount = Math.max(maxCount, candy);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCount);
        }

        return result;
    }
}