import numpy as np
import matplotlib.pyplot as plt

# Função modular: f(x) = |x|
def funcao_modular(x):
    return np.abs(x)

# Definir o intervalo de x
x = np.linspace(-10, 10, 100)

# Plotar o gráfico
plt.scatter(x, funcao_modular(x), color='blue', label='Discreto')
plt.plot(x, funcao_modular(x), color='red', label='Contínuo')
plt.title("Função Modular: $f(x) = |x|$")
plt.legend()
plt.show()
x