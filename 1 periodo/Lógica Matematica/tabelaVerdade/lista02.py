import ttg

ex020 = ttg.Truths(['a','b'], ['(~a) and b'])
print(ex020)

ex021 = ttg.Truths(['a', 'b'], ['(~b) => (a or b)'])
print(ex021)

# ex022 = ttg.Truths(['a', 'c'], ['(c or a) = ~c~c'])
# print(ex022)

ex023 = ttg.Truths(['a','b'], ['a or (a => b)'])
print(ex023)

ex024 = ttg.Truths(['d','a', 'c'], ['(d or (~a)) => (~c)'])
print(ex024)

ex025 = ttg.Truths(['a','b','c'], ['(~(a and b)) => (~(c and b))'])
print(ex025)
