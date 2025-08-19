# 🪙 Conversor de Monedas en Java

Este Challenge, proporcionado por ALURA LATAM es una aplicación de consola en Java que permite convertir montos entre distintas monedas, utilizando datos en tiempo real proporcionados por la API de [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 📌 Funcionalidades

- Conversión de monedas como:
  - MXN a USD
  - USD a EUR
  - BRL a ARS
  - EUR a MXN
  - ARS a CLP
  - CLP a BRL
  - USD a MXN
- Consulta de tasas de cambio actualizadas.
- Interfaz por consola simple e intuitiva.
- Multiplicación automática del monto ingresado por la tasa de conversión.
- Manejo básico de errores para monedas inválidas.

---

## 🚀 Tecnologías utilizadas

- Java 17+
- HTTP Client (nativo de Java 11+)
- [ExchangeRate-API](https://www.exchangerate-api.com/)
- Gson (para convertir JSON a objetos Java)

---

## 🧾 Estructura del proyecto
│
├── Busqueda.java // Clase que se conecta a la API
├── Coins.java // Record para mapear los datos del JSON
├── Conversion.java // Lógica de conversión entre monedas
├── Menu.java // Menú principal interactivo por consola

## 📦 Requisitos

- JDK 11 o superior
- Conexión a Internet (para consultar la API)
- Biblioteca [Gson](https://github.com/google/gson) agregada al classpath

---

## 🔑 API Key

Para que el proyecto funcione, necesitas una API key válida de ExchangeRate-API.

1. Regístrate en [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)
2. Obtén tu API key gratuita.
3. Sustituye esta línea en `Busqueda.java`:


▶️ Cómo ejecutar el proyecto

1.-Clona este repositorio o copia los archivos a tu entorno de desarrollo.

2.-Asegúrate de tener Gson agregado al proyecto (puedes usar Maven, Gradle o añadir el .jar manualmente).

3.-Ejecuta Menu.java como aplicación principal.

4.-Sigue las instrucciones del menú en consola.

🖼️ Ejemplo de uso

<img width="812" height="472" alt="funcionalidad" src="https://github.com/user-attachments/assets/0021c404-a236-493b-9151-02466f42cad8" />

### 👨‍💻 Autor
Alumno de Alura Latam G8: Alan Murillo
