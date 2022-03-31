select 
     animal_type
    ,NVL(name,'No name') as name
    ,sex_upon_intake 
from animal_ins
order by animal_id

-- null nvl로 어떻게 치환할지 하는것 
-- NVL(컬럼값, 어떤걸로)