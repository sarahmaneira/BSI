A = {1, 2, 3}
C = {1, 2, 3, 4, 5}
D = {5, 3, 4, 2, 1}

subconjunto_proprio_A = A.issubset(C) and A != C
print(f"A = {A} é subconjunto próprio de C = {C}? {subconjunto_proprio_A}")

subconjunto_proprio_D = D.issubset(C) and D != C
print(f"D = {D} é subconjunto próprio de C = {C}? {subconjunto_proprio_D}")
