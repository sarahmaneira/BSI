import numpy as np
import matplotlib.pyplot as plt


def funcao_exponencial(x, a, b):
    return a * b**x


x = np.linspace(-10, 10, 100)

a, b = 1, 2


plt.scatter(x, funcao_exponencial(x, a, b), color='blue', label='Discreto')
plt.plot(x, funcao_exponencial(x, a, b), color='red', label='Contínuo')
plt.title("Função Exponencial: $f(x) = a * b^x$")
plt.legend()
plt.show()
