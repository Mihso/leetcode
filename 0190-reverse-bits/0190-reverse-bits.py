class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        print(bin(n))
        check = bin(n)[2:len(bin(n))]
        while len(check) < 32:
            check = "0"+ check
        print check
        reverser = check[len(check)::-1]
        print reverser
        return int(reverser,2)
        