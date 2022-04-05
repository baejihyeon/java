SELECT 
     ins.animal_id
    ,ins.name
from ANIMAL_INS ins
    ,ANIMAL_OUTS aot
where ins.animal_id = aot.animal_id
AND ins.datetime > aot.datetime 
order by ins.datetime;
