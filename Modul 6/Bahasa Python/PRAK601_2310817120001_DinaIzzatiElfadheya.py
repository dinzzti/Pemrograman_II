def Matriks(baris, kolom, hasil):
    matriks = [[0] * kolom for _ in range(baris)]
    index = 0

    for x in range(baris):
        for y in range(kolom):
            matriks[x][y] = hasil[index]
            index += 1
    return matriks

def Printmatriks(matriks):
    for row in matriks:
        print(" ".join(map(str, row)))

input_baris_kolom = input("Input\n")
baris, kolom = map(int, input_baris_kolom.split())

input_hasil = input()
hasil = list(map(int, input_hasil.split()))

hasilmatriks = Matriks(baris, kolom, hasil)

print("\nOutput")
Printmatriks(hasilmatriks)
