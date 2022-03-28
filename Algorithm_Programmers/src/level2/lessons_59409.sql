SELECT
  animal_id 
 ,name
 ,DECODE(SEX_UPON_INTAKE,'Neutered Male','O','Spayed Female','O',
                         'Neutered Female','O','Spayed Male','O',
                         'Intact Male','X','Intact Female','X') as 중성화
 from animal_ins 
 order by animal_id
 
 --DECODE방식(컬럼이름,'조건','바꿀것') IF ELSE 처럼 컬럼이 Neutered Male 일때 뭐로 ? 이런느낌임.