#
### Dateilesen-Schreiben
**Schritt 1**: Erstellen Sie die zu lesende Datei
Zuerst müssen Sie sicherstellen, dass Sie eine Datei haben, die gelesen werden kann. Erstellen Sie eine Textdatei (**eingabe.txt**) und schreiben Sie einige Inhalte hinein.

- Dieses Programm liest Zeichen für Zeichen aus der Quelldatei (eingabe.txt) und schreibt diese Zeichen in die Zieldatei (ausgabe.txt).

- Die Verwendung von try-with-resources stellt sicher, dass sowohl der FileReader als auch der FileWriter korrekt geschlossen werden, auch wenn ein Fehler auftritt.

- Stellen Sie sicher, dass die Quelldatei (eingabe.txt) im gleichen Verzeichnis wie Ihr Java-Programm vorhanden ist, oder passen Sie den Pfad entsprechend an.
- Nach der Ausführung des Programms sollten Sie eine neue Datei namens ausgabe.txt mit dem gleichen Inhalt wie die Quelldatei sehen.
