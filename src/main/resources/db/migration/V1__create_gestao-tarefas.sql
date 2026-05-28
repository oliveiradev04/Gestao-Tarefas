CREATE TABLE usuarios (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE tarefas(
    id BIGSERIAL PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    descricao VARCHAR(150),
    status VARCHAR(35),
    usuario_id BIGINT NOT NULL,

    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);