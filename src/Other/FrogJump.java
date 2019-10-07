package Other;

import java.util.HashSet;
import java.util.Stack;

public class FrogJump {

    public static boolean canCross(int[] stones) {
        for(int i = 3; i < stones.length; i++){
            if(stones[i] > stones[i-1] * 2)
                return false;
        }
        HashSet<Integer> stonePositions = new HashSet<>();
        for(int stone : stones)
            stonePositions.add(stone);
        int lastStone = stones[stones.length - 1];
        Stack<Integer> pos = new Stack<>();
        Stack<Integer> jumps = new Stack<>();
        pos.add(0);
        jumps.add(0);
        while(!pos.isEmpty()) {
            int currPos = pos.pop();
            int jumpDist = jumps.pop();
            for(int i = jumpDist - 1; i <= jumpDist + 1; i++) {
                if(i <= 0)
                    continue;
                int nextPos = currPos + i;
                if(nextPos == lastStone)
                    return true;
                else if(stonePositions.contains(nextPos)) {
                    pos.add(nextPos);
                    jumps.add(i);
                }
            }
        }
        return false;
    }


}
