# 🎬 InfoCinema - Centro de Información de Películas

Un centro de películas similar a HBO Max o Prime Video, desarrollado en **Kotlin** usando **Android Studio** La aplicación ofrece una experiencia intuitiva para explorar películas populares, ver detalles, y gestionar listas personalizadas.

## 📖 Índice

1. [Descripción General](#-descripción-general)
2. [Características](#-características)
3. [Instalación](#-instalación)
4. [Uso](#-uso)
5. [Arquitectura](#-arquitectura)
6. [Tecnologías Utilizadas](#-tecnologías-utilizadas)

---

## 💡 Descripción General

**InfoCinema** es una aplicación móvil que permite a los usuarios explorar las películas más populares del momento y acceder a detalles como sinopsis, elenco, y calificaciones. La app incluye una interfaz amigable con un diseño moderno que se adapta tanto a dispositivos móviles como tablets.

---

## ✨ Características

- **Exploración de películas populares**: Lista de películas destacadas con información relevante.
- **Búsqueda personalizada**: Los usuarios pueden buscar películas por nombre o género.
- **Top 10 dinámico**: Un **GridLayout** con las 10 mejores películas, que permite desplazamiento vertical. - **Sistema de favoritos**: Los usuarios pueden guardar películas para verlas después.
- **Perfil personalizable**: Soporte para usuarios y diferentes roles (como administrador para gestionar contenido).

---

## 🛠 Instalación

### Requisitos

- **Android Studio** (versión 2022.2 o superior).
- **Java 11** o superior.
- Emulador de Android o un dispositivo físico con Android 7.0 (API 24) o superior.

---

## 🚀 Uso

### Uso

- **Pantalla principal:** Muestra el Top 10 de películas con desplazamiento vertical.
- **Búsqueda:** Accede al icono de búsqueda para encontrar películas específicas.
- **Favoritos:** Agrega películas a favoritos pulsando en el icono de corazón.
- **Detalles:** Al seleccionar una película, verás la sinopsis, reparto y más información.
- **Perfil:** Gestiona tus listas de películas desde el menú de perfil.

---

## 🏗 Arquitectura

### Arquitectura

- **MVVM (Model-View-ViewModel):** Para mantener una separación clara entre la UI y la lógica de negocio.
- **Room Database:** Para almacenar datos de películas y favoritos localmente.
- **Retrofit:** Para consumir APIs externas y obtener información de películas. - **LiveData:** Gestión de estados en tiempo real en la UI.

---

## 💻 Tecnologías Utilizadas

### Tecnologías Utilizadas

- **Kotlin:** Lenguaje de programación principal.
- **Android Studio:** IDE de desarrollo.
- **Material Design:** Para una UI moderna
