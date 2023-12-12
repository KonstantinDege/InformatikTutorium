Ein Voxel ist ein Gitterpunkt in einem dreidimensionalen Gitter, analog zu einem
Pixel in einer zweidimensionalen Rastergrafik. Ein Voxel lässt sich über seine
Koordinaten (Ganzzahlen, das in Gitterschritten angegeben) und einen Farbcode
(hier verwenden wir einfach eine Zahl, die einen Farbwert repräsentiert, z.B. 1-
rot, 2-gelb, 3-blau.)

Schreiben Sie eine JAVA-Klasse, die einen Voxel repräsentiert und folgende
Methoden enthält (s.u.). Legen Sie alle Attribute als interne Attribute an und
führen für alle internen Attribute setter- und getter- Methoden aus.

* Parameterloser Konstruktor, der einen Voxel im Ursprung mit der Farbe
'0' erzeugt.
* Konstruktor mit Übergabe aller Attribute als Werte.
* Setzen aller Attribute als Werte.
* Setzen der Attribute aus einem anderen Voxel.
* Verschieben des Voxels in drei Raumrichtungen.
* Erzeugen eines an der XY-Ebene 'gespiegelten' Voxels mit gleicher Farbe.