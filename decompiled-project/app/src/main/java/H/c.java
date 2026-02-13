package H;

/* loaded from: classes.dex */
public abstract class c {
    static {
        float f4 = 50;
        if (f4 < 0.0f || f4 > 100.0f) {
            B.a.a("The percent should be in the range of [0, 100]");
        }
    }

    public static final b a(float f4) {
        a aVar = new a(f4);
        return new b(aVar, aVar, aVar, aVar);
    }
}
