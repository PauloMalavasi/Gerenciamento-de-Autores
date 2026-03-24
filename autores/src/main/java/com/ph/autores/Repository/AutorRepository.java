package com.ph.autores.Repository;

import com.ph.autores.Entity.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository <AutorEntity, Long> {
}
