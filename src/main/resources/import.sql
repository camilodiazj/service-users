INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('camilo', '$2a$10$1cm923y2gmCHtP1HLAnLAuSg1I3UCs9IsiGIWKc4z802gu9Hueic2', 1, 'Camilo', 'Diaz', 'camilo.diaz@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$JxYNxfzW9o/oldO7nNiVMe4iYApGg3Eua4KbC3tf3HqYoiYnRUD8C', 1, 'John', 'Doe', 'jhon.doe@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1);