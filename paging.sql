
SELECT * FROM
    (
    SELECT ROWNUM AS rn, tbl.* FROM
        (
        SELECT * FROM my_board
        ORDER BY board_id DESC
        ) tbl
    )
WHERE rn > ? AND rn <= ?


