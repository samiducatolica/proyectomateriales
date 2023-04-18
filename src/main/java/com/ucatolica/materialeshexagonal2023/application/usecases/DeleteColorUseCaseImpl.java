package com.ucatolica.materialeshexagonal2023.application.usecases;

import com.ucatolica.materialeshexagonal2023.domain.ports.input.DeleteColorUseCase;
import com.ucatolica.materialeshexagonal2023.domain.ports.output.ColorRepositoryPort;

/**
 * La clase DeleteColorUseCaseImpl es una implementación de la interfaz DeleteColorUseCase
 * que representa el caso de uso "Eliminar color", que permite la eliminacion de un color mediante el uso del puerto
 *
 * La implementación utiliza el patrón de inyección de dependencias para obtener una instancia
 * del puerto de repositorio de colores
 */
public class DeleteColorUseCaseImpl implements DeleteColorUseCase {

    /**
     *  El puerto de salida que se utiliza para realizar la eliminacion del objeto "Color".
     */
    private final ColorRepositoryPort colorRepositoryPort;


    public DeleteColorUseCaseImpl(ColorRepositoryPort colorRepositoryPort) {
        this.colorRepositoryPort = colorRepositoryPort;
    }


    /**
     Elimina un objeto "Color" del sistema, utilizando su identificador único.
     @param id - El identificador único del objeto "Color" que se desea eliminar del sistema.
     @return - Verdadero si el objeto "Color" se eliminó con éxito, falso de lo contrario.
     */
    @Override
    public boolean deleteColor(Long id) {
        return colorRepositoryPort.deleteById(id);
    }
}
