package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operacoes/strings")
public class StringsController {

    @GetMapping("/aluno")
    public String visualizarAluno() {
        return "Ricardo Pinto nº5273";
    }

    @GetMapping("/cumprimentar")
    public String cumprimento(
            @RequestParam String nome
    ) {
        return "Olá " + nome;
    }

    @GetMapping("/contar-caracteres")
    public int contarCaracteres(
            @RequestParam String texto
    ){
        return texto.length();
    }

    @GetMapping("/maiusculas")
    public String meterMaiusculas(
            @RequestParam String texto
    ){
        return texto.toUpperCase();
    }

    @GetMapping("/inverter")
    public String invertirFrase(
            @RequestParam String texto
    ){
        String output = "";
        for(int i = texto.length() - 1; i >= 0; i++) {
            output += texto.charAt(i);
        }
        return output;
    }

    @GetMapping("/contar-vogais")
    public int contarVogais(
            @RequestParam String texto
    ){
        int count=0;
        for (int i=0; i<texto.length(); i++) {
            char c = texto.charAt(i);
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                    c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }

    @GetMapping("/contar-caracteres-string")
    public int contarCaracteres(
            @RequestParam String texto1,
            @RequestParam String texto2
    ){
        return texto1.length() + texto2.length();
    }

    @GetMapping("/contar-palavras")
    public int contarPalavras(
            @RequestParam String texto
    ){
        String[] palavras = texto.split(" ");
        return palavras.length;
    }

    @GetMapping ("/contar-letras")
    public int contarLetras(
            @RequestParam String palavra,
            @RequestParam char letra
    ){
        int count = 0;
        for(int i = 0; i< palavra.length(); i++){
            if(palavra.charAt(i) == letra){
                count ++;
            }
        }
        return count;
    }
}