
CREATE TABLE my_user (
    user_id VARCHAR2(30) PRIMARY KEY,
    user_pw VARCHAR2(30) NOT NULL,
    user_name VARCHAR2(20) NOT NULL,
    user_email VARCHAR2(100),
    user_adrress VARCHAR2(100)
);

INSERT INTO my_user
    (user_id, user_pw, user_name)
VALUES
    ('abc1234', 'aaa1111', '홍길동');
    
commit;

select * from my_user;

CREATE TABLE my_board (
    board_id NUMBER PRIMARY KEY,
    writer VARCHAR2(30) NOT NULL,
    title VARCHAR2(100) NOT NULL,
    content VARCHAR2(2000) NOT NULL,
    reg_date DATE DEFAULT sysdate,
    hit NUMBER DEFAULT 0
);

CREATE SEQUENCE board_seq
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 1000
    NOCYCLE
    NOCACHE;