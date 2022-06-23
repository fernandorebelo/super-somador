# Super Somador

<html> <p text-align: center>O Super Somador funciona da seguinte maneira: São inseridos dois valores. Depois, ao clicar em CALCULAR INTERVALO, é  mostrado a soma dos números que estão  dentro do intervalo de 2 a 5.</p> <p text-align: center>Ex: Números escolhidos: 2 e 5</p>  <p text-align: center>Calcular intervalo = 2+3+4+5</p>  <p text-align: center>Resultado = 14</p>
  
  ## A interface gráfica GUI foi construída com SWING no NetBeans.

![image](https://user-images.githubusercontent.com/94297628/175293153-e1e74b40-eb20-4a18-be52-7328567625f3.png)
  
  ## Foi adicionado tratamento para que não pudesse dar entrada vazia ou com letras.
![image](https://user-images.githubusercontent.com/94297628/175293208-6a6f1cdd-ee05-457f-80b2-9e075308dbc1.png)
![image](https://user-images.githubusercontent.com/94297628/175293282-f64272b0-bc92-432d-aa0f-c3eda478e10d.png)
  
  ## Ao adicionar os valores é mostrado a soma do intervalo ao usuário.
![image](https://user-images.githubusercontent.com/94297628/175293328-d5c212bd-a729-4c6e-873d-9c9d7d309803.png)

  ## Lógica por trás do botão CALCULAR INTERVALO
  
  A primeira condição verifica se os campos estão vazios. Caso seja verdadeiro exibe a mensagem para preencher os campos.
  
Caso os campos estejam preenchidos e sejam números inteiros é instanciado o método para cálculo da soma de intervalos.
  
Para que o usuário não insira letras ou outros caracteres, o método foi colocado em uma exceção try-catch, exibindo mensagem para o usuário inserir apenas número.
  
    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                              
          try {

              if(campoPrimeiroValor.getText().isBlank() || campoSegundoValor.getText().isBlank()){
              resultadoSoma.setText("Digite um número no espaço em branco.");
          }else{
              Somador somador = new Somador();
          int resultado = somador.calculoIntervalo(Integer.parseInt(campoPrimeiroValor.getText()), Integer.parseInt(campoSegundoValor.getText()));
          resultadoSoma.setText(Integer.toString(resultado));
          }

          } catch (NumberFormatException e) {
              resultadoSoma.setText("Digite apenas números e sem espaços.");
          }
      }  
  
  ## Lógica por trás do método de Cálculo dos Intervalos
  
  Foi criado uma classe específica para este método e criada duas variáveis devidamente encapsuladas.
  
  No método calcularIntervalo é solicitado dois parâmetros e estes valores são colocados dentro das variáveis da classe.
  
  É somado o primeiro valor indicado e o último, tendo em vista que eles serão somados de qualquer maneira, e depois colocado na variável soma.
  
  Depois é percorrido o intervalo entre o primeiro valor e o último. Cada valor percorrido é adicionado à variável soma (que já contém a soma do primeiro e último valor).
  
  Logo esta variável soma é retornada pelo método com o valor final da soma do intervalo indicado.
  
  
    public class Somador {
      private Integer valor1;
      private Integer valor2;

      public int calculoIntervalo(int v1, int v2){
          this.valor1 = v1;
          this.valor2 = v2;
          int soma = getValor1() + getValor2();
          for(int i = getValor1(); i < getValor2()-1; i++){
              soma += i+1;
          }
          return soma;
      }
