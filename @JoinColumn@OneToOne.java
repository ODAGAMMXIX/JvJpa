@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ... outros atributos de Pessoa

    @OneToOne
    @JoinColumn(name = "passaporte_id", unique = true) // 'passaporte_id' em Pessoa referencia Passaporte e deve ser único
    private Passaporte passaporte;

    // ... getters e setters
}

@Entity
public class Passaporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ... outros atributos de Passaporte

    // @OneToOne(mappedBy = "passaporte") // Lado inverso, se houver
    // private Pessoa pessoa;

    // ... getters e setters
}
