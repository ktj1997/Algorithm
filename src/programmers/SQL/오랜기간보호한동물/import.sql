SELECT I.NAME,I.DATETIME FROM ANIMAL_INS I LEFT OUTER JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID WHERE SEX_UPON_OUTCOME IS NULL ORDER BY DATETIME ASC LIMIT 3;