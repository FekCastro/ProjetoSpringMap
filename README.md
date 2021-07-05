
# Project Title

A brief description of what this project does and who it's for

# Interface Map - Java Collections
Essa interface é um objeto que mapeia valores para chaves, ou seja, através da chave consegue ser acessado o valor configurado, sendo que a chave não pode ser repetida ao contrário do valor, mas se caso tiver uma chave repetida é sobrescrito pela última chamada. Também faz parte do pacote java.util e não possui métodos da interface Collection.

(hierarquia) 

A sintaxe deve obedecer a lugares apontados da chave e valor, pois cada chave leva somente um elemento, segue o exemplo da Listagem 1 abaixo:

Map<E> mapa = new Type();

Sintaxe:

- E - é o objeto declarado, podendo ser classes Wrappers ou tipo de coleção.
- Type - é o tipo de objeto da coleção a ser usado.

import java.util.HashMap;
import java.util.Map;

public class TestaInterfaceMap {

  public static void main(String[] args) {

    Map<integer, string=""> mapaNomes = new HashMap<integer, string="">();
    mapaNomes.put(1, "João Delfino");
    mapaNomes.put(2, "Maria do Carmo");
    mapaNomes.put(3, "Claudinei Silva");

System.out.println(mapaNomes);

    //resgatando o nome da posição 2
    System.out.println(mapaNomes.get(2));

  }
}

* conteúdo a incluir

# Classe HashMap
Essa classe é a implementação da interface Map mais trabalhada no campo de desenvolvimento. O exemplo dessa classe está apresentado no exemplo da Listagem 2.

### Características

- Os elementos não são ordenados;
- É rápida na busca/inserção de dados;
- Permite inserir valore e chaves nulas;

HashMap mapa = new Type();

### Sintaxe

- E - é o objeto declarado, podendo ser classes Wrappers ou tipo de coleção.
- Type - é o tipo de objeto da coleção a ser usado.


# Métodos úteis
Esses métodos oferece bastante ajuda quando é trabalhado com a interface Map.

- values() - É uma Collection com todos os valores que foram associados a alguma das chaves.
- keySet() - Retorna um Set com as chaves do mapa especificado.
- entrySet() - Retorna um conjunto de Maps contido no mapa configurado, podendo ser possível acessar suas chaves e valores.
- put (Key key, Value value) - Associa um valor a uma chave específica.
Para interagir sobre um mapa é preciso trabalhar com a interface Collection ou métodos set() para converter esse mapa em um conjunto de dados.


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestaInterfaceMap {

  public static void main(String[] args) {

    Map<integer, string=""> mapaNomes = new HashMap<integer, string="">();
    mapaNomes.put(1, "João Delfino");
    mapaNomes.put(2, "Maria do Carmo");
    mapaNomes.put(3, "Claudinei Silva");

    //Collection<integer> conjNomes = mapaNomes.keySet();

    Set<entry<integer, string="">> set = mapaNomes.entrySet();
    Iterator it = set.iterator();

    System.out.println("Código\t\tValor");

                 //getKey() - recupera a chave do mapa
    //getValue() - recupera o valor do mapa

    while(it.hasNext()){
      Entry<integer, string=""> entry = (Entry)it.next();
      System.out.println(entry.getKey() + "\t\t"+entry.getValue());
    }
  }
}

Também pode ser usado para percorrer um mapa o “for aprimorado”, mas vale informar que para percorrer os valores o seu valor começa por 1 e não por 0.

for(int i = 1; i <= mapaNomes.size(); i++){
  System.out.println(i + " - " + mapaNomes.get(i));
}

# Ordenação de HashMap
Existe uma questão simples para fazer a ordenação de um mapa de dados. Para aplicar essa ordenação é necessário criar antes uma classe personalizada que implemente a interface Comparator do tipo inteiro e também trabalhar com a classe TreeSet.

- Comparator personalizado:
import java.util.Comparator;
import java.util.Map;

public class ComparatorInts implements Comparator<integer> {

  Map<integer, string=""> base;

  public ComparatorInts(Map<integer, string=""> base) {
    this.base = base;
  }

  @Override
  public int compare(Integer o1, Integer o2) {
    return base.get(o1).compareTo(base.get(o2));
  }
}


- Ordenação de um mapa por valor:

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrdenandoHashMap {

  public static void main(String[] args) {
    HashMap<integer, string=""> mapaNomes = new HashMap<integer, string="">();
    mapaNomes.put(1, "João Delfino");
    mapaNomes.put(2, "Maria do Carmo");
    mapaNomes.put(3, "Claudinei Silva");
    mapaNomes.put(4, "Amélia Mourão");

    ComparatorInts compInt = new ComparatorInts(mapaNomes);

    Map<integer, string=""> mapaOrdenado = new TreeMap(compInt);
    mapaOrdenado.putAll(mapaNomes);

    for(Integer valor : mapaOrdenado.keySet()){
      System.out.println(valor + " " + mapaNomes.get(valor));
    }

  }
}


# Classe HashTable
Essa classe trabalha com algoritmo hash para conversão das chaves e um mecanismo de pesquisa de valores, sendo que tem seus métodos sincronizados (thread-safe) que permitem checar acessos concorrentes e armazenagem. Também possui uma eficiente pesquisa de elementos baseados em chave-valor, mas não aceita valores nulos.

HashTable<E> mapa = new Type<E>();

### Sintaxe
- E - é o objeto declarado, podendo ser classes Wrappers ou tipo de coleção.
- Type - é o tipo de objeto da coleção a ser usado.

Trabalhado com HashTable:

import java.util.Hashtable;

public class TesteHashTable {

  public static void main(String[] args) {

    Cliente c1 = new Cliente("754.856.869-88","Valdinei Santos");
    Cliente c2 = new Cliente("828.929.222.12","Claire Moura");
    Cliente c3 = new Cliente("156.565.556-88","Vagner Seller");

    Hashtable<integer, cliente=""> ht = new Hashtable<integer, cliente="">();
    ht.put(1, c1);
    ht.put(2, c2);
    ht.put(3, c3);

    System.out.println("CPF \t\t Cliente");
    for (int i = 1; i <= ht.size(); i++) {
      System.out.println(ht.get(i));
    }
  }
}

class Cliente{
  public String cpf;
  public String nome;

  public Cliente(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
  }

  @Override
  public String toString() {
    return cpf + " | " + nome;
  }
}
