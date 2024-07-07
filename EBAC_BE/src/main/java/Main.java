
import annotations.Tabela;
import model.Carro;
import model.CarroSimples;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {

            CarroSimples carroSimples = new CarroSimples("Fusca");
            Annotation[] annotations = carroSimples.getClass().getAnnotations();

            if (carroSimples.getClass().isAnnotationPresent(Tabela.class)){

                Tabela tabela_nome = carroSimples.getClass().getAnnotation(Tabela.class);
                System.out.println("O nome da tabela é: " + tabela_nome.value());
            }




    }
}
