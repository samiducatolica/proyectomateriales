package com.ucatolica.materialeshexagonal2023.infrastructure.config;

import com.ucatolica.materialeshexagonal2023.application.services.ColorService;
import com.ucatolica.materialeshexagonal2023.application.usecases.*;
import com.ucatolica.materialeshexagonal2023.domain.ports.input.GetAdditionalColorInfoUseCase;
import com.ucatolica.materialeshexagonal2023.domain.ports.output.ColorRepositoryPort;
import com.ucatolica.materialeshexagonal2023.domain.ports.output.ExternalServicePort;
import com.ucatolica.materialeshexagonal2023.infrastructure.adapters.JsonPlaceholderAdapter;
import com.ucatolica.materialeshexagonal2023.infrastructure.repositories.JpaColorRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Clase de configuración de Spring que define los beans necesarios para la aplicación.
 */
@Configuration
public class ApplicationConfig {

    /**
     * Define el bean ColorService que se encarga de manejar la lógica de negocio para los objetos Color.
     *
     * @param colorRepositoryPort el puerto de repositorio para los objetos Color
     * @param getAdditionalColorInfoUseCase el caso de uso para obtener información adicional de los objetos Color
     * @return el servicio de objetos Color
     */
    @Bean
    public ColorService colorService(ColorRepositoryPort colorRepositoryPort, GetAdditionalColorInfoUseCase getAdditionalColorInfoUseCase){
        return new ColorService(
                new CreateColorUseCaseImpl(colorRepositoryPort),
                new RetrieveColorUseCaseImpl(colorRepositoryPort),
                new UpdateColorUseCaseImpl(colorRepositoryPort),
                new DeleteColorUseCaseImpl(colorRepositoryPort),
                getAdditionalColorInfoUseCase
        );
    }


    /**
     * Define el bean ColorRepositoryPort que se encarga de interactuar con la base de datos para los objetos Color.
     *
     * @param jpaColorRepositoryAdapter el adaptador de repositorio para los objetos Color
     * @return el puerto de repositorio para los objetos Color
     */
    @Bean
    public ColorRepositoryPort colorRepositoryPort(JpaColorRepositoryAdapter jpaColorRepositoryAdapter){
        return jpaColorRepositoryAdapter;
    }

    /**
     * Define el bean GetAdditionalColorInfoUseCase que se encarga de obtener información adicional de los objetos Color.
     *
     * @param externalServicePort el puerto de servicio externo para obtener información adicional de los objetos Color
     * @return el caso de uso para obtener información adicional de los objetos Color
     */
    @Bean
    public GetAdditionalColorInfoUseCase getAdditionalColorInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalColorInfoUseCaseImpl(externalServicePort);
    }

    /**
     * Define el bean JsonPlaceholderAdapter que se encarga de interactuar con un servicio externo para obtener información
     * adicional de los objetos Color.
     *
     * @return el adaptador para el servicio externo de los objetos Color
     */
    @Bean
    public JsonPlaceholderAdapter jsonPlaceholderAdapter() {

        return new JsonPlaceholderAdapter();
    }
}
