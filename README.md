# DataBinding

O aplicativo possui uma única tela que mostra alguns dados estáticos e alguns dados observáveis,
o que significa que, quando os dados forem alterados, a IU será atualizada automaticamente.

Os dados são fornecidos por um ViewModel. Model-View-ViewModel é um padrão de camada de apresentação
que funciona muito bem com Data Binding.

<img width="749" alt="Screen Shot 2021-05-27 at 18 52 02" src="https://user-images.githubusercontent.com/49947803/119901941-f0826900-bf1c-11eb-9bb1-165ffc54139c.png">

O Android se comunica para frente e para trás com o View.  
O View observa o ViewModel e envia ações do usuário para ele.
Fora da camada de apresentação, existem outras camadas representadas por interatores ou um repositório.

<img width="250" src="https://user-images.githubusercontent.com/49947803/125300229-34c89d80-e300-11eb-9b3e-b08fea585343.gif">
