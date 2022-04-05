SELECT 
     aot.animal_id 
    ,aot.name
from animal_ins ain
right outer join animal_outs aot on ain.animal_id = aot.animal_id
where ain.animal_id is null;