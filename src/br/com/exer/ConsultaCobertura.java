package br.com.exer;

import java.util.Optional;

/**
 * Created by BRUNO on 05/09/2017.
 */
public class ConsultaCobertura {
    public static void main(String[] args) {

        Motoristas motoristas = new Motoristas();
//Motorista  motorista = motoristas.porNome("João");

//String cobertura = motorista.getCaminhao().getSeguro().getCobertura();

//String cobertura ="Sem seguro";
/*if(motorista != null){
    Caminhao caminhao = motorista.getCaminhao();
    if(caminhao != null){
        Seguro seguro = caminhao.getSeguro();
        if(seguro != null){
            cobertura = seguro.getCobertura();
        }
    }
}*/
        String coberturaOpcional = motoristas.porNome("Joao")
                .flatMap(Motorista::getCaminhao)
                .flatMap(Caminhao::getSeguro)
                .map(Seguro::getCobertura)
                .orElse("Sem cobertura");

        System.out.println("A cobertura é: " + coberturaOpcional);
        //coberturaOpcional.ifPresent(System.out::println);
        //Optional<Motorista> motoristaOptional = motoristas.porNome("João");
        //usa o flatMap para agrupar
        //Optional<Caminhao> caminhaoOptional = motoristaOptional.flatMap(Motorista::getCaminhao);
        //System.out.println("A cobertura é: "+cobertura );

    }
}
