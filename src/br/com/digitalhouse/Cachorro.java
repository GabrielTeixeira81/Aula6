package br.com.digitalhouse;

public class Cachorro extends Animal {

    private String nome;

    public Cachorro(String novoTamanho, String novaRaca, String novoNome) {
        super(novoTamanho, novaRaca);
        nome = novoNome;
    }

        public void setNome(String novoNome){
            nome = novoNome;
        }
        public String getNome() {
            return nome;
        }

        @Override
        public boolean ehMamifero(){
            return true;
        }
    }

