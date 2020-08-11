package mapa.bicicleta;

import java.util.Scanner;

public class MAPABicicleta {

    
    public static void main(String[] args) {
        int opcao;
        Bicicleta[] bikes = new Bicicleta[10];
        bikes[0] = new Bicicleta(1, "verde", "Barra circular", 1, 150.00);
        bikes[1] = new Bicicleta(2, "vermelha", "Mountain Bike", 18, 250.00);
        bikes[2] = new Bicicleta();
        
        Cliente[] clientes = new Cliente[10];
        clientes[0] = new Cliente("Matheus", "123.456.789-00", 1, "98428-2296");
        clientes[1] = new Cliente("Joaquim", "985.125.325-99", 2, "99445-5885");
        clientes[2] = new Cliente();
        
        
        
        /*bikes[0].codigoBicicleta = 1;
        bikes[0].cor = "verde";
        bikes[0].tipo = "Barra circular";
        bikes[0].marcha = 0;
        bikes[0].valorAluguel = 150.00;

        bikes[1].codigoBicicleta = 2;
        bikes[1].cor = "vermelha";
        bikes[1].tipo = "Mountain Bike";
        bikes[1].marcha = 18;
        bikes[1].valorAluguel = 250.00; */
        
        
        
        while(true){
        System.out.println("-------------------------------");
        System.out.println("Digite a sua opção \n");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar bicicletas");
        System.out.println("2 - Listar bicicletas");
        System.out.println("3 - Alterar dados da bicicleta");
        System.out.println("4 - Cadastrar novo cliente");
        System.out.println("5 - Listar clientes");
        System.out.println("6 - Alterar dados do cliente");
        System.out.println("7 - Abrir contrato");
        System.out.println("8 - Listar contratos");
        System.out.println ("Opção: ");
        
        Scanner scan = new Scanner(System.in);
        
        opcao = scan.nextInt();
        
        
        if(opcao == 0) {
            System.out.println("O sistema será encerrado.");
            System.exit(0);
        }
        
        switch(opcao) {
            case 1: System.out.println("Cadastrar nova bicicleta: \n");
            
                bikes[2] = new Bicicleta(3, "amarela", "Street", 1, 100.00);
                    /*bikes[2].setCodigoBicicleta = 3;
                    bikes[2].cor = "amarela";
                    bikes[2].tipo = "Street";
                    bikes[2].marcha = 1;
                    bikes[2].valorAluguel = 100.00;*/
                    bikes[2].cadastrarBikes();
                
            break;
            
            case 2: System.out.println("Listando bicicletas: ");
            
                    for(int i = 0; i < bikes.length; i++) {
                    Bicicleta bike = new Bicicleta();
                    System.out.println(bikes[i].listarBikes());
                    bikes[i] = bike;
                }
            
            break;
            
                /*System.out.println("Código da Bicicleta: " + bikes[0].getCodigoBicicleta() + "\n" + 
                            "Cor: " + bikes[0].getCor() + "\n" + 
                            "Tipo: " + bikes[0].getTipo() + "\n" + 
                            "Marchas: " + bikes[0].getMarcha() + "\n" + 
                            "Valor do aluguel: " + bikes[0].getValorAluguel() + "\n\n");
        
                    System.out.println("Código da Bicicleta: " + bikes[1].getCodigoBicicleta() + "\n" + 
                            "Cor: " + bikes[1].getCor() + "\n" + 
                            "Tipo: " + bikes[1].getTipo() + "\n" + 
                            "Marchas: " + bikes[1].getMarcha() + "\n" + 
                            "Valor do aluguel: " + bikes[1].getValorAluguel()); */
            
                    
            case 3: System.out.println("Alterar dados da bicicleta");
            break;
            
            case 4: System.out.println("Cadastrar novo cliente: \n");
                    clientes[2] = new Cliente("Vivian", "012.326.789-44", 3, "97458-5521");
                    clientes[2].cadastrarClientes();
            break;
            
            case 5: System.out.println("Listando clientes: ");
            
                    for(int i = 0; i < clientes.length; i++) {
                        Cliente cliente = new Cliente();
                        System.out.println(clientes[i].listarClientes());
                        clientes[i] = cliente;
                    }
            break;
            
            case 6: System.out.println("Alterar dados do cliente");
            break;
            
            case 7: System.out.println("Abrindo contrato...");
            break;
            
            case 8 : System.out.println("Listando contratos...");
            break;
            
            default: System.out.println("Opção inválida");
            break;
        }
        
        
        }
    
        
    }
       
        
    }
    
