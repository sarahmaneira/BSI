import numpy as np
import matplotlib.pyplot as plt

# Função do 2º grau: f(x) = ax² + bx + c
def funcao_quadratica(x, a, b, c):
    return a * x**2 + b * x + c

# Definir o intervalo de x
x = np.linspace(-10, 10, 100)

# Definir parâmetros para a função do 2º grau
a, b, c = 1, -2, 3

# Plotar o gráfico
plt.scatter(x, funcao_quadratica(x, a, b, c), color='blue', label='Discreto')
plt.plot(x, funcao_quadratica(x, a, b, c), color='red', label='Contínuo')
plt.title("Função Quadrática: $f(x) = ax^2 + bx + c$")
plt.legend()
plt.show()
