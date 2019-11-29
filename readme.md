# Revisão N2 Estrutura de Dados II

***Questão 01:*** Para cada nó da árvore informe qual seu nível e altura? Qual a altura da árvore?

    (a(b)(c(d(g)(h))(e)(f(i))))
**R:** (a) altura=3 nível=0 | (b) altura=0 nível=1 | ( c) altura=2 nível=1 | (d) altura=1 nível=2 | (e) altura=0 nível=2 | (f) altura=1 nível=2  | (g) altura=0 nível=3 | (h) altura=0 nível=3 | (i) altura=0 nível=3 | A altura da árvore é 3. 

***Questão 02:*** Escreva uma função que conta o número de nós de uma árvore binária.
**R:** 
[Amount of Nodes](https://github.com/CaetanoMatheus/ED2RevisaoN2/blob/master/Tree.java)

***Questão 03:*** Escreva uma função que conta o número de nós não-folha de uma árvore binária.
**R:**
[Amount of Nodes not Leaf](https://github.com/CaetanoMatheus/ED2RevisaoN2/blob/master/Tree.java)

***Questão 04:*** Escreva uma função que conta o número de folhas de uma árvore binária.
**R:**
[Amount of Leafs](https://github.com/CaetanoMatheus/ED2RevisaoN2/blob/master/Tree.java)

***Questão 05:*** Escreva uma função que calcula a altura de uma árvore binária
**R:**
[Height](https://github.com/CaetanoMatheus/ED2RevisaoN2/blob/master/Tree.java)

**Questão 06:** Escreva uma função recursiva que calcule o número de nós em uma árvore binária.
**R** <Mesma resposta da questão 02>

**Questão 07:** Escreva uma função que calcule a altura de uma árvore binária.
**R** <Mesma resposta da questão 05>

**Questão 08:** Construa uma árvore binária de busca para as seguintes chaves: 14, 15, 3, 4, 9, 7, 18, 3, 5, 16, 4,
20, 17, 9, 14, 5, 15, 16, 9, 11, 3. Qual a altura (h) e grau desta árvore?
**R** Altura=6 - Grau={ 14=2 | 15=2 | 3=1 | 4=2 | 9=2 | 7=1 | 18=2 | 3=1 | 5=2 | 16=2 | 4=0 | 20=0 | 17=1 | 9=1 | 14=0 | 5=0 | 15=0 | 16=0 | 9=1 | 11=0 | 3=0 }.

**Questão 10:** Quais são as sequências de nós encontradas ao atravessar a árvore abaixo em em-ordem, pré-ordem e pós-ordem?
((35(30(17(10)(27)(33))(45(42)(57(51)(60))))))
**R:** Pré-ordem: 35, 30, 17, 10, 27, 33, 42, 51, 60, 57, 45, 35.
| Pós-ordem: 10, 27, 17, 33, 30, 42, 51, 60, 57, 45, 35.
| Em-ordem: 10, 17, 27, 30, 33, 35, 42, 45, 51, 57, 60.