import numpy as np
import matplotlib.pyplot as plt

# Função seno: f(x) = sen(x)
def funcao_seno(x):
    return np.sin(x)

# Definir o intervalo de x
x = np.linspace(-10, 10, 100)

# Plotar o gráfico
plt.scatter(x, funcao_seno(x), color='blue', label='Discreto')
plt.plot(x, funcao_seno(x), color='red', label='Contínuo')
plt.title("Função Seno: $f(x) = \sin(x)$")
plt.legend()
plt.show()
