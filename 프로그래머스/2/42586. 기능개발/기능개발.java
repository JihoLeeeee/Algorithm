import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] date = new int[progresses.length];
        for(int i=0; i<progresses.length; i++){
            int remain = 100 - progresses[i];
            date[i] = remain / speeds[i] + (remain % speeds[i] == 0 ? 0 : 1);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int standard = date[0];
        int cnt = 1;
        for(int i=1; i<date.length; i++){
            if (date[i] <= standard){
                cnt++;
            }
            else {
                result.add(cnt);
                cnt = 1;
                standard = date[i];
            }
        }
        result.add(cnt);
        System.out.println(result);
        
        int[] answer = new int[result.size()];
        for(int i =0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}

// 7 3 9
// 5 10 1 1 20 1