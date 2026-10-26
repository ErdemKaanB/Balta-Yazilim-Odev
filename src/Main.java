void main() {
    double vize1 = 60.0;
    double vize2 = 70.0;
    double finalNotu = 75.0;
    double ortalama = vize1 * 0.25 + vize2 * 0.25 + finalNotu * 0.50;
    System.out.println("Ortalamanız: " + ortalama);

    if (ortalama < 50) {
        System.out.println("Kaldın.");
    } else if (ortalama < 75) {
        System.out.println("Geçtin.");
    } else if (ortalama <= 85) {
        System.out.println("Teşekkür belgesi aldın.");
    } else {
        System.out.println("Takdir belgesi aldın.");
    }
}