class Solution(object):
    def capitalizeTitle(self, title):
        """
        :type title: str
        :rtype: str
        """
        start = 0 
        title = list(title.lower())
        for t in range(len(title)):
            if title[t] == " " or t == len(title) - 1:
                sub = None
                if t == len(title) - 1:
                    sub = title[start: t+ 1]
                else:
                    sub = title[start: t]
                print(title[start: t])
                if len(sub) >= 3:
                    title[start] = title[start].upper()
                start = t + 1
        return "".join(title)
        
            