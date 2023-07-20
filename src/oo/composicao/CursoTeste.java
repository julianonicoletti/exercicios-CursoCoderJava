package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Matemática básica");
        Curso curso2 = new Curso("Lógica");
        Curso curso3 = new Curso("Java");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno3);

        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno: curso1.alunos) {
            System.out.println("Estou matriculado no curso 1 ....");
            System.out.println("E meu nome é " + aluno.nome);
            System.out.println("E o nome do curso é " + curso1.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);
        System.out.println(aluno2.cursos);
        System.out.println(aluno3.cursos.get(2).alunos);
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");

        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }


    }
}
