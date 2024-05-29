class Solution:
    numList = [] #problem 2 shared resource 

    def alt(self, s: str):
        #problem 2 
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
        #problem 2
        self.alt(s)
        return max(self.numList)


sol = Solution()
count = sol.lengthOfLongestSubstring("bbbbb")
print(count)