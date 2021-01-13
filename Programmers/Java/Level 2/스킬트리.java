class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int index = 0;
        while(true){
            String skill_tree = skill_trees[index];		// 스킬트리 배열에서 하나를 뽑아옴
            String clone = new String(skill_tree);		// 공백으로 대체시 문자열의 길이가 변하게 되므로 클론을 생성
            for(int i=0; i<clone.length(); i++){		// 문자열의 길이가 변하므로 클론의 길이로 범위를 잡는다.
                String skills = String.valueOf(clone.charAt(i));
                if(!skill.contains(skills))
                    skill_tree = skill_tree.replace(skills, "");			// skills에 스킬트리의 첫 문자를 저장하고, 매개변수로 받은 skill에 포함이 되지 않으면 모두 공백처리
            }
            if(skill.indexOf(skill_tree)==0){
                answer++;
            }
            index++;
            if(index == skill_trees.length) break;
        }
        
        return answer;
    }
}

//구글 참고