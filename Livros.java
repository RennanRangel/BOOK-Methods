
public class Livro {
   String titulo;
   String autor;
    int numerodepaginas;
   boolean emprestado;


   public Livro(String titulo, String autor,int numerodepaginas, boolean emprestado) {
       this.titulo = titulo;
       this.autor = autor;
       this.numerodepaginas = numerodepaginas;
       this.emprestado = emprestado;


   }
   public Livro() {
   }


   void emprestar() {
       this.emprestado = true;


   }




   void devolver() {
       if (this.emprestado = false){
           System.out.println("Livro devolvido");
       }


   }


      public String status() {
       if(this.emprestado = true){
          
       }


          return "Livro emprestado";
      }


   void setNumerodepaginas(int paginas) {
         if(numerodepaginas <= 0){
             System.out.println("Numero de paginas invalido");
         }
   }


}
