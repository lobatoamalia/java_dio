// Interfaces
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe principal que implementa todas as interfaces
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    
    public IPhone(String modelo) {
        this.modelo = modelo;
    }
    
    // Implementação dos métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    
    // Implementação dos métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
    // Implementação dos métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
    
    // Método main para demonstração
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone("iPhone 15 Pro");
        
        // Testando Reprodutor Musical
        meuIPhone.selecionarMusica("Bohemian Rhapsody");
        meuIPhone.tocar();
        meuIPhone.pausar();
        
        // Testando Aparelho Telefônico
        meuIPhone.ligar("(11) 98765-4321");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Testando Navegador na Internet
        meuIPhone.exibirPagina("https://www.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}