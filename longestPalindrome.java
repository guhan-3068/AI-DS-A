class Solution {
public:
    string longestPalindrome(string s) {
        string ans = "";

        for (int i = 0; i < s.size(); i++) {
            for (int j = i; j < s.size(); j++) {
                string t = s.substr(i, j - i + 1);
                string r = t;
                reverse(r.begin(), r.end());

                if (t == r && t.size() > ans.size())
                    ans = t;
            }
        }

        return ans;
    }
};
