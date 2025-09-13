class Solution {
    public int maxFreqSum(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int maxVowelFreq = 0;
        int maxConsonantFreq = 0;

        // Count the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find the maximum frequency of vowels and consonants
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            char c = entry.getKey();
            int freq = entry.getValue();
            if (vowels.contains(c)) {
                maxVowelFreq = Math.max(maxVowelFreq, freq);
            } else {
                maxConsonantFreq = Math.max(maxConsonantFreq, freq);
            }
        }

        return maxVowelFreq + maxConsonantFreq;
    }
}