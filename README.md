
# 📂 Visor de Documentos en Árbol (Java + GUI)

Este proyecto consiste en una aplicación Java que:
- Consulta una "API" que proporciona documentos de ejemplo (PDF, DOCX, XLSX).
- Descarga automáticamente esos archivos.
- Los organiza en una estructura tipo árbol según su tipo (`pdf`, `docx`, `xlsx`).
- Muestra una interfaz gráfica (`Swing`) que permite visualizar y **abrir los archivos con doble clic**.

---

## ✅ Funcionalidades

- 🔁 Llamada simulada a API pública (`ApiCliente`).
- 📥 Descarga automática de archivos.
- 🌳 Organización jerárquica por tipo de archivo en un árbol.
- 📂 Navegación por árbol de documentos con GUI.
- 🖱️ Doble clic para abrir archivos con la app predeterminada.

---

## 🛠️ Requisitos

- Java JDK 8 o superior.
- Conexión a internet (para descargar los archivos de ejemplo).
- Un sistema con aplicaciones asociadas a PDF, DOCX o XLSX.

---

## 🧾 Estructura de Carpetas

```
VisorDocumentos/
├── Main.java
├── Documento.java
├── TreeNode.java
├── ÁrbolDocumentos.java
├── ApiCliente.java
├── Utilidades.java
├── VisorGUI.java
├── descargas/           <-- Aquí se guardan los archivos descargados
└── README.md
```

---

## 🚀 Ejecución

1. Compila todos los archivos Java:

```bash
javac *.java
```

2. Ejecuta la clase principal:

```bash
java Main
```

3. Aparecerá una ventana con el árbol de documentos. Haz doble clic en un archivo para abrirlo.

---

## 🖼️ Interfaz

La interfaz muestra un árbol como el siguiente:

```
Documentos
├── pdf
│   └── ManualUsuario.pdf
├── docx
│   └── Contrato.docx
└── xlsx
    └── ReporteVentas.xlsx
```

---

## 📦 Simulación de API

La clase `ApiCliente` simula una API que devuelve documentos con URLs públicas desde [file-examples.com](https://file-examples.com). Puedes personalizar estas URLs si lo deseas.

---

## 🔒 Notas

- Si el archivo ya existe, se sobrescribe automáticamente.
- Todos los archivos se descargan a la carpeta `descargas/`.

---

## 📌 Extensiones Sugeridas

- Agregar opción de búsqueda por nombre.
- Serializar el árbol a JSON y cargarlo desde archivo.
- Visualizar metadatos de cada documento (tamaño, fecha, etc.).
- Cargar documentos desde una API real o desde una base de datos.
