class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        let counter = nums.count;
        var result : [Int] = [];
        let number = 9;
        var lister : [String] = [];
        for i in 0..<counter
        {
            for y in (i+1)..<counter
            {
                if nums[i]+nums[y] == target {
                    result =  [i, y]
                    lister.append("hello")
                    print(lister)
                }
            }
        }
        return result
    }
}