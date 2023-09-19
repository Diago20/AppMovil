def potencia_por_suma(base, exponente):

    if exponente == 0:
        return 1

    else:
        return base + potencia_por_suma(base, exponente - 1)


base = int(input("Ingrese la base: "))
exponente = int(input("Ingrese el exponente: "))


resultado = potencia_por_suma(base, exponente)
print(f"{base}^{exponente} =", resultado)
