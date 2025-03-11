import ttg 

ex001 = ttg.Truths(['p'], ['~p'], ints=False) 
print(ex001)

ex002 = ttg.Truths(['p', 'q'], ['p and q'], ints=False)
print(ex002)

ex003 = ttg.Truths(['p','q'], ['p or q'], ints=False)
print(ex003)

ex004 = ttg.Truths(['q', 'p'], ['q = p'], ints=False)
print(ex004)

ex005 = ttg.Truths(['p', 'q'], ['p => (~q)'], ints=False)
print(ex005)

ex006 = ttg.Truths(['p', 'q'], ['p or (~q)'], ints=False)
print(ex006)

ex007 = ttg.Truths(['p', 'q'], ['(~p) and (~q)'], ints=False)
print(ex007)

ex008 = ttg.Truths(['p', 'q'], ['p = (~q)'], ints=False)
print(ex008)

ex009 = ttg.Truths(['p', 'q'], ['(p and (~q)) => p'], ints=False)
print(ex009)

print('\n--------------------------------------------- \nExercicio 02')

ex010 = ttg.Truths(['p', 'q'], ['(~p) and q'])
print(ex010)

ex011 = ttg.Truths(['p','q'], ['p and (q)'])
print(ex011)

ex012 = ttg.Truths(['p', 'q'], ['(~p) and (~q)'])
print(ex012)

ex013 = ttg.Truths(['p', 'q'], ['(~p or p) and q'])
print(ex013)

print('\n--------------------------------------------- \nExercicio 03')

ex014 = ttg.Truths(['q', 'p'], ['q => p'])
print(ex014)

ex015 = ttg.Truths(['p','q'], ['~((p) and (~q))'])
print(ex015)

print('\n---------------------------------\n')

ex016 = ttg.Truths(['p','q','r'], ['~(p and r) or ~(q)'])
print(ex016)

ex017 = ttg.Truths(['p','q','r'], ['~(p or q) and r'])
print(ex017)

ex018 = ttg.Truths(['r','p','q'], ['(~r) => (p and ~q)'])
print(ex018)

ex019 = ttg.Truths(['p', 'q', 'r'], ['~((~p and ~q) and (r and p))'])
print(ex019)

