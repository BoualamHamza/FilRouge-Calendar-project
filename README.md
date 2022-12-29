# FilRouge Calendar -project

## English version
 THIS IS A PROJECT THAT WAS GIVEN TO ME AS A TASK TO DO IN CLASSROOM
 ->the project consist to make use of all java fondamunetals (inheritance, overriding methods, abstraction, encapsulation, polymorphism, etc...)
 by managing to create a TYPE OF CALENDAR by dealing with all constraints
 
 
1. **Part 1**

An activity will be seen as given a description (eg "Going to college") as well as a duration (eg "15"). The unit of time does not matter as long as it is the same for all activities, but we can think of the minute.

 +A “precedence” constraint applies to two activities, in a given order; it imposes that the first activity ends at the latest when the second begins; thus, if there is a precedence constraint on "Go to college" and "Tie on the bike", then if "Go to college" is scheduled at minute 60, the constraint will dictate that "Tie on the cycle” is scheduled at the earliest at minute 75;

 +A meet type constraint also applies to two activities, always in a given order, but it imposes that the second begins exactly when the first ends (we can think of "Playing sports" and "Take a shower" ).

2. **Part 2

It is a question of creating a small program making it possible to find a scheduling of activities, given the constraints of precedence on these activities.

For example, if we have the activities "get up" (duration: 1), "go to work" (15), "take a shower" (10), "brush your teeth" (3), "s 'dress' (2) and 'have breakfast' (15), with constraints requiring getting up before having breakfast, getting up before getting dressed, having breakfast before brushing one's teeth, to take a shower before getting dressed, to brush your teeth before going to work, to get dressed before going to work, and to have breakfast before going to work, then a possible schedule is to get up, then eat breakfast, then brush your teeth, then get dressed and finally go to work.

On the other hand, if we have the activities "to learn about the subject of the exam", "to revise" and "to take the exam" (the durations do not matter) and constraints imposing to revise before taking the exam , to take the exam before learning about the exam topic, and to learn about the exam topic before revising, then there is no solution (i.e. scheduling respecting all constraints).

3. **Part 3

we want to represent constraints between one activity and another, with a minimum delay and a maximum delay, between the end of the first activity and the start of the second. We will assume that there is always a minimum (0 in the dish example above) and a maximum. Moreover, as for the rest of the common thread, it will be assumed that the deadlines and durations are all expressed in the same unit of time. Finally, we will interpret the minimum and maximum delays in the broad sense

4. **Part 4

The objective is to factorize the common elements of the written constraint classes. Given that we are going to transform the existing classes in this way, it may be interesting to archive the constraints package already written (for example by copying it into another directory), in order to keep its version without abstraction before transforming it. The rest of the statement considers that we start from the code created previously in the constraints package, to transform it. We will therefore always work in the constraints package.

5. Part 5
The principle will be to generate a certain number of random schedules, and to retain the best, that is to say the one satisfying the most constraints. Of course, this principle will not guarantee to find a schedule satisfying all the constraints, but if the number of draws is large enough, and the problem not too constrained, it will happen with a significant probability.
 
 
 
 
 
## Version française
 
 
 
 Il s'agit de créer des classes permettant de représenter des activités et de premières contraintes entre elles.


1. Partie 1
Une activité sera vue comme la donnée d'une description (par exemple « Aller à l'université ») ainsi que d'une durée (par exemple « 15 »). L'unité de temps importe peu du moment que c'est la même pour toutes les activités, mais on pourra penser à la minute.

->Une contrainte de « précédence » s'applique à deux activités, dans un ordre donné ; elle impose que la première activité se termine au plus tard lorsque    la seconde commence ; ainsi, s'il y a une contrainte de précédence portant sur « Aller à l'université » et « Attacher le vélo », alors si « Aller à l'université » est programmée à la minute 60, la contrainte imposera que « Attacher le vélo » soit programmée au plus tôt à la minute 75 ;

->Une contrainte de type meet s'applique également à deux activités, toujours dans un ordre donné, mais elle impose que la seconde commence exactement        quand la première se termine (on peut penser à « Faire du sport » et « Prendre une douche »).

2. Partie 2

Il s'agit de réaliser un petit programme permettant de trouver un ordonnancement d'activités, étant données des contraintes de précédence sur ces activités.

Par exemple, si l'on a les activités « se lever » (durée : 1), « aller au travail » (15), « prendre une douche » (10), « se brosser les dents » (3), « s'habiller » (2) et « prendre un petit déjeuner » (15), avec des contraintes imposant de se lever avant de prendre un petit déjeuner, de se lever avant de s'habiller, de prendre un petit déjeuner avant de se brosser les dents, de prendre une douche avant de s'habiller, de se brosser les dents avant d'aller au travail, de s'habiller avant d'aller au travail, et de prendre un petit déjeuner avant d'aller au travail, alors un ordonnancement possible consiste à se lever, puis prendre un petit déjeuner, puis se brosser les dents, puis s'habiller et enfin aller au travail.

En revanche, si l'on a les activités « prendre connaissance du sujet d'examen », « réviser » et « passer l'examen » (les durées n'importent pas) et des contraintes imposant de réviser avant de passer l'examen, de passer l'examen avant de prendre connaissance du sujet d'examen, et de prendre connaissance du sujet d'examen avant de réviser, alors il n'y a pas de solution (c'est-à-dire d'ordonnancement respectant toutes les contraintes).

3. Partie 3
on souhaite représenter des contraintes entre une activité et une autre, avec un délai minimal et un délai maximal, entendu entre la fin de la première activité et le début de la seconde. On supposera qu'il y a toujours un minimum (0 dans l'exemple du plat ci-dessus) et un maximum. Par ailleurs, comme pour le reste du fil rouge, on supposera que les délais et durées sont tous exprimés dans une même unité de temps. Enfin, on interprétera les délais minimal et maximal au sens large

4. Partie 4
L'objectif  est de factoriser les éléments communs des classes de contraintes écrites . Étant donné que l'on va ainsi transformer les classes existantes, il peut être intéressant d'archiver le package constraints déjà écrit (par exemple en le copiant dans un autre répertoire), afin de garder sa version sans abstraction avant de la transformer. La suite de l'énoncé considère que l'on part du code réalisé précédemment dans le package constraints, pour le transformer. On travaillera donc toujours dans le package constraints.

5. Partie 5
Le principe sera de générer un certain nombre d'emplois du temps aléatoires, et de retenir le meilleur, c'est-à-dire celui satisfaisant le plus de contraintes. Bien entendu, ce principe ne garantira pas de trouver un emploi du temps satisfaisant toutes les contraintes, mais si le nombre de tirages est suffisamment grand, et le problème pas trop contraint, cela arrivera avec une probabilité significative.


