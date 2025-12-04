### Ho Ho Ho! <br/>
<br/>
Coraz bliżej Święta... a tym samym czas losować Mikołajki. Kto komu kupuje prezent bez chodzenia z koszyczkiem po sali a za to
używając XXI-wiecznych technologii?

## Co zrobimy?
Zuatomatyzujemy losowanie Mikołaj!

## Wyobraź sobie...
... jesteś w klasie w szkole. Przychodzi losowanie kto kogo ma na Mikołajki. Nie macie przy sobie kartki papieru, żeby napisać
losy, żeby je potem wylosować. Szukacie w pośpiechu, rwiecie z zeszytów, robi się zamieszanie...

## ... A może być inaczej!
Zamiast gorączki szukania kartki i długopisu - otwierasz stronę internetową, odpalasz apkę. Wpisujesz imiona.<br/>
Klikasz "losuj".
![Alt text](pictures/get-all.png?raw=true "Dodaj imiona")
Mniej niż sekunda - masz wyniki! <br/>
![Alt text](pictures/assign.png?raw=true "Masz wyniki!")
A żeby nie spojlerować innym zabawy - każdemu możesz wygenerować osobny link!
![Alt text](pictures/checkyourself.png?raw=true "Indywidualne wyniki!")

##  Wystarczy, że
Dziś zaimplementujesz kod.<br/>
Część `frontendu` już jest gotowa. Twoim zadaniem jest dodanie części `backendu` w `Javie`, czyli logiki biznesowej. <br/>
Spokojnie - dasz radę!

