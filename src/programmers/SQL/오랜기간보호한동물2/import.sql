-- 코드를 입력하세요
SELECT
    ao.ANIMAL_ID,
    ao.NAME
FROM
    ANIMAL_OUTS ao
        JOIN
    ANIMAL_INS ai
    ON
            ao.ANIMAL_ID = ai.ANIMAL_ID
ORDER BY
    DATEDIFF(ao.DATETIME,ai.DATETIME) DESC
LIMIT
    2
