SELECT
  animal_id 
 ,name
 ,DECODE(SEX_UPON_INTAKE,'Neutered Male','O','Spayed Female','O',
                         'Neutered Female','O','Spayed Male','O',
                         'Intact Male','X','Intact Female','X') as �߼�ȭ
 from animal_ins 
 order by animal_id
 
 --DECODE���(�÷��̸�,'����','�ٲܰ�') IF ELSE ó�� �÷��� Neutered Male �϶� ���� ? �̷�������.