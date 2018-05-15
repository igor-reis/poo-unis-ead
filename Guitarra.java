Package unidade_1;

//declara��o da classe
public class Guitarra{
  private String numeroSerie, fabricante, modelo, tipo, madeira;
  private double preco;

  //Cria��o do construtor da classe Guitarra
  public Guitarra(
    String numeroSerie, String fabricante, 
    String modelo, String tipo, 
    String madeira, double preco
  ) {
      this.numeroSerie = numeroSerie;
      this.fabricante = fabricante;
      this.modelo = modelo;
      this.tipo = tipo;
      this.madeira = madeira;
      this.preco = preco;
  }

  public String getNumeroSerie(){
    return numeroSerie;
  }

  public void setNumeroSerie(numeroSerie){
    this.numeroSerie = numeroSerie;
  }

  public String getFabricante(){
    return fabricante;
  }

  public void setFabricante(fabricante){
    this.fabricante = fabricante;
  }

  public String getModelo(){
    return modelo;
  }

  public void setModelo(modelo){
    this.modelo = modelo;
  }

  public String getTipo(){
    return tipo;
  }

  public void setTipo(tipo){
    this.tipo = tipo;
  }

  public String getMadeira(){
    return madeira;
  }

  public void setMadeira(madeira){
    this.madeira = madeira;
  }

  public double getPreco(){
    return preco;
  }

  public void setPreco(preco){
    this.preco = preco;
  }

  //o m�todo main() � o m�todo principal da classe
  public static void main(String[] args){
    //instanciamos um objeto chamado "minhaGuitarra" que ser� do tipo "Guitarra"
    //Os valores passados s�o usados pelo construtor da classe para criar
    //o objeto
    Guitarra minhaGuitarra = new Guitarra("01020304", "fender", "telecaster",
                                           "el�trica", "mogno", 1500);

    System.out.println(minhaGuitarra.getNumeroSerie());
    System.out.println(minhaGuitarra.getMadeira());
    System.out.println(minhaGuitarra.getPreco());
    System.out.println(minhaGuitarra.getTipo());
  }
}