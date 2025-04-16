📁 projeto: Multiplicação Recursiva por Somatório

📝 descricao: >
  Aplicação em Java que utiliza uma função recursiva para realizar a multiplicação
  de dois números inteiros positivos A e B utilizando apenas somas sucessivas,
  sem usar o operador de multiplicação (*). Perfeita pra treinar recursão! 💡💻

🗂️ estrutura_de_arquivos:
  - 📄 caminho: src/controller/MultiplicaSRecursiva.java
    descricao: Contém o método recursivo que realiza a multiplicação 💭
  - 📄 caminho: src/view/Principal.java
    descricao: Responsável pela interação com o usuário e exibição do resultado 🖼️

🧠 logica_da_recursividade:
  metodo: MultSRecursiva(int na, int nb, int contador)
  explicacao:
    - ✋ condicao_de_parada: >
        Retorna 0 se:
        - na == 0 ou nb == 0 (qualquer número multiplicado por zero é zero)
        - contador == nb (atingiu o número de somas necessárias)
    - 🔁 relacao_recursiva: >
        Soma-se 'na' ao resultado da chamada recursiva com contador + 1:
        return na + MultSRecursiva(na, nb, contador + 1)

💬 exemplo_execucao:
  entrada:
    - Primeiro número: 4
    - Segundo número: 3
  saida: A multiplicação de 4 por 3 é igual a 12 🎯

📥 entrada:
  tipo: JOptionPane
  descricao: O usuário informa dois valores inteiros positivos via caixas de diálogo 🧾

📤 saida:
  tipo: JOptionPane
  descricao: Exibe o resultado final da multiplicação em uma caixa de mensagem 📢

📌 observacoes:
  - ✅ Simula multiplicação de na por nb através de somas sucessivas.
  - 🧮 Usa contador como controle para chamadas recursivas.
  - 🧼 Código organizado em camadas (lógica e interface separadas).

👨‍💻 autor: **Lucas Bezerra de Macedo**
