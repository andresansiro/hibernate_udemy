package com.example.demo.domain.mappedsuperclass;

import jakarta.persistence.Entity;

@Entity
public class Book extends BaseEntity {
    private String isbn;
    private String publisher;

    public Book() {
    }

    public Book(String title, String isbn, String publisher) {
        this.setTitle(title);
        this.isbn = isbn;
        this.publisher = publisher;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}


/**
 * ---
 * <p>
 * - commonly – powszechnie
 * - investigation – śledztwo
 * - certain – pewni
 * - capability – zdolność
 * - instead – zamiast
 * - advance – osiągnięcia
 * - obtain – uzyskać
 * <p>
 * ---
 * <p>
 * - throughout – poprzez
 * - exposed – narażony
 * - essential – istotny
 * - efficient investigation techniques – skuteczne techniki śledcze
 * - purpose – cel
 * - cause of the problem – przyczyna problemu
 * <p>
 * ---
 * <p>
 * - sensitive to interference – wrażliwy na zakłócenia
 * - glitch – usterka
 * - a member – członek
 * - gain – osiągać
 * - relatively – stosunkowo
 * - similar – podobne
 * - wondering – zastanawiać się
 * - assume – założyć
 * - because its intent is not obvious – ponieważ jego intencja nie jest oczywista
 * - near – w pobliżu
 * - two essential – dwa istotne
 * - involved – zaangażowany
 * - often – często
 * - understandable – zrozumiały
 * - aware – świadomy
 * - essential – niezbędny
 * - already familiar – już znajomy
 * <p>
 * ---
 * <p>
 * - while debugging – podczas debugowania
 * - to consider – rozważyć
 * - decoupled – odłączony
 * - quite simple – dość proste
 * - received – otrzymane
 * - indeed – rzeczywiście
 * - maintain – utrzymywać
 * - maintainable – łatwy w utrzymaniu
 * <p>
 * ---
 * <p>
 * - abstraction layer – warstwa abstrakcji
 * - built on top of JPA – zbudowany na bazie JPA
 * - common – wspólny
 * - leakage – przeciek
 * - will cache and batch – będzie buforować i przetwarzać wsadowo
 * - Batch Update – wsadowe aktualizacje: Możemy również zaktualizować wiele rekordów w jednej operacji
 * - remain – pozostać
 * - deduce – wywnioskować
 * - below – poniżej
 * - can't figure out – nie mogę zrozumieć
 * - be aware – być świadomym
 * - lacks – braki
 * - stubs – zaślepki
 * - influenced – pod wpływem
 * - interference – ingerencja
 * <p>
 * ---
 * <p>
 * - involved – zaangażowany
 * - reach – zasięg
 * - contains – zawiera
 * - is met – jest spełniony
 * - although – chociaż
 * - simplified – uproszczony
 * - particular conditions – szczególne warunki
 * - struggle – walka
 * - layer – warstwa
 * - earlier – wcześniej
 * <p>
 * ---
 * <p>
 * - valuable - cenny
 * - appropriate - odpowiedni
 * - suspect - podejrzany
 * - security constraints - ograniczenia bezpieczeństwa
 * - frame - rama
 * - according - według
 * - provided - zapewnione
 * - increasingly - coraz bardziej
 * - rewinding - przewijanie
 * - suppose you stepped into - załóżmy, że wkroczyłeś do
 * - particular - konkretny
 * - don’t suspend - nie zawieszaj
 * - a likely suspect - prawdopodobny podejrzany
 * - allow - umożliwić
 * <p>
 * - Raising alarms - Podnoszenie alarmów
 * - particular - szczególowe
 * - pinpoint where - wskazać gdzie
 * - valuable hints - cenne wskazówki
 * - Investigating issues - Badanie problemów
 * - examine - zbadać
 * - the present - teraźniejszość
 * - certain - pewna
 * - occurred - wystąpił
 * <p>
 * ---
 * <p>
 * - **Spring Start Here** (Manning, 2021), Chapter 6
 */
