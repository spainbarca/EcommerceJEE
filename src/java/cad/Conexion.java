/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    // Método principal para realizar la conexión
    public static Connection conectar() {
        // URL de conexión, usuario y contraseña de la base de datos
        String url = "jdbc:mysql://localhost:3306/ecommerce_db"; // Cambia "nombre_base_datos" con tu base de datos
        String username = "root"; // Cambia "tu_usuario" por tu nombre de usuario de MySQL
        String password = ""; // Cambia "tu_contraseña" por tu contraseña de MySQL

        // Estableciendo conexión
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Conexión exitosa a la base de datos MySQL!");

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaCad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
