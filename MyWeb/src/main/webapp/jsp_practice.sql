
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