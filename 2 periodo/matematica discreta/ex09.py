A = {1, 2, 3, 4, 5}
B = {4, 5, 6, 7, 8, 9, 10}

uniao = A.union(B)
print(f"A ∪ B = {uniao}")

intersecao = A.intersection(B)
print(f"A ∩ B = {intersecao}")

diferenca_A_B = A.difference(B)
print(f"A - B = {diferenca_A_B}")

diferenca_B_A = B.difference(A)
print(f"B - A = {diferenca_B_A}")
