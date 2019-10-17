
--join using on
select c.first_name, r.race_name
from characters c join races r
on (c.race_id = r.race_id);

--join using using
select c.first_name, r.race_name
from characters c join races r
using(race_id)
where r.race_name = 'Human';

--natural join
select first_name, race_name
from characters natural join races 
where race_name = 'Human';

--self join
select first_name, race_id
from characters
where race_id = 2;

--query classica
select c.first_name, r.race_name
from characters c, races r
where c.race_id = r.race_id;

--fullouter join da tre tabelle
select first_name, item_name
from characters full outer join owned_items 
using(character_id)
full outer join items 
using(item_id);

--rightouter join da tre tabelle
select first_name, item_name
from characters right outer join owned_items 
using(character_id)
full outer join items 
using(item_id);

--lefttouter join da tre tabelle
select first_name, item_name
from characters left outer join owned_items 
using(character_id)
full outer join items 
using(item_id);

--fulltouter join da cinque tabelle 
select first_name, item_name, boss_name
from characters full outer join owned_items 
using(character_id)
full outer join items 
using(item_id)
full outer join dropped_items
using(item_id)
full outer join bosses
using(boss_id)
order by boss_name;

--fulltouter join da cinque tabelle con is not null
select first_name, item_name, boss_name
from characters full outer join owned_items 
using(character_id)
full outer join items 
using(item_id)
full outer join dropped_items
using(item_id)
full outer join bosses
using(boss_id)
where first_name is not null
order by boss_name;

--fulltouter join da cinque tabelle con l'ascia
select first_name, item_name, boss_name
from characters full outer join owned_items 
using(character_id)
full outer join items 
using(item_id)
full outer join dropped_items
using(item_id)
full outer join bosses
using(boss_id)
where first_name is not null
and item_name like 'Ascia'
order by boss_name;


--qualche funzione
select concat(first_name || ' ', clan_name) as Full_Name
from characters;

select c.race_id, avg(c.life_points)
from characters c, races r
group by c.race_id;

