class Solution:
    numList = []

    def alt(self, s: str):
        if not s:
            return None
        temp = ""
        count = 0
        for c in s:
            if(c not in temp):
                count += 1
                temp += c
            else:
                break
        self.numList.append(count)
        self.alt(s[1:])
                
        
        

    def lengthOfLongestSubstring(self, s: str) -> int:
        self.alt(s)
        return max(self.numList)


sol = Solution()
count = sol.lengthOfLongestSubstring("bbbbb")
print(count)