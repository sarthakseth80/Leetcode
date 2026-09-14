class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        HashSet<Integer> good = new HashSet<>();

        for(int[] i : triplets){


            if( i[0] > target[0] || i[1] > target[1] || i[2] > target[2]) {
                continue;
            }

            for(int t = 0 ; t < i.length ; t++){
                if(i[t] == target[t])
                    good.add(t);
            
            }
        }

        return good.size() == 3;
    }
}