package bar1;

public class Menu {

    private String nome;
    private MenuItem prato;
    private MenuItem bebida;
    private MenuItem sobremesa;


    public Menu(String nome, MenuItem prato, MenuItem bebida, MenuItem sobremesa) {
        this.nome      = nome;
        this.prato     = prato;
        this.bebida    = bebida;
        this.sobremesa = sobremesa;
    }
}
