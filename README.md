# 🌍 Diário de Bordo (Travel Log)

Este projeto é uma aplicação Android nativa desenvolvida em **Kotlin**, simulando um diário de viagens.

O objetivo principal do projeto é demonstrar a implementação de uma arquitetura de navegação robusta utilizando o **Jetpack Navigation Component** seguindo o padrão *Single Activity*.

## 📱 Funcionalidades

* **Navegação Inferior (Bottom Navigation):** Alternância fluida entre as abas Diário, Mapa e Galeria.
* **Detalhes da Viagem:** Navegação da tela Home para uma tela de detalhes que não faz parte da barra inferior.
* **Passagem de Dados Segura:** Uso de **SafeArgs** para enviar o ID da viagem clicada para a tela de detalhes.
* **Gestão de Fragmentos:** O app utiliza Fragments para todas as telas, gerenciados por um único `NavHost`.

## 🛠 Tecnologias e Componentes Utilizados

O projeto foi construído focando nas práticas modernas de desenvolvimento Android:

* **Linguagem:** [Kotlin](https://kotlinlang.org/)
* **Interface (UI):** XML com **ViewBinding**
* **Arquitetura:** Single Activity (Uma Activity, múltiplos Fragments)
* **Jetpack Navigation:**
    * **Navigation Graph:** Mapa visual das rotas do app.
    * **NavHostFragment:** Container onde as telas são trocadas.
    * **NavController:** O "gerente" que controla a navegação.
    * **NavigationUI:** Vinculação automática do `BottomNavigationView` com o grafo de navegação.
    * **SafeArgs Plugin:** Para passagem de argumentos (dados) entre telas com segurança de tipo.

## 🚀 Como rodar o projeto

### Pré-requisitos
* Android Studio Iguana ou superior.
* JDK 17 ou superior.

### Passos
1.  Clone este repositório:
    ```bash
    git clone [https://github.com/SEU-USUARIO/travel-log-android.git](https://github.com/SEU-USUARIO/travel-log-android.git)
    ```
2.  Abra o projeto no **Android Studio**.
3.  Aguarde a sincronização do Gradle (Sync).
4.  Conecte um dispositivo físico ou inicie um emulador.
5.  Execute o app (Shift + F10 ou botão Play).

## 🧩 Estrutura de Navegação

O fluxo de navegação foi definido da seguinte forma:

1.  **Menu Inferior:** Home (`HomeFragment`), Mapa (`MapFragment`), Galeria (`GalleryFragment`).
2.  **Fluxo Externo:** A partir da Home, é possível navegar para `TripDetailFragment`.
3.  **Argumentos:** O `TripDetailFragment` exige um argumento `tripId` (Integer) para ser aberto.

---

Desenvolvido por Clara Menezes 
