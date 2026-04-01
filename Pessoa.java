public class Pessoa {

        //definir atributos
        private String nome;
        private int idade;

        //construtor da clase
        public Pessoa() {
        }
        //metodos de encapsulamento
        public void setNome(String nome){
            this.nome = nome;
        }

        public  String getNome() {
            return nome;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }

        public  int getIdade() {
            return idade;
        }
        public void mostrarDados(){
            System.out.println("nome:"+getNome());
            System.out.println("idade:"+getIdade());
            // metodos de negocio
        }







}
