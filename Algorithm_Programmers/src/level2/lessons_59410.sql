select 
     animal_type
    ,NVL(name,'No name') as name
    ,sex_upon_intake 
from animal_ins
order by animal_id

-- null nvl�� ��� ġȯ���� �ϴ°� 
-- NVL(�÷���, ��ɷ�)