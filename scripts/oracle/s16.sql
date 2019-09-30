select first_name, last_name
from employees
where commission_pct is null; --qua vediamo i campi dove il campo � un null

select first_name, last_name
from employees
where commission_pct is not null; --con il "is not null" fa vedere i campi dove non c'� il null

select first_name, last_name, 12 * salary * commission_pct
from employees; 

select first_name, last_name, 12 * salary * nvl(commission_pct, 0)
as "Annual commision"
from employees; --qua usiamo la funzione nvl( � un if mascherato) per mettere zero dove c'� il null

select  first_name , last_name, 12 * salary * nvl(commission_pct, 0)
as "Annual commision"
from employees
where employee_ID = 145;

select  first_name , last_name, 12 * salary * nvl(commission_pct, 0)
as "Annual commision"
from employees
where first_name = 'John';

select  first_name , last_name, 12 * salary * nvl(commission_pct, 0)
as "Annual commision"
from employees
where first_name = 'John' and last_name = 'Russell'; --SqL non � case sensitiva ma non per i dati, infatti li � case sensitive