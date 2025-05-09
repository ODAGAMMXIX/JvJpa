@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ... outros atributos de Aluno

    @ManyToMany
    @JoinTable(
        name = "aluno_curso",
        joinColumns = @JoinColumn(name = "aluno_id"),
        inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private List<Curso> cursos;

    // ... getters e setters
}

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ... outros atributos de Curso

    @ManyToMany(mappedBy = "cursos") // O lado inverso do relacionamento está em Aluno
    private List<Aluno> alunos;

    // ... getters e setters
}
