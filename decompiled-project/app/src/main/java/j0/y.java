package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ y[] f18563a;

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j0.y, java.lang.Enum] */
    static {
        y[] yVarArr = {new Enum("CounterClockwise", 0), new Enum("Clockwise", 1)};
        f18563a = yVarArr;
        Z9.x.k(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f18563a.clone();
    }
}
