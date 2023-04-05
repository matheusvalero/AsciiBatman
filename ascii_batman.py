with open("bat.txt", "r") as arquivo:
    arquivo.read
    for linha in arquivo:
        contagemCaractere = 0
        contagemEspaco = 0

        index = 0
        for caractere in linha:
            print(caractere, end="")
print("\n")

strimgg = "1234567890"
print(strimgg[-1:])

lista = []
listona = []

with open("bat.txt", "r") as arquivo:
    arquivo.read
    for linha in arquivo:
        contagemCaractere = 0
        contagemEspaco = 0

        index = 0
        for caractere in linha:
            try:
                if (caractere == " "):
                    contagemEspaco += 1
                    if (index+1 == len(linha)-1):
                        lista.append(contagemEspaco)
                        break
                    elif (linha[index+1] == "*"):
                        lista.append(contagemEspaco)
                        contagemEspaco = 0
                else:
                    contagemCaractere += 1
                    if (index+1 == len(linha)-1):
                        lista.append(contagemCaractere)
                        break
                    elif (linha[index+1] == " "):
                        lista.append(contagemCaractere)
                        contagemCaractere = 0
                        
                index += 1
            except (IndexError):
                break

print(lista, "\n")


listas = [[20, 24],
          [15, 34],
          [11, 7, 3, 1, 5, 1, 7, 1, 4, 1, 4, 7],
          [8, 7, 3, 3, 6, 2, 5, 2, 5, 3, 3, 7],
          [6, 6, 3, 5, 7, 9, 6, 5, 4, 5],
          [4, 6, 2, 8, 7, 9, 7, 6, 4, 5,],
          [3, 4, 3, 10, 7, 9, 7, 9, 3, 5],
          [2, 4, 2, 14, 4, 11, 5, 12, 3, 4],
          [1, 4, 2, 49, 2, 4],
          [1, 3, 2, 51, 2, 4],
          [1, 3, 2, 52, 2, 4],
          [1, 3, 2, 51, 3, 4],
          [1, 4, 2, 51, 2, 4],
          [2, 4, 2, 7, 5, 4, 2, 11, 2, 4, 5, 9, 2, 4],
          [3, 4, 3, 5, 6, 1, 6, 7, 6, 1, 6, 8, 2, 4],
          [4, 5, 3, 4, 13, 5, 13, 6, 3, 5],
          [6, 5, 3, 2, 14, 3, 14, 2, 4, 6],
          [7, 6, 3, 1, 14, 1, 14, 1, 3, 7],
          [9, 7, 32, 7],
          [12, 8, 25, 7],
          [15, 34],
          [20, 24]]

for lista in listas:
    y = 0
    while (y < len(lista)):
        if (y == 0 or y % 2 == 0):
            print(" " * lista[y], end="")
        else:
            print("*" * lista[y], end="")
        y += 1
    print("")