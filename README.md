# AWS S3 File Manager - Backend

Este proyecto es una API backend sencilla desarrollada con Spring Boot cuyo propósito principal es **aprender y practicar la integración con Amazon S3**, el servicio de almacenamiento de archivos de AWS.

## 🎯 Objetivo

Explorar y entender cómo:

- Configurar credenciales de AWS.
- Crear y gestionar un bucket en S3.
- Listar y acceder a archivos (imágenes, documentos) dentro de carpetas virtuales (prefixes).
- Configurar políticas públicas de acceso.
- Servir rutas públicas a través de una API REST.

## 🛠 Funcionalidades

- Endpoint para listar archivos por carpeta (images/documents).
- Conexión con AWS S3 usando el SDK de Java.
- Política de acceso controlada para permitir descarga directa desde el navegador.

## 📦 Tecnologías

- Java + Spring Boot
- Amazon S3 (AWS)
- AWS SDK v2 para Java

## 🚀 Próximos pasos

- Agregar subida y eliminación de archivos.
- Mejorar la autenticación y seguridad de los endpoints.