## Kroki przygotowawcze:
1. Wciśnij na klawiaturze znak Windowsa i zacznij wpisywać `git bash`. 
    - Jeśli nie pojawia się żaden program o takiej nazwie: ściągnij i zainstaluj `gita` z [tego linku](https://git-scm.com/downloads)
    - Następnie utwórz na `Pulpicie` folder ze swoim imieniem
    - Wejdź w niego
    - I kliknij prawym przyciskiem myszy i wybierz `Git Bash Here`
2. Wciśnij na klawiaturze znak Windowsa i zacznij wpisywać `IntelliJ`
   - Jeśli nie pojawia się żaden program o takiej nazwie: ściągnij i zainstaluj `IntelliJa COMMUNITY` (uwaga - `COMMUNITY`!!) z [tego linku](https://www.jetbrains.com/idea/download/)
3. W `Git Bashu` wpisz polecenie `java -version`. Jeśli pojawił się błąd:
    - Ściągnij i zainstalij Javę `21` (nie `25`!) ze strony [Adoptium](https://adoptium.net/temurin/releases/?arch=any&version=21&os=any)
4. Przescrolluj się na górę i kliknij w zielony przycisk `Code` a następnie `Https`. Skopiuj link, który się wyświetla.
   ![Alt text](pictures/clone.png?raw=true "Skąd wziąć adres githuba?")
5. Następnie otwórz `IntelliJ` i wybierz `File -> New -> Project From Version Control `, wklej adres ze schowka i wybierz swój folder z Pulpitu
   ![Alt text](pictures/save.png?raw=true "wybierz odpowiednie miejsce?")
6. Otwórz projekt i poczekaj, aż zostanie pobrany i zainstalowany kod - w prawym dolnym rogu powinien się już kończyć pasek postępu. 
7. Powinno pokazać się okienko sugerujące pracę.
    ![Alt text](pictures/loading.png?raw=true "Czy projekt się konfiguruje w IntelliJu?")
8. Po pewnym czasie powinno się skonfigurować i powinno otworzyć się puste okno a na dole `BUILD 
   SUCCESSFUL`. <br/>
    Kliknij `Project` po lewej
    ![Alt text](pictures/project.png?raw=true "Sukces i co dalej?")
9. Otwórz Ustawienia (`File -> Settings`) (lub `IntelliJ IDEA` -> `Settings...` na MAC OS)
    ![Alt text](pictures/settings.png?raw=true "Gdzie są ustawienia na Windowsie?")
    ![Alt text](pictures/settings-on-mac.png?raw=true "Gdzie są ustawienia na Macu?")
10. Otwórz sekcję `Build, Execution, Deployment`, a w niej `Build Tools -> Gradle` <br/>
    i dla obu `Build and run using` oraz `Run tests using` wybierz `IntelliJ Idea` <br/>
    ![Alt text](pictures/build-execution.png?raw=true "Co wybrać?!")
11. Otwórz sekcję `Plugins`, w szukajkę wpisz `Lombok`, wybierz plugin z papryczką i Zainstaluj (u
    mnie już jest zainstalowany). <br/>
    Być może trzeba będzie zrestartować Intellija. <br/>
    ![Alt text](pictures/lombok.png?raw=true "Jak wygląda Lombok?!")
12. W prawym dolnym rogu powinno się pokazać okienko włączenia procesowania adnotacji.<br/>
    Jeśli się nie pojawiło, wejdź w Ustawienia (punkt 9) i wyszukaj `enable ann` i znajdź sekcję pokazaną poniżej i zaznacz.
    ![Alt text](pictures/enable-lombok.png?raw=true "Jak wygląda to okienko?!")
    ![Alt text](pictures/enable-ann-processing.png?raw=true "Gdzie się włącza te adnotacje?!")<br/>
13. Po kliknięciu, powinno być widoczne drzewo plików oraz nie powinno być żadnych błędów.
    ![Alt text](pictures/no-error.png?raw=true "Sukces!")
14. **GDYBY JEDNAK NIE** - wejdź w `Git basha` (tam gdzie był*ś) lub w Terminal, wejdź do
    katalogu z projektem i wywołaj `./gradlew build` i poczekaj, aż skończy działać. <br/>
    ![Alt text](pictures/gradlew-build.png?raw=true "A co jeśli mi nie działa?")
15. Jeśli kod nie działa i dużo klas świeci na czerwono oraz zauważysz w prawym dolnym rogu małe
    okienko a w nim komunikat `Lombok..`,<br/>
    lub również w prawym dolnym rogu przy `Event Log` pojawi się czerwone,<br/>
    kliknij na niebieski tekst "enable". (prawdopodobnie krok 18 nie został wykonany poprawnie)
    ![Alt text](pictures/enable-lombok.png?raw=true "A co jeśli lombok nie działa?")
16. **GDYBY NADAL NIE** - poproś Prowadzącą :)

### Zawsze restartując program, wyłączaj poprzednie działania czerwonym kwadracikiem!
    <br/> <br/>

## Brawo! środowisko skonfigurowane, czas na implementację!
<br/>
Będziemy implementować endpointy:
- `GET /good-people`  - zwracający wszystkich członków gry
- `POST /good-people` - dodający nową osobę do gry
- `GET /santa-assignments` - zwracający przypisania (kto kogo wylosował)
- `POST /santa-assignments` - przypisujący kto kogo wylosuje
- `GET /santa-assignments/{santaName}` - sprawdzający kogo wylosowała osoba o imieniu `{santaName}`
- `DELETE /good-people/{santaName}` - umożliwiający usunięcie osoby o imieniu `{santaName}` z gry

Endpointy są wstępnie już napisane w kodzie. <br/>
Twoim zadaniem jest napisanie logiki zarządzającej graczami :) <br/>

## Czym jest good-poeople?
`Good-People` to po prostu lista wszystkich ludzi biorących udział w losowaniu. Lista (tablica) `Stringów`.

## Czym jest santa-assignments?
`santa-assignments` to przypisania - kto kogo wylosował. Będziemy je zwracać do `frontendu` (strony html) w postaci jsona, przykładowo: 
```json
{
		"santaNane": "Ania", 
		"goodPersonName": "Bartek"
}
```
gdzie `santaName` to `kto` a `goodPersonName` to `kogo wylosował`.

<br/>
Przechodząc do tego, co trzeba zrobić:
<br/>

1. Zacznij od implementacji metody `getParticipants` z pliku `SantaAssignmentController.java`.  <br/>
    Metoda ma zwracać wszystkich uczestników. Spodziewany format danych to tablica takich jsonów, nazwanych `UserDto`: 
```
{
    "name": "<imie uczestnika>"
}
```  
2. Otwórz przeglądarkę - najlepiej `Chroma` - i wejdź na [strone Mikołajkową ](https://secret-santa-production-cb6b.up.railway.app/) i zauważ błąd na niej.
3. Uruchom projekt -> wyszukaj klasy `DemolabApplication` i kliknij zielony trójkącik tak aby uruchomiła się aplikacja
![Alt text](pictures/how-to-run.png?raw=true "Tak uruchomisz")
![Alt text](pictures/run-app.png?raw=true "Po tym poznasz, że się uruchomiła")
4. Odśwież stronę. Jeśli poprawnie zaimplementował*ś punkt 1 - błąd powinien zniknąć. Jeśli nie - kombinuj jak zwrócić odpowiednie dane ;)
5. Następnie przejdź do uzupełnienia metody `addParticipant`, której zadaniem jest dodać nową osobę. Przyjmuje ona `request body`, czyli wiadomość. Wiadomość ta ma postać takiego samego jsona. Jak możesz dodać to `imię` do wszystkich uczestników?
6. Uruchom ponownie aplikację w IntelliJu i wejdź na przeglądarkę.
7. Przetestuj dodawanie uczestników.
8. Teraz możesz przejść do implementacji losowania - kto kogo? Pamiętaj, że sam siebie nie możesz wylosować. Losy nie mogą się też powtórzyć. Jak możesz to zaimplementować? Nie zwracaj nic w endpoincie - losy przechowamy jako pole (zmienna) w klasie.
9. Zrestartuj aplikację i wejdź w przeglądarkę.
10. Otwórz DevToolsy, czyli naciśnij prawym przyciskiem myszy -> `Zadaj` -> przejdź do zakładki `Networking`.
11. Pododawaj nowe osoby. 
12. Kliknij przycisk "Losuj"
13. Sprawdź, czy w zakładce `Network` nie poleciało nic czerwonego (błąd `401`, `403`, lub cokolwiek co zwraca Twoją uwagę kolorem). Jeśli nie - przejdź dalej.
14. Żeby widzieć wyniki losowania zaimplementuj metodę `getSantas` w pliku `SecretSantaController`. W tej metodzie należy zwrócić wynik zapisany w polu (fioletowej zmiennej) w poprzednim zadaniu. Powinna ona zwracać listę jsonów nazwanej `SantaResult` o następującej strukturze:
```json
{
  "santaName": "kto",
  "goodPersonName": "wylosował kogo"
}
```
15. Zrestartuj aplikację - odśwież stronę, dodaj osoby, wylosuj...
16. ... I powinny pojawić się wyniki! A jeśli nie ma - sprawdź w IntelliJu lub zakładce `Network` co się działo. Przeczytaj błąd. Co się mogło stać?
17. Zaimplementuj metodę `getOneSanta` - czyli metodę zwracają wyniki dla 1 podanego uczestnika.
18. Przetestuj restartując backend i od nowa wpisując dane w przeglądarce.
19. Czas na ostatnią metodę `HTTP` - czyli `Delete`, usuwającą uczestnika z zabawy. Tym razem nie ma jej w ogóle napisanej. Bazując na poprzedniej metodzie, zrób bardzo analogiczną metodę ale z pewnymi zmianami:
- niech będzie to mapping `Delete`
- niech będzie działać na urlu `good-people/{santaName}` (w końcu usuwamy uczestnika, grzecznego uczestnika ;))
- ma usuwać dane tej osoby (znajdziesz je jako parametr `santaName`) ze wszystkich pól, gdzie mogłaby być przechowywana
- a całość może zwracać `OK (200)` lub jeszcze lepiej - `NO_CONTENT (204)` 
20. Zrestartuj aplikację, otwórz w przeglądarce stronę
21. Dodaj osoby - i usuń jedną. Działa?
22. Brawo! Oto Twoja pierwsza aplikacja webowa z frontenden, backendem, przydatna, tematyczna i interaktywna! :) 🎉 
