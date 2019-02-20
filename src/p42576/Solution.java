package p42576;
import java.util.*;
public class Solution {
	public String solution(String[] participant, String[] completion) {
		HashMap<String,Integer> People = new HashMap<String, Integer>();
        String answer = "";
		for (String string : participant) {
			People.put(string, People.getOrDefault(string, 0)+1);
		}
		for (String string : completion) {
			People.put(string, People.get(string)-1);
		}
		for(int i = 0 ; i < participant.length ; i +=1) {
			if(People.get(participant[i]) > 0) {
				answer = participant[i];
			}
		}
		
        return answer;
    }
}
