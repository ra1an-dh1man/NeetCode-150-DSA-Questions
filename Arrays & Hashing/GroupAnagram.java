//LeetCode question 49
class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        // n * mlogm
        // copying the arrays
        List<String> sortedStrs = new ArrayList();
        int n = strs.length;

        for (String str : strs) {
            String newStr = str;
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String finalStr = String.valueOf(chs);
            sortedStrs.add(finalStr);
        }

        Map<String, List<String>> anagramGroups = new HashMap();

        for (int i = 0; i < n; i++) {
            String str = sortedStrs.get(i);
            if (anagramGroups.containsKey(str)) {
                List<String> currAnagrams = anagramGroups.get(str);
                currAnagrams.add(strs[i]);
                anagramGroups.put(str, currAnagrams);
            } else{
                List anagrams = new ArrayList();
                anagrams.add(strs[i]);
                anagramGroups.put(str, anagrams);
            }
        }

        // for ()
        System.out.println(anagramGroups);
        List<List<String>> anagrams = new ArrayList();

        for (List<String> anas : anagramGroups.values()) {
            anagrams.add(anas);
        }



        return anagrams;

    }
}
