class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();
    
    for (String str : strs) {
        // Sorted string is the "signature" — same for all anagrams
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        
        // Group by signature
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(map.values());
    }
}
