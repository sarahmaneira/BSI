import ttg 

ex026 = ttg.Truths(['L', 'D', 'T'], ['L and D and T'])
print(ex026)

ex027 = ttg.Truths(['m', 'a'], ['m and ~a'])
print(ex027)

ex028 = ttg.Truths(['a', 'b', 'r'], ['(a and b) or (a and r)'])
print(ex028)

ex029 = ttg.Truths(['r', 'm', 'c'], ['r and m and (~c)'])
print(ex029)

ex030 = ttg.Truths(['a', 'h', 't'], ['(a and h) or (t or ~h)'])
print(ex030)