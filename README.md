# NiceStart <img src="./Resources/logoVectorial_white.svg" width="30">

Este es un proyecto para la asignatura de Desarrollo de Interfaces. La idea es crear un prototipo de aplicación sencillo para practicar el diseño de layouts.
## Lenguajes
- Java
- XML
- Gradle

## Características Técnicas
- ViewBinding: Se utiliza en todas las actividades para reemplazar el findViewById, para evitar null pointers exceptions.
- Persistencia de Datos (SharedPreferences): Se utiliza para guardar el nombre de usuario en un ligero almacenamiento local, y mostrarlo en el perfil.
- WebView Dinámico: La pantalla principal genera código HTML/CSS localmente para incrustar imágenes aleatorias de fuentes externas(thisbeachdoesnotexist).
- Animaciones: Uso de AnimationsUtil y lottie.

## Librerías y Dependencias

| Librería | Uso en el proyecto |
| :--- | :--- |
| Glide | Carga de imágenes remotas (fondos, avatares) con transformación circular (circleCrop) y recorte (centerCrop). |
| SweetAlert | Diálogos modales personalizados y estéticos para mensajes de éxito o error en el Login/Registro. |
| SwipeRefreshLayout | Implementación del gesto "deslizar para actualizar" en la pantalla principal para recargar imágenes. |
| Material Components | Uso de MaterialAlertDialogBuilder y componentes de UI modernos. |
| Lottie | Integración de animaciones vectoriales de alta calidad (JSON). |

## Internacionalización
La aplicación cuenta con soporte multi-idioma, adaptando todos los recursos de texto (`strings.xml`) según la configuración del dispositivo.

| Español  | Inglés | Japonés |
| :---: | :---: | :---: |
| <img src="./Resources/ResourcesReadMe/spanish.png" width="200"> | <img src="./Resources/ResourcesReadMe/english.png" width="200"> | <img src="./Resources/ResourcesReadMe/japanese.png" width="200"> |

## Personalización
Soporte nativo para el cambio entre Modo Claro y Modo Oscuro, respetando las preferencias del sistema.

| Modo Claro | Modo Oscuro |
| :---: | :---: |
| <img src="./Resources/ResourcesReadMe/light_mode.png" width="200"> | <img src="./Resources/ResourcesReadMe/dark_mode.png" width="200"> |

## Bottom app bar

| Bottom App Bar | Menú Contextual |
| :---: | :---: |
| <img src="./Resources/ResourcesReadMe/light_mode.png" width="200"> | <img src="./Resources/ResourcesReadMe/bab_menu.png" width="200"> |

## Pantallas de la App

### Vista Principal y Autenticación

| Login | Sign Up |
| :---: | :---: |
| <img src="./Resources/ResourcesReadMe/Login.png" width="200"> | <img src="./Resources/ResourcesReadMe/SingUp.png" width="200"> |

> **Nota:** El sistema de login valida que los campos no estén vacíos y guarda el nombre de usuario localmente para mostrarlo en el Perfil.

### Funcionalidades

| Main  | Perfil de Usuario |
| :---: | :---: |
| <img src="./Resources/ResourcesReadMe/Main.png" width="200"> | <img src="./Resources/ResourcesReadMe/Profile.png" width="200"> |

### Feedback y Diálogos

| Login Success | Login Error | Main Menu | Dialog Alert | Context |
| :---: | :---: | :---: | :---: |:---:|
| <img src="./Resources/ResourcesReadMe/LoginSuccess.png" width="200"> | <img src="./Resources/ResourcesReadMe/LoginError.png" width="200"> | <img src="./Resources/ResourcesReadMe/MainNavBarMenu.png" width="200"> | <img src="./Resources/ResourcesReadMe/Dialog.png" width="200"> | <img src="./Resources/ResourcesReadMe/context.png" width="200"> |

### Animaciones

| Lottie | Splash Screen | Refresh |
| :---: | :---: | :---: |
| <img src="./Resources/ResourcesReadMe/LottieAnimation.gif" width="200"> | <img src="./Resources/ResourcesReadMe/SplashAnimation.gif" width="200"> | <img src="./Resources/ResourcesReadMe/SwipeRefresh.gif" width="200"> |

---

### Paleta de Colores

![black](https://img.shields.io/badge/black-%23000000?style=for-the-badge&color=000000)
![white](https://img.shields.io/badge/white-%23FFFFFF?style=for-the-badge&color=FFFFFF)
![color_background](https://img.shields.io/badge/color_background-%2300060D?style=for-the-badge&color=00060D)
![color_surface_blue](https://img.shields.io/badge/color_surface_blue-%23122640?style=for-the-badge&color=122640)
![color_surface_white](https://img.shields.io/badge/color_surface_white-%23E0E3E7?style=for-the-badge&color=E0E3E7)
![color_text_primary_white](https://img.shields.io/badge/color_text_primary_white-%23E0E3E7?style=for-the-badge&color=E0E3E7)
![color_text_primary_black](https://img.shields.io/badge/color_text_primary_black-%23000000?style=for-the-badge&color=000000)
![color_text_secondary_white](https://img.shields.io/badge/color_text_secondary_white-%23A1A2A6?style=for-the-badge&color=A1A2A6)
![color_text_secondary_black](https://img.shields.io/badge/color_text_secondary_black-%23333333?style=for-the-badge&color=333333)
![color_accent_primary](https://img.shields.io/badge/color_accent_primary-%23A8C7FA?style=for-the-badge&color=A8C7FA)
![color_accent_text](https://img.shields.io/badge/color_accent_text-%2300325A?style=for-the-badge&color=00325A)

---

> [!NOTE]
> **Estado del proyecto**:
> Esta app es una práctica de clase que aún se encuentra en desarrollo activo.