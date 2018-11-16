package polimorfizm;

public class RunPolymorphism {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        A b1 = new B();
        B b2 = new B();
        b1.m1();
        b1.m2(); // набор методов которые можно вызвать определяется типом ссылки класса ("А" которая в начале строки)
        b2.m1();
        b2.m2();
        A c1 = new C();
        B c2 = new C();
        C c3 = new C();
        c1.m1(); // Реализация будет взята из второго класса, который справа в строке
        c1.m2();
        c2.m1();
        c2.m2();
        c2.m3();
        c3.m1();
        c3.m2();
        c3.m3();
    }
}
