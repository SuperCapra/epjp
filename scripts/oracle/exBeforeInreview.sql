select employee_id, last_name, salary
from employees
where salary > 10000;

--numero di lavori che hanno più di dieci dipendenti
select count(count(employee_id))
from employees
group by job_id
having count(employee_id) > 10;