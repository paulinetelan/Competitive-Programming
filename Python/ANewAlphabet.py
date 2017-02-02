#Kattis: anewalphabet

dictionary = ["@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|",
                "|<", "1", "[]\/[]", "[]\[]", "0", "|D", "(,)", "|Z",
                "$", "']['", "|_|", "\/", "\/\/", "}{", "`/", "2"]

def main():

    line = input().lower()
    output = ""

    for x in range(0, len(line)):
        
        # Valid input
        if ord('a') <= ord(line[x]) and ord(line[x]) <= ord('z'): 
            output += dictionary[ord(line[x]) - ord('a')]

        else:
            output += line[x]

    print(output)

if __name__ == "__main__": main()
    
    
    
