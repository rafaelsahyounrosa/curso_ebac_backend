import model.app.Application;
import model.factories.EsportivoFactory;
import model.factories.ICarFactory;
import model.factories.UtilitarioFactory;


import java.util.Scanner;

public class Main {

    private static Application configureApplication(String categoria) {

        Application application;
        ICarFactory carFactory;

        switch (categoria.toLowerCase()) {
            case "esportivo":
                carFactory = new EsportivoFactory();
                break;
            default:
                carFactory = new UtilitarioFactory();
        }

        application = new Application(carFactory);
        return application;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe se é esportivo ou utilitario: ");
        String categoria = scanner.nextLine();
        scanner.close();
        Application application = configureApplication(categoria);
        application.preparaCar();

    }
}
