class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        char[] c = s.toCharArray();
        for (int i = 0, j = 1; j <= n; j++) {
            if (j == n || c[j] == ' ') {
                reverse(c, i, j-1);
                i = j+1;
            }
        }
        return new String(c);
    }

    private void reverse(char[] c, int i, int j) {
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++; j--;
        }
        }
    }    
    
