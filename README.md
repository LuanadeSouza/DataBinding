# DataBinding

O aplicativo possui uma única tela que mostra alguns dados estáticos e alguns dados observáveis,
o que significa que, quando os dados forem alterados, a IU será atualizada automaticamente.

Os dados são fornecidos por um ViewModel. Model-View-ViewModel é um padrão de camada de apresentação
que funciona muito bem com Data Binding.


O Android se comunica para frente e para trás com o View.  
O View observa o ViewModel e envia ações do usuário para ele.
Fora da camada de apresentação, existem outras camadas representadas por interatores ou um repositório.
