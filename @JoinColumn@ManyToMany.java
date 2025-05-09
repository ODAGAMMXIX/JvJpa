@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ... outros atributos de Pedido

    @ManyToOne
    @JoinColumn(name = "cliente_id") // A coluna 'cliente_id' em Pedido referencia a chave primária de Cliente
    private Cliente cliente;

    // ... getters e setters
}

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ... outros atributos de Cliente

    // @OneToMany(mappedBy = "cliente") // O lado inverso do relacionamento está em Pedido
    // private List<Pedido> pedidos;

    // ... getters e setters
}
