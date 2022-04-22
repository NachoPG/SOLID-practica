# Práctica SOLID - Principios que se han aplicado

### - Principio de Responsabilidad Única:

- Las principales clases File y Directory poseen métodos de todo tipo, lo que deriva en que la clase tiene diferentes
  responsabilidades y se estan mezclando varias capas de la arquitectura.
- La gran cantidad de métodos públicos deriva en que la clase hace muchas cosas y la gran mayoría tiene poco en común
  entre ellos.
- La modificación de las clases se hace imposible ya que en el momento que se modifica saltan errores en las demás
  clases porque esta involucrada en demasiadas cosas. Este error va en relación con el principio Abierto/Cerrado.

### - Principio de Abierto/Cerrado

- Realizar nuevas implementaciones o modificaciones se hace imposible ya que cada vez que se realiza un cambio, se
  disparan errores en las otras clases y automáticamente se ven afectadas. Por lo tanto, se está violando este
  principio.

### - Principio de Sustitución de Liskov

- La clase abstracta FileSystemItemBase implementa todos los métodos abstractos de ambas clases hijas, lo cual genera
  que gran parte de los métodos de las clases hijas generen excepciones o posean métodos que no utilice dicha clase. Por
  lo tanto, se tiene que refactorizar la clase abstracta teniendo en cuenta únicamente métodos que se utilicen en ambas
  clases hijas.

### - Principio de Segregación de Interfaces

- El gran problema que se obtiene en las interfaces es que poseen demasiados métodos que no utilizan las clases hijas,
  lo cual produce que las clases hijas implementen excepciones y automáticamente estamos violando este principio. Esto
  surge cuando se intenta definir más cosas de las debidas en las interfaces. Por ello, lo mejor es implementar muchas
  interfaces que definan comportamientos más específicos. Lo más importante es que se utilice todos los métodos
  definidos en las interfaces.

### - Principio de Inversión de Dependencias

- El problema que se obtiene es que la clase de más alto nivel depende de la más bajo nivel para realizar las diferentes
  funciones. Por lo tanto, estamos violando este principio, no tenemos que depender de concreciones, sino de
  abstracciones. Por ello, se ha creado otra interfaz más con el objetivo de definir el comportamiento que debe de tener
  cada clase dependiendo de cual sea su función.