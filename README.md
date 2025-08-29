# 💰 Sistema Bancário Simples

**Um aplicativo Java de linha de comando para gerenciar contas bancárias com operações básicas.**

---

## 🚀 Funcionalidades
- 🔍 **Consultar Saldo**: Veja o saldo atual da conta.
- 💸 **Receber Valor**: Adicione dinheiro à conta.
- 🔄 **Transferir Valor**: Transfira dinheiro com validação de saldo.
- 🚪 **Sair**: Encerre o programa com uma mensagem amigável.

---

## 📋 Como Usar

### Pré-requisitos
- ☕ **JDK 8+** instalado.
- Terminal ou IDE (IntelliJ, Eclipse, VS Code).

### Passos Rápidos
1. **Compilar**:
   ```bash
   javac Main.java
   ```
2. **Executar**:
   ```bash
   java Main
   ```
3. **Navegar**:
   - Escolha opções de 1 a 4 no menu.
   - Siga as instruções no terminal.

---

## 📷 Exemplo de Saída
```
**************************************************************
Dados Iniciais do Cliente:

Nome: Thiago de Sousa
Tipo Conta: Corrente
Saldo: 1500.0
**************************************************************

OPERAÇÕES

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:
```

---

## 🛠 Estrutura do Código
- **Arquivo**: `Main.java`
- **Variáveis**:
  - `nome`: Thiago de Sousa
  - `tipoConta`: Corrente
  - `saldo`: 1500.0
- **Lógica**:
  - Menu interativo com `Scanner` e loop `do-while`.
  - Operações gerenciadas por `switch`.

---

## 🔮 Melhorias Futuras
- 📦 Persistência de dados.
- 🔒 Autenticação de usuário.
- 🏦 Mais tipos de conta.
- 🖼 Interface gráfica (JavaFX/Swing).
- ✅ Validação avançada de entradas.

---

## 📜 Licença
**MIT** - Use livremente, modifique e compartilhe!
