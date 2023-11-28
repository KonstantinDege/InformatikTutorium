In einem Computerspiel sind einfache Spielfiguren durch sechs Attribute beschrieben: Die X- und Y-Koordinate der Figur auf dem Spielfeld, Schutzschildpunkte und Gesundheitspunkte der Figur sowie Angriffs- und Verteidigungswert der Figur.
Greift eine Figur eine andere an, so wird die Stärke des Angriffs als Quotient aus dem Angriffswert des Angreifers und dem Abstand der beiden Figuren
gebildet. Überschreitet dieser Wert den Verteidigungswert der angegriffenen
Figur, so wird die Differenz aus Stärke des Angriffs und Verteidigungswert von
den Schutzschildpunkte der Figur abgezogen, sind diese bereits bei 0 Punkten
angekommen, wird der Rest von den Gesundheitspunkten abgezogen. Schutzschildpunkte können zwischen den Spielfiguren übertragen werden.
Schreiben Sie eine JAVA-Klasse, die eine Figur repräsentiert und folgende
Methoden enthält:
* Parameterloser Konstruktor, der eine Figur am Punkt [0,0] mit dem Gesundheitswert 10.000 und dem Schutzschildwert 10.000 sowie dem Angriffswert 150 und dem Verteidigungswert 100 erzeugt.
* Konstruktor mit Übergabe aller Attribute als Werte.
* Berechnen des Abstandes zu einer anderen Figur.
* Angegriffen werden von einer anderen Figur.
* Einer anderen Figur Schutzschildpunkte übertragen.

Legen Sie alle Attribute als interne Attribute an und führen für alle internen
Attribute setter- und getter- Methoden aus.
Im vorgestellten Kampfmodell ist es günstig die Zahl der Gegner in einem
Kampf zu minimieren. Entwerfen und implementieren Sie eine Methode, die
aus einer Liste der gegnerischen Spielfiguren diejenige heraussucht, die nach
einem Angriff die wenigsten Gesundheitspunkte behalten würde.
