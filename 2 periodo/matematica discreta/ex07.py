import itertools

C = {2, 3, 4}

subconjuntos = []
for i in range(len(C) + 1):
    subconjuntos.extend(itertools.combinations(C, i))

print(f"Conjunto C: {C}")
for subconjunto in subconjuntos:
    subconjunto_set = set(subconjunto)
    print(f"Subconjunto: {subconjunto_set}, é subconjunto de C? {subconjunto_set.issubset(C)}")
