class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character , Integer> need = new HashMap<>();
        HashMap <Character , Integer> have = new HashMap<>();

      for(char c : ransomNote.toCharArray()){
        need.put(c , need.getOrDefault(c , 0)+1);
      }

      for(char c: magazine.toCharArray()){
        have.put(c , have.getOrDefault(c , 0)+1);
      }

      for(char c: need.keySet()){
        int requiredCount = need.get(c);
        int availableCount = have.getOrDefault(c , 0);

        if(availableCount < requiredCount){
            return false;
        }
      }
      return true;
    }
}