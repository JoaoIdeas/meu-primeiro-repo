package io.github.JoaoIdeas.produtosapi.repository;

import io.github.JoaoIdeas.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
