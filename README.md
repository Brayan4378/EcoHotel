El proyecto desarrollado en Java con Swing implementa un sistema de gestión para un EcoHotel Rural, aplicando el patrón Modelo-Vista-Controlador (MVC), DAO y DTO. La aplicación cuenta con varias interfaces gráficas (JFrame) para gestionar tres módulos principales:

Registro de huéspedes: permite almacenar datos como documento, nombre y teléfono.

Registro de habitaciones: gestiona habitaciones con tipo, capacidad y disponibilidad.

Registro de reservas: permite vincular huéspedes con habitaciones en fechas específicas.

Cada módulo se encuentra en una ventana separada, todas conectadas al menú principal. Se utilizan estructuras como ArrayList para almacenar datos temporalmente y se aplican validaciones y excepciones personalizadas para controlar la información ingresada por el usuario.

Problemas actuales
En la ventana de reservas no se cargan correctamente las habitaciones disponibles en el JComboBox.

Aunque se manejan excepciones para evitar datos inválidos, persisten errores a la hora de realizar una reserva.

Algunas ventanas se cierran completamente al navegar entre ellas, en lugar de ocultarse y volver al menú principal, lo cual afecta la experiencia de usuario.
