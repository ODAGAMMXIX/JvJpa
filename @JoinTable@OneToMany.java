@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ... outros atributos de Autor

    @OneToMany
    @JoinTable(
        name = "autor_livro",
        joinColumns = @JoinColumn(name = "autor_id"),
        inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    private List<Livro> livros;

    // ... getters e setters
}

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ... outros atributos de Livro

    // @ManyToMany(mappedBy = "autores") // Se fosse ManyToMany
    // private List<Autor> autores;

    // ... getters e setters
}
