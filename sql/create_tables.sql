CREATE TABLE empresas (
    id VARCHAR(40) NOT NULL PRIMARY KEY,
    cnpj VARCHAR(20) UNIQUE NOT NULL,
    nome VARCHAR(50) NOT NULL, 
    cep VARCHAR(10) NOT NULL    
);

CREATE TABLE fornecedores (
    id VARCHAR(40) NOT NULL PRIMARY KEY,
    is_person BOOLEAN NOT NULL,
    cnpj_cpf VARCHAR(20) UNIQUE NOT NULL,
    nome VARCHAR(50) NOT NULL, 
    email VARCHAR(100) NOT NULL,
    cep VARCHAR(10) NOT NULL,
    rg VARCHAR(15),
    data_nasc VARCHAR(10)
);

CREATE TABLE relacoes (
    id VARCHAR(40) NOT NULL PRIMARY KEY,
    idempresa VARCHAR(20) NOT NULL,
    idfornecedor VARCHAR(20) NOT NULL
);

INSERT INTO empresas (id, cnpj, nome, cep) values ('64f7c7d5-44ef-445d-88be-cdbac31528b7', '00111222333344', 'Mercado Bacana', '11111111');
INSERT INTO empresas (id, cnpj, nome, cep) values ('336a04e9-fe03-4e21-b125-8d37527ef106', '55555777888899', 'Padaria Legal', '11111111');
INSERT INTO empresas (id, cnpj, nome, cep) values ('837ffa23-8a71-47da-88db-5bda41f36a95', '99888777444455', 'Fabrica de tijolos', '11111111');

INSERT INTO fornecedores (id, is_person, cnpj_cpf, nome, email, cep, rg, data_nasc) values ('b46756cf-9589-4bd8-b8ef-5498ee55e3da', FALSE, '00111222333344', 'Mercado Bacana', 'mercadobacana@email.com', '11111111', null, null);

INSERT INTO relacoes (id, idempresa, idfornecedor) values ('353bc688-8566-43d8-99d1-a7636e270338', '55666777888899', '00111222333344');

