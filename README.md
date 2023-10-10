# Singleton para Gerenciamento da Equipe de QA

Este projeto implementa uma um sistema de gerenciamento da equipe de testadores. Ele permite adicionar, remover e acessar informações sobre a equipe de QA.

# Funcionalidades
Adicionar membros de teste à equipe
Remover membros de teste à equipe
Acessar lista de membros da equipe

# Como usar
Use a classe `TestTeamManager` para gerenciar a equipe de testadores.

# Códigos específicos
// Adicionar novo membro à equipe
TestTeamManager manager = TestTeamManager.getInstance();
manager.addQaTester(qa);

// Remover um membro da equipe
TestTeamManager manager = TestTeamManager.getInstance();
manager.removeQaTester(qa);

// Obter a lista de membros na equipe
TestTeamManager manager = TestTeamManager.getInstance();
List<QaTester> team = manager.getQaTesters();

for (QaTester qa : team) {
    System.out.println("Nome: " + qa.getName() + ", ID: " + qa.getMemberId());
}
