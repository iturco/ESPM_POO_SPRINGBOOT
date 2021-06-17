CREATE TABLE `cotacao` (
                           `id_cotacao` varchar(64) NOT NULL,
                           `id_moeda` varchar(64) NOT NULL,
                           `dt_data` date NOT NULL,
                           `vr_valor` decimal(14,4) DEFAULT NULL,
                           PRIMARY KEY (`id_cotacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO cotacao
(idCotacao,
idMoeda,
nrValor,
dtData)
VALUES
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.06	,"	2021-06-17	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.05	,"	2021-06-16	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.04	,"	2021-06-15	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.06	,"	2021-06-14	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.11	,"	2021-06-11	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.05	,"	2021-06-10	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.06	,"	2021-06-09	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.03	,"	2021-06-08	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.04	,"	2021-06-07	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.04	,"	2021-06-04	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.07	,"	2021-06-03	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.07	,"	2021-06-02	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.15	,"	2021-06-01	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.21	,"	2021-05-31	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.22	,"	2021-05-28	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.23	,"	2021-05-27	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.31	,"	2021-05-26	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.33	,"	2021-05-25	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.31	,"	2021-05-24	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.36	,"	2021-05-21	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.28	,"	2021-05-20	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.30	,"	2021-05-19	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.26	,"	2021-05-18	"),
(UUID(),	"3adfd9de-cbc7-11eb-8a7e-1c1b0df461c5",	5.27	,"	2021-05-17	");