# ParER Maven Custom Formatter

Fonte template redazione documento:  https://www.makeareadme.com/.

# Descrizione

Progetto basato sul plugin [https://code.revelc.net/formatter-maven-plugin](https://code.revelc.net/formatter-maven-plugin/). 

# Installazione

Come da guida (https://code.revelc.net/formatter-maven-plugin/examples.html) la seguente libreria è strutturata per essere utilizzata nella configurazione del plugin standard maven che permette di formattare il codice sorgente presente all'interno del singolo progetto.

Di seguito un esempio di utilizzo:

```xml
<plugin>
    <groupId>net.revelc.code.formatter</groupId>
    <artifactId>formatter-maven-plugin</artifactId>
    <dependencies>
        <dependency>
            <groupId>${project.groupId}</groupId>
            <artifactId>parer-mvn-formatter</artifactId>
            <version>$VERSIONE</version>
        </dependency>
    </dependencies>
    <configuration>
        <configFile>eclipse/formatter.xml</configFile>
    </configuration>
    <executions>
        <execution>
            <goals>
                <goal>format</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

# Utilizzo

Libreria che include la [configurazione custom](src/main/resources/eclipse/formatter.xml).

# Supporto

Mantainer del progetto è [Engineering Ingegneria Informatica S.p.A.](https://www.eng.it/).

# Contributi

Se interessati a crontribuire alla crescita del progetto potete scrivere all'indirizzo email <a href="mailto:areasviluppoparer@regione.emilia-romagna.it">areasviluppoparer@regione.emilia-romagna.it</a>.

# Credits

Progetto di proprietà di [Regione Emilia-Romagna](https://www.regione.emilia-romagna.it/) sviluppato a cura di [Engineering Ingegneria Informatica S.p.A.](https://www.eng.it/).

# Licenza

Questo progetto è rilasciato sotto licenza GNU Affero General Public License v3.0 or later ([LICENSE.txt](LICENSE.txt)).
