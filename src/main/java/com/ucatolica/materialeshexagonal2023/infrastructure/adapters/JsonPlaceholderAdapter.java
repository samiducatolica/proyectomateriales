package com.ucatolica.materialeshexagonal2023.infrastructure.adapters;

import com.ucatolica.materialeshexagonal2023.domain.model.AdditionalColorInfo;
import com.ucatolica.materialeshexagonal2023.domain.ports.output.ExternalServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class JsonPlaceholderAdapter implements ExternalServicePort {

    /**
     * @apiNote
     * El objeto RestTemplate es una clase de Spring que proporciona métodos para realizar solicitudes HTTP
     * a través de una API fácil de usar.
     * En este caso, se utiliza para consumir servicios externos RESTful y obtener información adicional de un color.
     * El objeto se inicializa en el constructor de la clase y se utiliza para realizar solicitudes GET a las API JSONPlaceholder. En caso de que la respuesta de la solicitud no sea nula, se utiliza para obtener información adicional del color.
     */
    private final RestTemplate restTemplate;

    /**
     * Constructor de la clase que inicializa la variable restTemplate.
     */
    public JsonPlaceholderAdapter() {
        restTemplate = new RestTemplate();
    }


    /**
     * Método que obtiene información adicional de un color a través de un servicio externo.
     * @param colorId el identificador del color del que se desea obtener información adicional.
     * @return un objeto de tipo AdditionalColorInfo que contiene el identificador del color y el número de registros.
     * Si no se encuentra la información del color, el método retorna null.
     */
    @Override
    public AdditionalColorInfo getAdditionalColorInfo(Long colorId) {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/" + colorId;
        ResponseEntity<JsonPlaceHolderTodo> response = restTemplate.getForEntity(apiUrl, JsonPlaceHolderTodo.class);
        JsonPlaceHolderTodo todo = response.getBody();

        if (todo == null){
            return null;
        }
        apiUrl = "https://jsonplaceholder.typicode.com/colors/" + todo.getColorId();
        ResponseEntity<JsonPlaceHolderColor> colorResponse = restTemplate.getForEntity(apiUrl, JsonPlaceHolderColor.class);
        JsonPlaceHolderColor color = colorResponse.getBody();

        if (color == null){
            return null;
        }
        return new AdditionalColorInfo(color.getId(), color.getRegistrosColor());
    }


    /**
     * Clase interna que representa la respuesta del primer servicio externo.
     */
    private static class JsonPlaceHolderTodo {
        private Long id;
        private Long colorId;

        // get y set
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getColorId() {
            return colorId;
        }

        public void setColorId(Long colorId) {
            this.colorId = colorId;
        }
    }

    /**
     * Clase interna que representa la respuesta del segundo servicio externo.
     */
    private static class JsonPlaceHolderColor {
        private Long id;
        private int registrosColor;


        // get y set


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public int getRegistrosColor() {
            return registrosColor;
        }

        public void setRegistrosColor(int registrosColor) {
            this.registrosColor = registrosColor;
        }
    }


}
